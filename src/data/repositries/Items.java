package data.repositries;

import data.models.Item;

import java.util.ArrayList;





import java.util.ArrayList;
import java.util.List;

public class Items {
    private List<Item> items = new ArrayList<>();
    private int count;

    public Item save(Item item) {
        if(existsById(item.getId())){
            update(item);
        }
        else {
            items.add(item);
        }
        return item;
    }
    public long count() {
        return items.size();
    }
    private void generateId(Item item) {
        count++;
        item.setId(count);
    }
    public Item[] saveAll(Item[] items) {
        for(Item item : items){
            this.save(item);
        }
        return items;
    }

    public void update(Item item) {
        Item update = findById(item.getId());
        update = item;
    }

    public Item findById(int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
    public void delete(int id){
        Item find = findById(id);
        items.remove(find);
    }

    public void deleteAll(){
        items.clear();
    }

    private boolean existsById(int id){
        Item exists = findById(id);
        if(exists != null){
            return true;
        }
        return false;
    }
    public void deleteAllById(int ... ids){
        boolean found = false;
        for(int id : ids){
            if(existsById(id)){
                delete(id);
                found = true;
            }
            if(!found){
                throw new IllegalArgumentException("not found");
            }
        }

    }
}