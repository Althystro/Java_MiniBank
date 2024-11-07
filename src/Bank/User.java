package Bank;

public class User {
    private String username;
    private String password;
    private BankAccount account;


    public User(String username, String password) {

        setUsername(username);
        setPassword(password);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public void updateUsername (String newUsername){

        setUsername(newUsername);

    }
    public void updatePassword (String newPassword){

        setPassword(newPassword);

    }
    public void displayAccountDetails (){

getUsername();
    }

    @Override
    public String toString() {
        return username;
    }
}


