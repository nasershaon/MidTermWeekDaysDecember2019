package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.

    public static void main(String[] args) {
        Random num = new Random();
        int heightNumber = 8;
        int randomNumber = num.nextInt(heightNumber);
        System.out.println("Random Int Value from 1 to 8 : >>"+(randomNumber+1));

    }

}
