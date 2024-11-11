package Java_Code;

import java.util.Random;

public class Random_Number_Range {
    public static void main(String[] args) {
        // to generate randome number within upperbound
        Random r = new Random();
        int random = r.nextInt(10000);
        System.out.println(random);
    }
}
