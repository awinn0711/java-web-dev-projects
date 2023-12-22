package org.Technology;

public class Main {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("Samsung", 2022, true, 3);
//        myPhone.noise();
        Laptop myLaptop = new Laptop("Lenovo", 2020, true);

        System.out.println(myPhone.getId());
        System.out.println(myLaptop.getId());
    }

}
