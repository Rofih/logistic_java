package data.repositries;

import data.models.Item;

public interface ItemsInterface {


    Item save(Item item);



    void update(Item item);


    Item findById(int id);

    void deleteById(int id);
}
