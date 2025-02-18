package data.models;


public class TrackingInfo {
    private int id;
    private int itemId;
    private String message;

//


    public String getInfo() {
        return message;
    }

    public void setInfo(String message) {
        this.message = message;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getTrackingInfoId() {
        return id;
    }

    public void setTrackingInfoId(int id) {
        this.id = id;
    }
}
