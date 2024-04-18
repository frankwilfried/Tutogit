package paarezusammen;
import java.time.Duration;

public class Termin {

    private String  name ;
    java.time.LocalTime start;
    java.time.LocalTime ende;
    public  Termin(String name, java.time.LocalTime start,java.time.LocalTime ende){
        this.name= name;
        this.start = start;
        this.ende= ende;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public String getInfo (){
    String info = "name " + name + " start " + start + " ende " + ende ;
    return info;
}
public int getDauer (){
  Duration  dauer =  Duration.between(start, ende) ;
    int minutes = (int) ((dauer.toMinutes() % 60));
    return minutes;
}
    }
