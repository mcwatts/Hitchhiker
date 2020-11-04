import java.util.UUID;

public class User {
    private String name;
    private String id;
    private String startLoc;
    private String destination;

    public User(String name, String startLoc, String destination){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.startLoc = startLoc;
        this.destination = destination;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getStartLoc(){
        return startLoc;
    }

    public void setStartLoc(String startLoc){
        this.startLoc = startLoc;
    }

    public String getDestination(){
        return destination;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }
}
