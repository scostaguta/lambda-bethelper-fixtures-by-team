package cl.bethelper.main.handler;

import cl.bethelper.main.dto.RequestFixturesDTO;
import cl.bethelper.main.util.BetBusinessUtil;
import cl.bethelper.main.util.JSONUtil;
import cl.bethelper.main.util.StringUtil;
import cl.bethelper.main.vo.Response;
import cl.bethelper.main.vo.Root;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class FixturesByTeamHandler implements RequestHandler<RequestFixturesDTO, Object> {

    @Override
    public Root handleRequest(RequestFixturesDTO input, Context context) {
        LambdaLogger logger = context.getLogger();

        logger.log("Recibiendo " + input.toString());

        Root root = new Root();
        try{
            if (!StringUtil.validateInputFixtures(input)){
                logger.log("Se deben ingresar los valores de consulta");

                return root;
            }
            AmazonS3 s3Client = AmazonS3Client.builder().build();
            String keyName = BetBusinessUtil.getFixturesKeyName(input.getLeague(), input.getSeason());

            logger.log(" keyname -> " + keyName);
            logger.log(" bucketName -> " + BetBusinessUtil.BUCKET_FIXTURES);

            S3Object response = s3Client.
                    getObject(new GetObjectRequest(BetBusinessUtil.BUCKET_FIXTURES, keyName));
            InputStream objectData = response.getObjectContent();

            root = JSONUtil.readJSONFixtures(objectData);

            List<Response> fixtures = BetBusinessUtil.getFixturesByTeam(root,input.getId_team());
            List<Response> listMatchesMaxSort = BetBusinessUtil.getLastMatchesListSort(fixtures, 5);

            ArrayList<Response> arrListMatchesMaxSort = new ArrayList(listMatchesMaxSort);
            root.setResponse(arrListMatchesMaxSort);
        }catch (Exception e){
            logger.log("Error: " + e.getMessage());
        }
        return root;
    }
}
