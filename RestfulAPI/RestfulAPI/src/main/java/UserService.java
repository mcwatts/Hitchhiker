
//import java.util.HashMap;
import java.util.*;

public class UserService {
    private Map<String, User> users = new HashMap<String, User>();

    public List<User> getAllUsers(){
        return new ArrayList<User>(users.values());
    }

    public User getUser(String id){
        return users.get(id);
    }
    public User createUser(String name, String start, String end){
        check(name, start, end);
        User user = new User(name, start, end);
        users.put(user.getId(), user);
        return user;
    }

    public User updateUser(String id, String name, String start, String end){
        User user = users.get(id);
        if(user == null){
            throw new IllegalArgumentException("User with ID:" + id + " cannot be found.");
        }
        check(name, start, end);
        user.setName(name);
        user.setStartLoc(start);
        user.setDestination(end);
        return user;
    }

    private void check(String name, String start, String end){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Parameter 'name' cannot be empty");
        }
        if(start == null || start.isEmpty()){
            throw new IllegalArgumentException("Parameter starting location cannot be empty");
        }
        if(end == null || end.isEmpty()){
            throw new IllegalArgumentException("Parameter final destination cannot be empty");
        }
    }
}
