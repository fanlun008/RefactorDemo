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
    public void test01() {
        Item[] items = new Item[] {new Item(AGED, 11, 50)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Aged Brie, 10, 50", gildedRose.items[0].toString());
    }

    @Test
    public void test02() {
        Item[] items = new Item[] {new Item(AGED, 11, 49)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Aged Brie, 10, 50", gildedRose.items[0].toString());
    }

    @Test
    public void test03() {
        Item[] items = new Item[] {new Item(AGED, -1, 48)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Aged Brie, -2, 50", gildedRose.items[0].toString());
    }

    @Test
    public void test04() {
        Item[] items = new Item[] {new Item(AGED, -1, 48)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
    }

    @Test
    public void test05() {
        Item[] items = new Item[] {new Item(BACKSTAGE, 10, 49)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50", gildedRose.items[0].toString());
    }

    @Test
    public void test06() {
        Item[] items = new Item[] {new Item(BACKSTAGE, 10, 48)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 50", gildedRose.items[0].toString());
    }

    @Test
    public void test07() {
        Item[] items = new Item[] {new Item(BACKSTAGE, 4, 47)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 3, 50", gildedRose.items[0].toString());
    }

    @Test
    public void test08() {
        Item[] items = new Item[] {new Item(BACKSTAGE, 0, 50)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", gildedRose.items[0].toString());
    }

    @Test
    public void test09() {
        Item[] items = new Item[] {new Item(SULFURAS, -1, 49)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, -1, 49", gildedRose.items[0].toString());
    }

    @Test
    public void test010() {
        Item[] items = new Item[] {new Item(OTHERNAME, -1, 49)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();
        System.out.println(gildedRose.items[0]);
        Assert.assertEquals("othername, -2, 47", gildedRose.items[0].toString());
    }
}