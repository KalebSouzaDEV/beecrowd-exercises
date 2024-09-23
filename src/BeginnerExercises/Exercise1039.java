package BeginnerExercises;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1039 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        float n1 = scanner.nextFloat();
        float n2 = scanner.nextFloat();
        float n3 = scanner.nextFloat();
        float n4 = scanner.nextFloat();

        float media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.printf("Media: %.1f\n", media);
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("Aluno em exame.");
            float notaExame = scanner.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", notaExame);
            float novaMedia = (media + notaExame) / 2;
            if (novaMedia >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", novaMedia);
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}


