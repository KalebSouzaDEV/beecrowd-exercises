package Strings;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Exercise1120 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String digito = scanner.next();
        String number = scanner.nextLine();

        StringBuilder novaString = new StringBuilder();

        for (int i = 0; i < number.length(); i++){
            if (!String.valueOf(number.charAt(i)).equals(digito)) {
                novaString.append(number.charAt(i));
            }
        }
        String formatada = novaString.toString().replace(" ", "");
        if (formatada.length() > 0) {
            System.out.println(Integer.parseInt(formatada));
        }
    }
}
