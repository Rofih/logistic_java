package data.repositries;

import data.models.TrackingInfo;

public interface TrackingInfosInterface {

    TrackingInfo save(TrackingInfo trackingInfo);
    public TrackingInfo[] saveAll(TrackingInfo ... trackingInfo);
    public TrackingInfo findById(int id);
    public void delete(int id);
}
