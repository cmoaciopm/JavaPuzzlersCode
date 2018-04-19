package net.cmoaciopm.java.puzzlers;

public class Oddity {
    public static boolean isOdd(int i) {
        return i % 2 == 1;
    }
    
    public static void main(String[] args) {
        System.out.println("2 is odd? " + isOdd(2));
        System.out.println("3 is odd? " + isOdd(3));
        System.out.println("-3 is odd? " + isOdd(-3));
    }
}
