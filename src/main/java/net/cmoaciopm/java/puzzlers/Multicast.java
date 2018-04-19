package net.cmoaciopm.java.puzzlers;

public class Multicast {
    public static void main(String[] args) {
        System.out.println((int) (char) (byte) -1);

        char c = 0xFFFF;
        System.out.println((int)c); // Sign extension is not performed
        System.out.println((short)c); // Cast causes sign extension
        System.out.println((int)(short)c);
    }
}
