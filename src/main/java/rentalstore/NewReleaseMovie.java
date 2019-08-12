package rentalstore;

public class NewReleaseMovie extends Movie{
    @Override
    public double getAmount(Rental rental) {
        double thisAmount = 0;
        thisAmount += rental.getDayRented() * 3;
        return thisAmount;
    }

    public NewReleaseMovie(String title) {
        super(title);
    }
}
