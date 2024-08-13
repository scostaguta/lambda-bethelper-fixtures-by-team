package cl.bethelper.main.vo; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Teams{
    @JsonProperty("home") 
    public Home getHome() { 
		 return this.home; } 
    public void setHome(Home home) { 
		 this.home = home; } 
    Home home;
    @JsonProperty("away") 
    public Away getAway() { 
		 return this.away; } 
    public void setAway(Away away) { 
		 this.away = away; } 
    Away away;
}
