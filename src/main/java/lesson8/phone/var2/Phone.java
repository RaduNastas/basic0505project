package lesson8.phone.var2;

import java.util.Scanner;

public class Phone {

    private String model;
    private String color;
    private String isSilent;

    public Phone(String model, String color, String isSilent) {
        this.model = model;
        this.color = color;
        this.isSilent = isSilent;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getIsSilent() {
        return isSilent;
    }

    public void setIsSilent(String isSilent) {
        this.isSilent = isSilent;
    }

    @Override

    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", isSilent='" + isSilent + '\'' +
                '}';
    }

}