package GB_OOPnaJAVA.less05.sem.view;

import GB_OOPnaJAVA.less05.sem.controller.UserController;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter ur data");

        userController.saveNewUser(scanner.nextInt(), scanner.nextLine(),scanner.nextInt());
        userController.addUserTo
    }
}
