package GB_OOPnaJAVA.less05.sem.repository;

import GB_OOPnaJAVA.less05.sem.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserRepo {
    private List<User> db = new ArrayList<>();

    public UserRepo(List<User> db){
        this.db=new ArrayList<>();
    }

    public UserRepo(){}

    public void addToList(User user){
        db.add(user);
    }
    public void deleteFromRepo(User user){
        db.remove(user);
    }
    public User getUserRepo(User user){
        return db.get(user.getUserID());
    }
    public void saveUser(User user){
        try(FileWriter fileWriter = new FileWriter("text.txt", true)){
            fileWriter.write(user.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
