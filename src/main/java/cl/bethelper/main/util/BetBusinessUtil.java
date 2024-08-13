package cl.bethelper.main.util;

import cl.bethelper.main.vo.Response;
import cl.bethelper.main.vo.Root;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BetBusinessUtil {
    public static final String BUCKET_FIXTURES = "fixturesbucket";
    public static final String BUCKET_FIXTURES_KEY = "%league_id%-league/%season_id%-season/fixtures.json";
    public static final String BUCKET_FIXTURES_PATH= "%league_id%-league/%season_id%-season/stats";


    /**
     *
     * @param league
     * @param season
     * @return
     */
    public static String getFixturesKeyName(String league, String season){
        if (league == null || season==null) return null;
        String keyName = BUCKET_FIXTURES_KEY.
                replace("%league_id%", league).
                replace("%season_id%", season);

        return keyName;
    }

    /**
     *
     * @param fixture
     * @param id_team
     * @return
     */
    public static boolean findMatchByIDTeam(Response fixture, int id_team){
        if (fixture.getTeams().getHome().getId() == id_team) return true;
        if (fixture.getTeams().getAway().getId() == id_team) return true;
        return false;
    }

    /**
     *
     * @param fixture
     * @return
     */
    public static boolean isMatchFinished(Response fixture){
        //FT-AET-PEN => MATCH FINISHED
        if (fixture.getFixture().getStatus().getMyshort().equals("FT")
            || fixture.getFixture().getStatus().getMyshort().equals("AET")
            || fixture.getFixture().getStatus().getMyshort().equals("PEN")){
            return true;
        }
        return false;
    }

    /**
     *
     * @param lista
     * @param total
     * @return
     */
    public static List<Response> getLastMatchesListSort(List<Response> lista, int total){
        Collections.sort(lista,
                new ComparableSortingFixture());
        List<Response> firstNElementsList = lista.stream().limit(total).collect(Collectors.toList());
        return firstNElementsList;
    }


    /**
     *
     * @param root
     * @param id
     * @return
     */
    public static List<Response> getFixturesByTeam (Root root, String id){
        List<Response> fixtures = root.getResponse();
        List<Response> fixturesMatches = new ArrayList<>();

        int idTeam = Integer.parseInt(id);

        fixtures.forEach(fixture -> {
            try{
                boolean statusMatch = BetBusinessUtil.isMatchFinished(fixture);

                if (statusMatch && BetBusinessUtil.findMatchByIDTeam(fixture, idTeam)){
                    fixturesMatches.add(fixture);
                }
            }catch (Exception pe){
                System.out.println(" ERROR parsing : " + pe.getMessage());
            }

        });

        return fixturesMatches;
    }
}
