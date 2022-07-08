package com.company;

public class Pen {
    public static void main(String[] args) {
        Pen obj = new Pen();
        obj.write();
        obj.paint();

    }
    public void write() {
        System.out.println("writing with pen");

}
public void paint(){
    System.out.println("I can paint using this pen");
}
}
