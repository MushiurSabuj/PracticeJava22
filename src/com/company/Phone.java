package com.company;

public class Phone {
    // default constructor
    public Phone(){
        System.out.println("default Constructor");
    }
    // custom constructor
    public Phone(String nameOfPhoneColor){
        System.out.println("built a color phone" + nameOfPhoneColor + "color");

    }
    public Phone (int numbers, String sizeOfPhone){
        System.out.println("production " + sizeOfPhone + numbers + " 12");

    }

    public static void main(String[] args) {
        String firstName;
        firstName = "David";

        Phone myBluePhone = new Phone("blue");
        myBluePhone.calling("Sadaf");
        Phone production = new Phone(256,"medium ");
        production.calling("ariya");

        Phone obj = new Phone();
        String message = obj.sendTex();
        int xy = obj.sendText2();
        obj.calling(firstName);
        System.out.println(message);
        System.out.println(xy);
    }
    public void calling( String name){
        System.out.println("calling: " + name);
    }

    public void music(){
        System.out.println("Play sweet music");
    }
    public void recording(){
        System.out.println("Can track for record");
    }
    public String sendTex(){
        String message = " Hi, Nice to meet you";
        return message;
    }
    public int sendText2(){
        int xy = 123;
        return xy;
    }
}
