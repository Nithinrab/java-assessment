package prg;

import java.util.Scanner;

public class count {

    public static void main(String[] args) throws Exception {

        java.io.File file = new java.io.File("data.txt");

        Scanner input = new Scanner(file);

        String fileContent = "HAPPY NEW YEAR";

        while (input.hasNext()) {
            fileContent += input.next() + "  HAPPY NEW YEAR";
        }
        input.close();

        char[] charArr = fileContent.toCharArray();

        int counter = 0;
        for (char c : charArr) {
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
                counter++;
        }

        System.out.println("Number of Vowels: " + counter);
    }
}