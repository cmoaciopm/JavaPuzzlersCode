package net.cmoaciopm.java.puzzlers;

public class AnimalFarm {
    private static final String pig2 = "length: 10";
    private static final String dog2 = "length: " + pig2.length();
    private static final String dog3 = "length: " + "10";
    public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();

        System.out.println("Animals are equal: " + pig == dog);
        System.out.println("Animals are equal: " + (pig == dog));
        System.out.println("Animals are equal: " + (pig2 == dog2));
        System.out.println("Animals are equal: " + (pig2 == dog3));
    }
}
