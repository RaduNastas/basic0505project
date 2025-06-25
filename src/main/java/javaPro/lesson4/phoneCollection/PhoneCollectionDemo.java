package javaPro.lesson4.phoneCollection;

import java.util.ArrayList;

public class PhoneCollectionDemo {

    public static void main(String[] args) {

        ArrayList<String> phones = new ArrayList<>();
        System.out.println("The list is empty " + phones);

        phones.add("iPhone 12");
        System.out.println("After adding one phone: " + phones);

        phones.add("Samsung Galaxy S21");
        phones.add("Google Pixel 6");
        phones.add("Xiaomi Redmi Note 11");
        phones.add("OnePlus 9");
        System.out.println("After adding up to five elements: " + phones);

        phones.remove(2);
        System.out.println("After deleting at index two: " + phones);

        phones.remove("OnePlus 9");
        System.out.println("After deleting by object: " + phones);

        phones.set(0, "iPhone 16 pro" );
        System.out.println("After set: " + phones);
        System.out.println("After set: " + phones.getFirst());
    }

}