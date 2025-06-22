package javaBasis.lesson8.phone.var1;

public class PhoneDemo {

    public static void main(String[] args) {

        Phone phone = new Phone("Samsung", "black", "Enable");
        System.out.println(phone);

        phone.changeSilentStatus();
        System.out.println("New phone silent status: ");
        System.out.println(phone);
    }

}