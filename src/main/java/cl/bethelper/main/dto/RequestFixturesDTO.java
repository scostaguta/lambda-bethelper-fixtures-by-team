package cl.bethelper.main.dto;

//@Data
public class RequestFixturesDTO {
    private String id_team;
    private String league;
    private String season;

    public String getId_team() {
        return id_team;
    }

    public void setId_team(String id_team) {
        this.id_team = id_team;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "RequestFixturesDTO{" +
                "id_team='" + id_team + '\'' +
                ", league='" + league + '\'' +
                ", season='" + season + '\'' +
                '}';
    }
}
