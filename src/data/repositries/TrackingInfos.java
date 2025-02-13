package data.repositries;

import data.models.TrackingInfo;

import java.util.ArrayList;


        import java.util.ArrayList;
import java.util.List;

public class TrackingInfos {
    private List<TrackingInfo> trackingInfos = new ArrayList<>();
    private int count;

    public TrackingInfo save(TrackingInfo trackingInfo) {
        if(existsById(trackingInfo.getTrackingInfoId())){
            update(trackingInfo);
        }
        else {
            trackingInfos.add(trackingInfo);
        }
        return trackingInfo;
    }
    public long count() {
        return trackingInfos.size();
    }
    private void generateId(TrackingInfo trackingInfo) {
        count++;
        trackingInfo.setTrackingInfoId(count);
    }
    public TrackingInfo[] saveAll(TrackingInfo ... trackingInfo) {
        for(TrackingInfo trackingIn : trackingInfo){
            this.save(trackingIn);
        }
        return trackingInfo;
    }

    public void update(TrackingInfo trackingInfo) {
        TrackingInfo update = findById(trackingInfo.getTrackingInfoId());
        update = trackingInfo;
    }

    public TrackingInfo findById(int id) {
        for (TrackingInfo trackingInfo : trackingInfos) {
            if (trackingInfo.getTrackingInfoId() == id) {
                return trackingInfo;
            }
        }
        return null;
    }
    public void delete(int id){
        TrackingInfo find = findById(id);
        trackingInfos.remove(find);
    }

    public void deleteAll(){
        trackingInfos.clear();
    }

    private boolean existsById(int id){
        TrackingInfo exists = findById(id);
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


