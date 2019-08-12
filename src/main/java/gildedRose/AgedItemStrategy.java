package gildedRose;

public class AgedItemStrategy implements ItemStrategy {
    @Override
    public void updateItem(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn--;
        if (item.sellIn < 0) {

            if (item.quality < 50) {
                item.quality++;
            }

        }
    }
}
