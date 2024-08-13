package cl.bethelper.main.vo; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Goals{
    @JsonProperty("home") 
    public Object getHome() { 
		 return this.home; } 
    public void setHome(Object home) { 
		 this.home = home; } 
    Object home;
    @JsonProperty("away") 
    public Object getAway() { 
		 return this.away; } 
    public void setAway(Object away) { 
		 this.away = away; } 
    Object away;
}
