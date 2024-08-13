package cl.bethelper.main.vo; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Venue{
    @JsonProperty("id") 
    public int getId() { 
		 return this.id; } 
    public void setId(int id) { 
		 this.id = id; } 
    int id;
    @JsonProperty("name") 
    public String getName() { 
		 return this.name; } 
    public void setName(String name) { 
		 this.name = name; } 
    String name;
    @JsonProperty("city") 
    public String getCity() { 
		 return this.city; } 
    public void setCity(String city) { 
		 this.city = city; } 
    String city;
}
