package services;

import data.models.Item;
import data.models.TrackingInfo;
import data.repositries.TrackingInfos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackingInfoServiceTest {

    @Test
    public void testIf_ICanCreateTrackingInfo() {
        TrackingInfos trackingInfos = new TrackingInfos();
        Item item = new Item();
        TrackingInfoServiceImplement trackingInfoServiceImplement = new TrackingInfoServiceImplement(trackingInfos);
        TrackingInfo newTrackingInfo = trackingInfos.save(trackingInfoServiceImplement.createTrackingInfo(item));
        int expected = 1;
        assertEquals(expected,trackingInfos.count());
    }

}