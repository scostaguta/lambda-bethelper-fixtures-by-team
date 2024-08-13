package cl.bethelper.main.vo; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Parameters{
    @JsonProperty("league") 
    public String getLeague() { 
		 return this.league; } 
    public void setLeague(String league) { 
		 this.league = league; } 
    String league;
    @JsonProperty("season") 
    public String getSeason() { 
		 return this.season; } 
    public void setSeason(String season) { 
		 this.season = season; } 
    String season;
    @JsonProperty("timezone")
    public String getTimezone() {
        return this.timezone; }
    public void setTimezone(String timezone) {
        this.timezone = timezone; }
    String timezone;
}
