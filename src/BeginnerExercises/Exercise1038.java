package BeginnerExercises;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise1038 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        int quantidade = scanner.nextInt();

        ArrayList<Double> tabela = new ArrayList<Double>();
        tabela.add(4.00);
        tabela.add(4.50);
        tabela.add(5.00);
        tabela.add(2.00);
        tabela.add(1.50);

        double valor = (tabela.get((id - 1)) * quantidade);
        System.out.printf("Total: R$ %.2f\n", Float.parseFloat(String.valueOf(valor)));
    }
}


