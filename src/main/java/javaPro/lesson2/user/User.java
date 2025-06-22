package javaPro.lesson2.user;

public class User {

    private String userLogin;
    private String email;
    private String password;

    public User(String userLogin, String email, String password) {
        this.userLogin = userLogin;
        this.email = email;
        this.password = password;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getEmail() {
        return email;
    }

    private boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    public void changePassword(String actualPassword, String newPassword) {
        if (validatePassword(actualPassword)) {
            this.password = newPassword;
        } else {
            System.out.println("incorecte date:");
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userLogin='" + userLogin + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}