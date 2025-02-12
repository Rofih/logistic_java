package data.repositries;

import static org.junit.jupiter.api.Assertions.*;

import data.models.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ItemsTest {
    @Test
    public void testThatCount_Returns_Zero(){
        Item item = new Item();
        int numberOfItems = item.count();
        int expected = 0;
        assertEquals(expected,numberOfItems);
    }

    @Test
    public void testThatCount_Returns_count_(){
        Item item = new Item();
        Item savedItem = item.save(new Item());
        int numberOfItems = item.count();
        int expected = 1;
        assertEquals(expected,numberOfItems);
    }
    //    @Test
//    public void testThatPackageInfo_CanUpdate(){
//        Item item = new Item();
//        Item savedItem = item.save(new Item());
//        savedItem.update("r");
//        String expected = "r";
//        assertEquals(expected,savedItem.getPackageInfo());
//    }
    @Test
    public void testThatAllItems_CanBeDeleted(){
        Item item = new Item();
        Item savedItem = item.save(new Item());
        Item savedItem2 = item.save(new Item());
        int numberOfItems = item.count();
        int expected = 2;
        assertEquals(expected,numberOfItems);
        item.deleteAll();
         int expected2 = 0;
        int numberOfItems2 = item.count();
        assertEquals(expected2,numberOfItems2);
    }

//    @Test
//    public void testThatAnItemExist(){
//        Item item = new Item();
//        Item savedItem = item.save(new Item());
//        int savedItemId = savedItem.getPackageId();
////        int expected = 1;
////        assertEquals(expected,savedItemId);
//        boolean answer = item.existsById(savedItemId);
//        assertTrue(answer);
//    }

    @Test
    public void testThatAnItemNotExist(){
        Item item = new Item();
        Item savedItem = item.save(new Item());
        boolean fakeItem = item.existsById(2);
        assertFalse(fakeItem);
    }



}
