package data.repositries;

import static org.junit.jupiter.api.Assertions.*;
import data.models.TrackingInfo;
import org.junit.jupiter.api.Test;

public class TrackingInfosTest {
    @Test
    public void SaveTrackingInfo() {
        TrackingInfos trackingInfos = new TrackingInfos();
        TrackingInfo trackingInfo = new TrackingInfo();
        trackingInfo.setInfo("just left aba");
        TrackingInfo savedItem = trackingInfos.save(trackingInfo);
        int numberOfItems = trackingInfos.count();
        assertEquals(1,numberOfItems);
        assertEquals(trackingInfo,savedItem);
    }

    @Test
    public void FindById() {
        TrackingInfos trackingInfos = new TrackingInfos();
        TrackingInfo trackingInfo = new TrackingInfo();
        trackingInfo.setInfo("just left aba");
        TrackingInfo savedItem = trackingInfos.save(trackingInfo);
        savedItem = trackingInfos.findById(savedItem.getTrackingInfoId());
        int numberOfItems = trackingInfos.count();
        assertEquals(1,numberOfItems);
        assertEquals(trackingInfo,savedItem);
        assertEquals(savedItem,trackingInfos.findById(savedItem.getTrackingInfoId()));
    }

    @Test
    public void delete() {
        TrackingInfos trackingInfos = new TrackingInfos();
        TrackingInfo trackingInfo = new TrackingInfo();
        trackingInfo.setInfo("just left aba");
        TrackingInfo savedItem = trackingInfos.save(trackingInfo);
        trackingInfos.delete(savedItem.getTrackingInfoId());
        long numberOfItems = trackingInfos.count();
        assertEquals(0,numberOfItems);
    }

    @Test
    public void deleteAll() {
        TrackingInfos trackingInfos = new TrackingInfos();
        TrackingInfo trackingInfo = new TrackingInfo();
        trackingInfo.setInfo("just left aba");
        TrackingInfo trackingInfo2 = new TrackingInfo();
        trackingInfo.setInfo("just left aba");
        TrackingInfo[] saveItems = trackingInfos.saveAll(trackingInfo, trackingInfo2);
        trackingInfos.deleteAll();
        int numberOfItems = trackingInfos.count();
        assertEquals(0,numberOfItems);

    }

    @Test
    public void deleteAllById() {
        TrackingInfos trackingInfos = new TrackingInfos();
        TrackingInfo trackingInfo = new TrackingInfo();
        trackingInfo.setInfo("just left aba");
        TrackingInfo trackingInfo2 = new TrackingInfo();
        trackingInfo.setInfo("just left aba");
        TrackingInfo[] saveItems = trackingInfos.saveAll(trackingInfo,trackingInfo2);
        trackingInfos.deleteAllById(trackingInfo.getTrackingInfoId(),trackingInfo2.getTrackingInfoId());
        int numberOfItems = trackingInfos.count();
        assertEquals(0,numberOfItems);

    }

}