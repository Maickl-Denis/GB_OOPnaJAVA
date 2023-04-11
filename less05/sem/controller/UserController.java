package GB_OOPnaJAVA.less05.sem.controller;

import GB_OOPnaJAVA.less05.sem.model.User;
import GB_OOPnaJAVA.less05.sem.service.UserService;

public class UserController {
   private UserService userService = new UserService();
    public void saveNewUser(int userID, String name, int age){
        userService.saveUser(new User(userID, name, age));
    }
    public void deleteUser(User user){
        userService.deleteUser(user);
    }

    public User getUser(User user){
        return userService.getUserFromRepo(user);
    }
    public void
}
