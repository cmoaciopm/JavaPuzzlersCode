package net.cmoaciopm.java.puzzlers;

class BigDelight {
    private static final byte TARGET = 0x90;
    public static void main(String[] args) {
        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
            if (b == 0x90)
                System.out.print("Joy!");
        }
    }
}
