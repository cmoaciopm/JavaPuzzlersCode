package net.cmoaciopm.java.puzzlers;

public class Tweedledee {
    public static void main(String[] args) {
        // Put your declarations for x and i here
        Object x = "Hello ";
        String i = "world!";
        x = x + i;  // Must be LEGAL
        x += i;     // Must be ILLEGAL
    }
}
