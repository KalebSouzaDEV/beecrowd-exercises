package BeginnerExercises;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2006 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int tipoCha = scanner.nextInt();
        int tipo1 = scanner.nextInt();
        int tipo2 = scanner.nextInt();
        int tipo3 = scanner.nextInt();
        int tipo4 = scanner.nextInt();
        int tipo5 = scanner.nextInt();

        int escolhidos = 0;
        ArrayList<Integer> tipos = new ArrayList<>(Arrays.asList(tipo1, tipo2, tipo3, tipo4, tipo5));
        for (int number: tipos) {
            if (number == tipoCha) {
                escolhidos++;
            }
        }
        System.out.println(escolhidos);
    }
}
