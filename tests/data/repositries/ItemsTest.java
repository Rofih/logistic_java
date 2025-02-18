package data.repositries;

import static org.junit.jupiter.api.Assertions.*;

import data.models.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




class ItemsTest {

    @Test
    public void testThatItemsCanSaveItems() {
        Items items = new Items();
        Item item = new Item();
        item.setName("phone");
        item.setDescription("mobile device");
        item.setWeightInGrams(50);
        Item savedItem = items.save(item);
        long numberOfItems = items.count();
        assertEquals(1,numberOfItems);
//        assertEquals(item,savedItem);
    }

    @Test
    public void testThatItemsCanFindById() {
        Items items = new Items();
        Item item = new Item();
        item.setName("phone");
        item.setDescription("mobile device");
        item.setWeightInGrams(50);
        Item savedItem = items.save(item);
        savedItem = items.findById(savedItem.getId());
        long numberOfItems = items.count();
        assertEquals(1,numberOfItems);
        assertEquals(item,savedItem);
        assertEquals(savedItem,items.findById(savedItem.getId()));
    }

    @Test
    public void delete() {
        Items items = new Items();
        Item item = new Item();
        item.setName("phone");
        item.setDescription("mobile device");
        item.setWeightInGrams(50);
        Item savedItem = items.save(item);
        items.deleteById(savedItem.getId());
        long numberOfItems = items.count();
        assertEquals(0,numberOfItems);
    }

    @Test
    public void deleteAll() {
        Items items = new Items();
        Item item = new Item();
        item.setName("phone");
        item.setDescription("mobile device");
        item.setWeightInGrams(50);
        Item item2 = new Item();
        item2.setName("phone");
        item2.setDescription("mobile device");
        item2.setWeightInGrams(50);
        items.save(item);
        items.save(item2);
        items.deleteAll();
        long numberOfItems = items.count();
        assertEquals(0,numberOfItems);

    }

    @Test
    public void deleteAllById() {
        Items items = new Items();
        Item item = new Item();
        Item item2 = new Item();
        item.setName("phone");
        item.setDescription("mobile device");
        item.setWeightInGrams(50);
        item2.setName("phone");
        item2.setDescription("mobile device");
        item2.setWeightInGrams(50);
        items.save(item);
        items.save(item2);
        items.deleteAllById(item.getId(),item2.getId());
        long numberOfItems = items.count();
        assertEquals(0,numberOfItems);

    }
}