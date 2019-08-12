package rentalstore;

public abstract class Statement {
    public String statement(Customer customer) {
        String result = appendHeader(customer);
        for (Rental each : customer.getRentals()) {

            //show figures for this rental
            result += appendBody(each);
        }

        //add footer lines
        result += appendFooter(customer);
        return result;
    }

    protected abstract String appendFooter(Customer customer);

    protected abstract String appendBody(Rental each);

    protected abstract String appendHeader(Customer customer);
}
