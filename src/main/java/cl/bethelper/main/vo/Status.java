package cl.bethelper.main.vo; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Status{
    @JsonProperty("long") 
    public String getMylong() { 
		 return this.mylong; } 
    public void setMylong(String mylong) { 
		 this.mylong = mylong; } 
    String mylong;
    @JsonProperty("short") 
    public String getMyshort() { 
		 return this.myshort; } 
    public void setMyshort(String myshort) { 
		 this.myshort = myshort; } 
    String myshort;
    @JsonProperty("elapsed") 
    public Object getElapsed() { 
		 return this.elapsed; } 
    public void setElapsed(Object elapsed) { 
		 this.elapsed = elapsed; } 
    Object elapsed;
}
