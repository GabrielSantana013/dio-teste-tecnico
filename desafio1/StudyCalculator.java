package desafio1;

public class StudyCalculator {

    private final int GOAL = 20;
    private int[] hours;

    public StudyCalculator(int[] hours) {
        this.hours = hours;
    }

    public int calculateTotal(){
        int total = 0;
        for(int h: hours){
            total += h;
        }
        return total;
    }

    public double calculateAverage(){
        return (double) calculateTotal() / hours.length;
    }

    public boolean goalAchieved(){
        return calculateTotal() >= GOAL;
    }

    public void showReport(){

        System.out.println("====Relatório====");
        System.out.println("Dias de estudo: " + hours.length);

        System.out.println("Horas:");
        for(int h: hours){
            System.out.println(h + " ");
        }

        int total = calculateTotal();
        double average = calculateAverage();

        System.out.println("Total:" + total + " horas");
        System.out.printf("Média: %.2f horas p/ dia\n", average);
        System.out.println(goalAchieved() ? "Parabéns, meta atingida!" :
                "Estude mais da próxima vez! Meta não atingida.");

    }

}