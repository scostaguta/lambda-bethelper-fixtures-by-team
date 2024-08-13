package cl.bethelper.main.vo; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Response{
    @JsonProperty("fixture") 
    public Fixture getFixture() { 
		 return this.fixture; } 
    public void setFixture(Fixture fixture) { 
		 this.fixture = fixture; } 
    Fixture fixture;
    @JsonProperty("league") 
    public League getLeague() { 
		 return this.league; } 
    public void setLeague(League league) { 
		 this.league = league; } 
    League league;
    @JsonProperty("teams") 
    public Teams getTeams() { 
		 return this.teams; } 
    public void setTeams(Teams teams) { 
		 this.teams = teams; } 
    Teams teams;
    @JsonProperty("goals") 
    public Goals getGoals() { 
		 return this.goals; } 
    public void setGoals(Goals goals) { 
		 this.goals = goals; } 
    Goals goals;
    @JsonProperty("score") 
    public Score getScore() { 
		 return this.score; } 
    public void setScore(Score score) { 
		 this.score = score; } 
    Score score;

    @Override
    public String toString() {
        return "Response{" +
                "fixture=" + fixture +
                ", league=" + league +
                ", teams=" + teams +
                ", goals=" + goals +
                ", score=" + score +
                '}';
    }
}
