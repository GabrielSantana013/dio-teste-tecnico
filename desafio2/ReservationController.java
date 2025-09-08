package desafio2;

import java.util.HashMap;
import java.util.Map;

public class ReservationController {

    private Map<Integer, Reservation> reservations = new HashMap<>();

    public boolean addReservation(String name, int hour){
        if (hour < 8 || hour > 18){
            System.out.println("Horário inválido, tente novamente.");
            return false;
        }

        if (reservations.containsKey(hour)) {
            System.out.println("Horário já reservado pelo cliente " + reservations.get(hour).getName());
            return false;
        }

        reservations.put(hour, new Reservation(name, hour));
        System.out.println("Reserva confirmada para: " + name + " às " + hour);
        return true;
    }

    public void showReservations(){
        if(reservations.isEmpty()){
            System.out.println("Nenhuma reserva cadastrada.");
            return;
        }
        System.out.println("====Reservas====");
        for(Reservation r: reservations.values()){
            System.out.println(r);
        }
    }
}
