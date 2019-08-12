package rentalstore;

public class HtmlStatement extends Statement {
    @Override
    protected String appendFooter(Customer customer) {
        return "<P>You owe<EM>" + String.valueOf(customer.getTotalAmount()) + "</EM><P>\n"
                + "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }

    @Override
    protected String appendBody(Rental each) {
        return each.getMovie().getTitle() + ": " + each.getAmount() + "<BR>\n";
    }

    @Override
    protected String appendHeader(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }
}
