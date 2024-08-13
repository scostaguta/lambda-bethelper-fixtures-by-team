package cl.bethelper.main.vo; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class League{
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
    @JsonProperty("country") 
    public String getCountry() { 
		 return this.country; } 
    public void setCountry(String country) { 
		 this.country = country; } 
    String country;
    @JsonProperty("logo") 
    public String getLogo() { 
		 return this.logo; } 
    public void setLogo(String logo) { 
		 this.logo = logo; } 
    String logo;
    @JsonProperty("flag") 
    public Object getFlag() { 
		 return this.flag; } 
    public void setFlag(Object flag) { 
		 this.flag = flag; } 
    Object flag;
    @JsonProperty("season") 
    public int getSeason() { 
		 return this.season; } 
    public void setSeason(int season) { 
		 this.season = season; } 
    int season;
    @JsonProperty("round") 
    public String getRound() { 
		 return this.round; } 
    public void setRound(String round) { 
		 this.round = round; } 
    String round;
}
