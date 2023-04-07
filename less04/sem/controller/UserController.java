package GB_OOPnaJAVA.less04.sem.controller;

import GB_OOPnaJAVA.less04.sem.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
