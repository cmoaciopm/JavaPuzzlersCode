package net.cmoaciopm.java.puzzlers;

public class Shifty {
    public static void main(String[] args) {
        System.out.println("-1 << 32 = " + (-1 << 32));
        System.out.println("-2 << 32 = " + (-2 << 32));
        System.out.println("-3 << 32 = " + (-3 << 32));
        int i = 0;
        while (-1 << i != 0)
            i++;
        System.out.println(i);
    }
}
