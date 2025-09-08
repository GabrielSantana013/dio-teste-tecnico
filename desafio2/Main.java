package desafio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReservationController c = new ReservationController();

        while(true){
            System.out.println("\n1 - Fazer reserva");
            System.out.println("2 - Listar reservas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch(option){
                case 1:
                    System.out.println("Digite o nome");
                    String name = sc.nextLine();
                    System.out.println("Digite a hora (8 às 18)");
                    int hour = sc.nextInt();
                    c.addReservation(name, hour);
                    continue;
                case 2:
                    c.showReservations();
                    continue;
                case 0:
                    System.out.println("Encerrando sistema...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida");
                    continue;
            }
        }

    }
}