package gildedRose;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    public static final String AGED = "Aged Brie";
    public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String OTHERNAME = "othername";
    GildedRose gildedRose = null;

    @Before
    public void setup() {

    }

    @Test
    public void should_return_correct_result_given_ARGED_name_11_sellin_50_qulity() {
        Item[] items = new Item[] {new Item(AGED, 11, 50)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Aged Brie, 10, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_correct_result_given_ARGED_name_11_sellin_49_qulity() {
        Item[] items = new Item[] {new Item(AGED, 11, 49)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Aged Brie, 10, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_correct_result_given_ARGED_name_less_than_0_sellin_50_qulity() {
        Item[] items = new Item[] {new Item(AGED, -1, 48)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Aged Brie, -2, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_correct_result_given_ARGED_name_11_sellin_51_qulity() {
        Item[] items = new Item[] {new Item(AGED, -1, 51)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Aged Brie, -2, 51", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_correct_result_given_BACKSTAGE_name_10_sellin_49_qulity() {
        Item[] items = new Item[] {new Item(BACKSTAGE, 10, 49)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_correct_result_given_BACKSTAGE_name_10_sellin_48_qulity() {
        Item[] items = new Item[] {new Item(BACKSTAGE, 10, 48)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_correct_result_given_BACKSTAGE_name_4_sellin_47_qulity() {
        Item[] items = new Item[] {new Item(BACKSTAGE, 4, 47)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 3, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_correct_result_given_BACKSTAGE_name_0_sellin_50_qulity() {
        Item[] items = new Item[] {new Item(BACKSTAGE, 0, 50)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_correct_result_given_SULFURAS_name_lessthan_0_sellin_49_qulity() {
        Item[] items = new Item[] {new Item(SULFURAS, -1, 49)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, -1, 49", gildedRose.items[0].toString());
    }

    @Test
    public void should_return_correct_result_given_OTHERNAME_name_lessthan_lessthan_0_sellin_49_qulity() {
        Item[] items = new Item[] {new Item(OTHERNAME, -1, 49)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("othername, -2, 47", gildedRose.items[0].toString());
    }
}