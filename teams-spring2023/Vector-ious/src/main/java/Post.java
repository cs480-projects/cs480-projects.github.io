public class Post {
    private String postMessage;
    private Room roomListing;


    public Post(String userMessage, Room userRoomListing) {
        this.postMessage = userMessage;
        this.roomListing = userRoomListing;
    }

    public String getPostMessage() {
        return this.postMessage;
    }

    public Room getRoom() {
        return this.roomListing;
    }

    public void setPostMessage(String userMessage) {
        this.postMessage = userMessage;
    }

    public void setRoom(Room userRoomListing) {
        this.roomListing = userRoomListing;
    }
}
