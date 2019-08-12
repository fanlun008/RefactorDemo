package rentalstore;

public class TextStatement extends Statement{
//    public String statement(Customer customer) {
//        String result = appendHeader(customer);
//        for (Rental each : customer.getRentals()) {
//
//            //show figures for this rental
//            result += appendBody(each);
//        }
//
//        //add footer lines
//        result += appendFooter(customer);
//        return result;
//    }

    protected String appendFooter(Customer customer) {
        String result = "";
        result += "Amount owed is " + String.valueOf(customer.getTotalAmount()) + "\n";
        result += "You earned " + customer.getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    protected String appendBody(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" + each.getAmount() + "\n";
    }

    protected String appendHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }


}
