package gildedRose;

public class BackstageItemStrategy implements ItemStrategy {
    @Override
    public void updateItem(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}
