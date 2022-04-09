public class Bonus {

    public int calculate(int ticketPrice) {

        int priceForMile = 20;
        int bonusMiles = ticketPrice / priceForMile;

        return bonusMiles;
    }
}
