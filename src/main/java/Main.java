public class Main {
    public static void main(String[] args) {

        int ticketPrice = 15_000;

        int ticketEvery = 20;

        int bonus = ticketPrice / ticketEvery;

        System.out.println("Количество бонусных миль " + bonus);
    }
}
