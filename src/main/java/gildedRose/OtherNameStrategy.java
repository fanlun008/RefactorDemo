package gildedRose;

public class OtherNameStrategy implements ItemStrategy {
    @Override
    public void updateItem(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }
}
