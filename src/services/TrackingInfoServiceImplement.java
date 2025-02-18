package services;

import data.models.Item;
import data.models.TrackingInfo;
import data.repositries.TrackingInfos;

public class TrackingInfoServiceImplement implements TrackingInfoService {

    private TrackingInfos trackingInfos;
    public TrackingInfoServiceImplement(TrackingInfos trackingInfos) {
        this.trackingInfos = trackingInfos;
    }



    @Override
    public TrackingInfo createTrackingInfo(Item item){
        TrackingInfo trackingInfo = new TrackingInfo();
        trackingInfo.setInfo(item.getDescription());
        trackingInfo.setItemId(item.getId());
        return trackingInfos.save(trackingInfo);
    }

    @Override
    public int getNumberOfTrackingInfo(){
        return trackingInfos.count();
    }
}
