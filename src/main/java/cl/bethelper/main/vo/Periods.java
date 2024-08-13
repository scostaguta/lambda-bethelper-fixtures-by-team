package cl.bethelper.main.vo; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Periods{
    @JsonProperty("first") 
    public Object getFirst() { 
		 return this.first; } 
    public void setFirst(Object first) { 
		 this.first = first; } 
    Object first;
    @JsonProperty("second") 
    public Object getSecond() { 
		 return this.second; } 
    public void setSecond(Object second) { 
		 this.second = second; } 
    Object second;
}
