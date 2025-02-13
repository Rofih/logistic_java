package data.repositries;

import static org.junit.jupiter.api.Assertions.*;

import data.models.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;




class ItemsTest {

    @Test
    public void testThatItemsCanSaveItems() {
        Items items = new Items();
        Item item = new Item(1234,"Food","perishable",12);
        Item savedItem = items.save(item);
        long numberOfItems = items.count();
        assertEquals(1,numberOfItems);
        assertEquals(item,savedItem);
    }

    @Test
    public void testThatItemsCanFindById() {
        Items items = new Items();
        Item item = new Item(1234,"Food","perishable",12);
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
        Item item = new Item(1234,"Food","perishable",12);
        Item savedItem = items.save(item);
        items.delete(savedItem.getId());
        long numberOfItems = items.count();
        assertEquals(0,numberOfItems);
    }

    @Test
    public void deleteAll() {
        Items items = new Items();
        Item item = new Item(1234,"Food","perishable",12);
        Item item2 = new Item(1234,"Food","perishable",12);
        items.save(item);
        items.save(item2);
        items.deleteAll();
        long numberOfItems = items.count();
        assertEquals(0,numberOfItems);

    }

    @Test
    public void deleteAllById() {
        Items items = new Items();
        Item item = new Item(1234,"Food","perishable",12);
        Item item2 = new Item(1234,"Food","perishable",12);
        items.save(item);
        items.save(item2);
        items.deleteAllById(item.getId(),item2.getId());
        long numberOfItems = items.count();
        assertEquals(0,numberOfItems);

    }
}