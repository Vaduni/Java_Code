package Java_Code;

import java.util.Random;

public class Random_Number_Range {
    public static void main(String[] args) {
        // to generate random number within upperbound
        Random r = new Random();
        int random = r.nextInt(1000);
        System.out.println(random);
    }
}
