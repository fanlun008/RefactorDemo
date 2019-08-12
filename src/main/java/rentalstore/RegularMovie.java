package rentalstore;

public class RegularMovie extends Movie {
    @Override
    public double getAmount(Rental rental) {
        double thisAmount = 0;
        thisAmount += 2;
        if (rental.getDayRented() > 2) {
            thisAmount += (rental.getDayRented() - 2) * 1.5;
        }
        return thisAmount;
    }

    public RegularMovie(String title) {
        super(title);
    }
}
