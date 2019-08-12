package rentalstore;

public abstract class BasicMovie {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BasicMovie(String title) {
        this.title = title;
    }

    public abstract double getAmount(Rental rental);
}
