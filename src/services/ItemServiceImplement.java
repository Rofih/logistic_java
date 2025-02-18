package services;

import data.models.Item;
import data.models.TrackingInfo;
import data.repositries.Items;
import data.repositries.TrackingInfos;

public class ItemServiceImplement implements ItemService{

    private TrackingInfos trackingInfos = new TrackingInfos();
    private Items items;

    public ItemServiceImplement(Items items) {
        this.items = items;
    }

    private TrackingInfoServiceImplement trackingInfoServiceImplement = new TrackingInfoServiceImplement(trackingInfos);
    @Override
    public Item createNewPackage(String description,int weightInGrams){
        Item item = new Item();
        item.setDescription(description);
        item.setWeightInGrams(weightInGrams);
        Item savedItem = items.save(item);
        trackingInfoServiceImplement.createTrackingInfo(savedItem);
        return savedItem;
    }

    @Override
    public long getNumberOfItem(){
        return items.count();
    }
}
