package data.models;

import data.repositries.Items;

import java.util.ArrayList;

public class Item {
    private int packageId = generatePackageId();
    private String packageName;
    private String packageInfo;
    private int counter;
//    private ArrayList<Item> items = new ArrayList<Item>();
    private final Items item2 = new Items();
    private ArrayList<Item> items = item2.getItems();

    public int count() {
        return counter;
    }

    public Item save(Item item) {
//        if (isNew(item)){
            items.add(item);
            counter++;
//        }
//        else{
//           findById(ite)
//        }
        return item;
    }

    private boolean isNew(Item item) {
        for (Item pac : items) {
            if (item.getPackageId() != pac.getPackageId()) return true;
        }
        return false;
    }

//    public void update(String packageInfo2) {
//        this.packageInfo = packageInfo2;
//    }

    public void setPackageInfo(String packageInfo) {
        this.packageInfo = packageInfo;
    }

    public String getPackageInfo() {
        return packageInfo;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    public int getPackageId() {
        return packageId;
    }
    private int generatePackageId() {
        int key = 0;
        return ++key;
    }

//    public Item getPackageById(int packageId) {
//        for (Item pac : items) {
//            if (pac.getPackageId() == packageId) return pac;
//        }
//        return null;
//    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void deleteAll(){
        this.items.clear();
        counter = 0;
    }
    public void deleteAllById(int... ids){
        for (int id : ids) {
            for(Item item : items){
                if (item.getPackageId() == id){
                    items.remove(item);
                    counter--;
                }
            }
        }

    }

    public void deleteById(int id){
        for(Item item : items){
            if (item.getPackageId() == id){
                items.remove(item);
            }
        }
    }
    public boolean existsById(int id){
        for(Item item : items){
            if (item.getPackageId() == id){
                return true;
            }
        }
        return false;
    }
    public Item   findById(int id){
        for(Item item : items){
            if (item.getPackageId() == id){
                return item;
            }
        }
        return null;
    }
    public void findAllById(int ... ids){
        for (int id : ids) {
            findById(id);
        }
    }
//    private Reciever reciever;
//    private Sender sender;
}
