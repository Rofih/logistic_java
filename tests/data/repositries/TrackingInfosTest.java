package data.repositries;

import static org.junit.jupiter.api.Assertions.*;
import data.models.TrackingInfo;
import org.junit.jupiter.api.Test;

public class TrackingInfosTest {
    @Test
    public void SaveTrackingInfo() {
        TrackingInfos trackingInfos = new TrackingInfos();
        TrackingInfo trackingInfo = new TrackingInfo(1234,"Rofih");
        TrackingInfo savedItem = trackingInfos.save(trackingInfo);
        long numberOfItems = trackingInfos.count();
        assertEquals(1,numberOfItems);
        assertEquals(trackingInfo,savedItem);
    }

    @Test
    public void FindById() {
        TrackingInfos trackingInfos = new TrackingInfos();
        TrackingInfo trackingInfo = new TrackingInfo(1234,"Rofih");
        TrackingInfo savedItem = trackingInfos.save(trackingInfo);
        savedItem = trackingInfos.findById(savedItem.getTrackingInfoId());
        long numberOfItems = trackingInfos.count();
        assertEquals(1,numberOfItems);
        assertEquals(trackingInfo,savedItem);
        assertEquals(savedItem,trackingInfos.findById(savedItem.getTrackingInfoId()));
    }

    @Test
    public void delete() {
        TrackingInfos trackingInfos = new TrackingInfos();
        TrackingInfo trackingInfo = new TrackingInfo(1234,"jesse");
        TrackingInfo savedItem = trackingInfos.save(trackingInfo);
        trackingInfos.delete(savedItem.getTrackingInfoId());
        long numberOfItems = trackingInfos.count();
        assertEquals(0,numberOfItems);
    }

    @Test
    public void deleteAll() {
        TrackingInfos trackingInfos = new TrackingInfos();
        TrackingInfo trackingInfo = new TrackingInfo(1234,"Rofih");
        TrackingInfo trackingIn = new TrackingInfo(1234,"Rofih");
        TrackingInfo[] saveItems = trackingInfos.saveAll(trackingInfo,trackingIn);
        trackingInfos.deleteAll();
        long numberOfItems = trackingInfos.count();
        assertEquals(0,numberOfItems);

    }

    @Test
    public void deleteAllById() {
        TrackingInfos trackingInfos = new TrackingInfos();
        TrackingInfo trackingInfo = new TrackingInfo(1234,"Rofih");
        TrackingInfo trackingIn = new TrackingInfo(1234,"Rofih");
        TrackingInfo[] saveItems = trackingInfos.saveAll(trackingInfo,trackingIn);
        trackingInfos.deleteAllById(trackingInfo.getTrackingInfoId(),trackingIn.getTrackingInfoId());
        long numberOfItems = trackingInfos.count();
        assertEquals(0,numberOfItems);

    }

}