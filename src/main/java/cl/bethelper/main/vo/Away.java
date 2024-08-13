package cl.bethelper.main.vo; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Away{
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
    @JsonProperty("logo") 
    public String getLogo() { 
		 return this.logo; } 
    public void setLogo(String logo) { 
		 this.logo = logo; } 
    String logo;
    @JsonProperty("winner") 
    public Object getWinner() { 
		 return this.winner; } 
    public void setWinner(Object winner) { 
		 this.winner = winner; } 
    Object winner;
}
