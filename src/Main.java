public class Main {

    public static void main(String[] args) {

        Bonus service = new Bonus();

        int resultOne = service.calculate(500);
        System.out.println(resultOne);

        int resultTwo = service.calculate(1000);
        System.out.println(resultTwo);

        int resultThree = service.calculate(10000);
        System.out.println(resultThree);

        int resultFour = service.calculate(100_000);
        System.out.println(resultFour);
    }




//    public static void main(String[] args) {
//
//        int ticketPrice = 500;
//        int priceForMile = 20;
//
//        int bonusMiles = ticketPrice / priceForMile;
//        System.out.println(bonusMiles);
}
