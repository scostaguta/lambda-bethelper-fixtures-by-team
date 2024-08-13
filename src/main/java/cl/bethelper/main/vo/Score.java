package cl.bethelper.main.vo; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Score{
    @JsonProperty("halftime") 
    public Halftime getHalftime() { 
		 return this.halftime; } 
    public void setHalftime(Halftime halftime) { 
		 this.halftime = halftime; } 
    Halftime halftime;
    @JsonProperty("fulltime") 
    public Fulltime getFulltime() { 
		 return this.fulltime; } 
    public void setFulltime(Fulltime fulltime) { 
		 this.fulltime = fulltime; } 
    Fulltime fulltime;
    @JsonProperty("extratime") 
    public Extratime getExtratime() { 
		 return this.extratime; } 
    public void setExtratime(Extratime extratime) { 
		 this.extratime = extratime; } 
    Extratime extratime;
    @JsonProperty("penalty") 
    public Penalty getPenalty() { 
		 return this.penalty; } 
    public void setPenalty(Penalty penalty) { 
		 this.penalty = penalty; } 
    Penalty penalty;
}
