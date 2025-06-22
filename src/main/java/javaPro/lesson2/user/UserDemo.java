package javaPro.lesson2.user;

public class UserDemo {

    public static void main(String[] args) {

        User user = new User("Vlad", "vlad@gmail.mail", "password123");
        System.out.println(user);

        user.changePassword("password123", "password");
        System.out.println(user);
    }

}