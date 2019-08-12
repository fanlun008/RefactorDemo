package rentalstore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public List<Rental> getRentals() {
        return rentals;
    }

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental each : this.rentals) {

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getAmount() + "\n";
        }

        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    protected int getTotalFrequentRenterPoints() {
        int frequentRenterPoints = 0;
        for (Rental each : this.rentals) {
            frequentRenterPoints++;
            if ((each.getMovie() instanceof NewReleaseMovie) && each.getDayRented() > 1) {
                frequentRenterPoints++;
            }
        }
        return frequentRenterPoints;
    }

    protected double getTotalAmount() {
        return this.rentals.stream().mapToDouble(Rental::getAmount).sum();
    }
}
