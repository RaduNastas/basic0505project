package javaBasis.lesson8.phone.var2;

public class PhoneDemo {

    public static void main(String[] args) {

        PhoneService phoneService = new PhoneService();

        Phone phone = new Phone("Nokia", "green", "disable");
        System.out.println(phone);

        phoneService.changeSilentStatus(phone);
        System.out.println("New phone silent status: ");
        System.out.println(phone);
    }

}