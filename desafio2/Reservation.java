package desafio2;

public class Reservation {

    private String name;
    private int hour;

    public Reservation(String name, int hour) {
        this.name = name;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public int getHour() {
        return hour;
    }

    @Override
    public String toString() {
        return "Reserva: " + name + " às " + hour + "h";
    }
}