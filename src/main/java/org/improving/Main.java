package org.improving;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean loop = true;
        while (loop) {
            System.out.print(">");
            var input = scanner.nextLine();

            if(input.equalsIgnoreCase("Exit")){
                System.out.println("Adieu mon ami");
                loop = false;
            }
            else {
                System.out.println(input);
            }
        }
    }
}
