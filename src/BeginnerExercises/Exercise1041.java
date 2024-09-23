package BeginnerExercises;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise1041 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        ArrayList<Integer> listaNumeros = new ArrayList<Integer>(Arrays.asList(n1, n2, n3));
        ArrayList<Integer> novaLista = new ArrayList<>(Arrays.asList(n1, n2, n3));
        Collections.sort(novaLista);
        for (int numero: novaLista) {
            System.out.println(numero);
        }
        System.out.println("");
        for (int numero: listaNumeros) {
            System.out.println(numero);
        }
    }
}


