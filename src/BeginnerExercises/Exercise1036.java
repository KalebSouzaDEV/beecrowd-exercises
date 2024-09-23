package BeginnerExercises;

import java.io.IOException;
import java.util.Scanner;

public class Exercise1036 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        float delta = (float) (Math.pow(B, 2) - (4 * A * C));
        if (A == 0 || delta <= 0) {
            System.out.println("Impossivel calcular");
        } else {
            float r1 = (float) (-B + Math.sqrt(delta)) / (2 * A);
            float r2 = (float) (-B - Math.sqrt(delta)) / (2 * A);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
    }
}
