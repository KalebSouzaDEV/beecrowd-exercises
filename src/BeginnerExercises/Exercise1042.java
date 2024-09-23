package BeginnerExercises;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise1042 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (((a + b) > c) && ((b + c) > a) && ((c + a) > b)) {
            double perimetro = (a + b + c);
            System.out.println("Perimetro = " + perimetro);
        } else {
            double area = ((a + b) * c) / 2;
            System.out.println("Area = " + area);
        }
    }
}


