package gildedRose;

public class Item {

    public static final String AGED = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String OTHERNAME = "othername";

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public boolean isAgedName() {
        return this.name.equals(AGED);
    }

    public boolean isBackstageName() {
        return this.name.equals(BACKSTAGE);
    }

    public boolean isSulfurasName() {
        return this.name.equals(SULFURAS);
    }
}
