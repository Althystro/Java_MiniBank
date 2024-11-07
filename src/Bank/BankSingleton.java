package Bank;

import java.util.ArrayList;
import java.util.List;

public class BankSingleton {

    private static BankSingleton instance;
    private List<User> users=new ArrayList<>();

    private BankSingleton(){

    }



    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    public User createUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("Error");
                throw new NullPointerException("Parameter Type cannot be null");



            }
        }

        User newUser = new User(username, password);
        users.add(newUser);
        return newUser;
    }

    public User authenticate(String username, String password ) {

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Welcome");
                return user;

            }

        }
        return null;


    }
}
