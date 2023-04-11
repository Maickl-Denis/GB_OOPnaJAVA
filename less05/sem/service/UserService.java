package GB_OOPnaJAVA.less05.sem.service;

import GB_OOPnaJAVA.less05.sem.model.User;
import GB_OOPnaJAVA.less05.sem.repository.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser(User user){
        userRepo.saveUser(user);
    }

    public void deleteUser(User user){
        userRepo.deleteFromRepo(user);
    }
    public User getUserFromRepo(User user){
        return
    }
}
