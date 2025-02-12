package data.models;

import java.util.ArrayList;

public class TrackingInfo {
    private int trackingId = generateTrackingId();
    private int itemId;
    private String message;
    private int counter;
    private ArrayList<TrackingInfo> infos = new ArrayList<TrackingInfo>();

    public int count(){
        return counter;
    }

    public TrackingInfo save(TrackingInfo info){
        if (isNew(info)){
            infos.add(info);
            counter++;
        }
        return info;

    }

    public boolean isNew(TrackingInfo info){
        for(TrackingInfo i : infos){
            if (i.get_trackingId() == info.get_trackingId()) return false;
        }
        return true;
    }

    private int get_trackingId() {
        return trackingId;
    }

    public int generateTrackingId(){
        int key = 0;
        return ++key;
    }


    public ArrayList<TrackingInfo> getInfos() {
        return infos;
    }

    public void deleteAll(){
        infos.clear();
        counter = 0;
    }

    public boolean existById(int id){
        for(TrackingInfo info : infos){
            if (info.get_trackingId() == id) return true;
        }
        return false;
    }


}
