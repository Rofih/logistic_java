package services;

import data.models.Item;
import data.models.TrackingInfo;

public interface TrackingInfoService {

    TrackingInfo createTrackingInfo(Item item);

    int getNumberOfTrackingInfo();
}
