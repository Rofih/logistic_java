package services;

import data.models.Item;
import data.repositries.Items;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemServiceTest {

    @Test
    public void testThatItemCan_BeCreated(){
        Items items = new Items();
        ItemServiceImplement itemServiceImplement = new ItemServiceImplement(items);
        String description = "Phone";
        int WeightInGrams = 50;
        Item savedItem = itemServiceImplement.createNewPackage(description,WeightInGrams);
        int expected = 1;
        assertEquals(expected,itemServiceImplement.getNumberOfItem());
    }

}