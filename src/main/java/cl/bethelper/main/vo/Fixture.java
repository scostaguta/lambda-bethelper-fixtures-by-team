package cl.bethelper.main.vo; 
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Fixture{
    @JsonProperty("id") 
    public int getId() { 
		 return this.id; } 
    public void setId(int id) { 
		 this.id = id; } 
    int id;
    @JsonProperty("referee") 
    public String getReferee() { 
		 return this.referee; } 
    public void setReferee(String referee) { 
		 this.referee = referee; } 
    String referee;
    @JsonProperty("timezone") 
    public String getTimezone() { 
		 return this.timezone; } 
    public void setTimezone(String timezone) { 
		 this.timezone = timezone; } 
    String timezone;
    @JsonProperty("date") 
    public Date getDate() {
		 return this.date; } 
    public void setDate(Date date) { 
		 this.date = date; } 
    Date date;
    @JsonProperty("timestamp") 
    public int getTimestamp() { 
		 return this.timestamp; } 
    public void setTimestamp(int timestamp) { 
		 this.timestamp = timestamp; } 
    int timestamp;
    @JsonProperty("periods") 
    public Periods getPeriods() { 
		 return this.periods; } 
    public void setPeriods(Periods periods) { 
		 this.periods = periods; } 
    Periods periods;
    @JsonProperty("venue") 
    public Venue getVenue() { 
		 return this.venue; } 
    public void setVenue(Venue venue) { 
		 this.venue = venue; } 
    Venue venue;
    @JsonProperty("status") 
    public Status getStatus() { 
		 return this.status; } 
    public void setStatus(Status status) { 
		 this.status = status; } 
    Status status;
}
