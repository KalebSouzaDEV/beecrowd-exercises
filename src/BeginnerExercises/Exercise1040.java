package BeginnerExercises;

import java.io.IOException;
import java.util.Scanner;

public class Exercise1040 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        System.out.println("x: " + x + " y:" + y);
        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            if (x == 0 && y == 0) {
                System.out.println("Origem");
            } else if (x == 0) {
                System.out.println("Eixo Y");
            } else if (y == 0) {
                System.out.println("Eixo X");
            }
        }
    }
}


