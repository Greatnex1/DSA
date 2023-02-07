package AdvancedDataStructure.Binary;

public class BitHack {


    public static void main(String[] args)
    {
        int n = 21;

        if ((n & 1) != 0) {
            System.out.println(n + " is odd");
        }
        else {
            System.out.println(n + " is even");
        }
    }
}
