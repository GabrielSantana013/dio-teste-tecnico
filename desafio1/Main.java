package desafio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int MAX_DAYS = 7;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de dias de estudo (max 7):");
        int days = sc.nextInt();

        while(days < 1 || days > MAX_DAYS){
            System.out.println("Quantidade inválida de dias, tente novamente.");
            days = sc.nextInt();
        }

        int hours[] = new int[days];

        for (int i = 0; i < days ; i++) {
            System.out.println("Digite as horas de estudo do dia " + (i+1) + ":");
            int h = sc.nextInt();

            while(h < 0 || h > 8){
                System.out.println("Valor inválido tente novamente.");
                h = sc.nextInt();
            }

            hours[i] = h;
        }

        StudyCalculator c = new StudyCalculator(hours);
        c.showReport();
        sc.close();
    }
}