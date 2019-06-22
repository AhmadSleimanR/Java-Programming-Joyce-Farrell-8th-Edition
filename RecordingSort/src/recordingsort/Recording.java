package recordingsort;

public class Recording {
    private String rTitle;
    private String rArtist;
    private int rPlayTime;

    public String getrTitle() {
        return rTitle;
    }

    public void setrTitle(String rTitle) {
        this.rTitle = rTitle;
    }

    public String getrArtist() {
        return rArtist;
    }

    public void setrArtist(String rArtist) {
        this.rArtist = rArtist;
    }

    public int getrPlayTime() {
        return rPlayTime;
    }

    public void setrPlayTime(int rPlayTime) {
        this.rPlayTime = rPlayTime;
    }
}
