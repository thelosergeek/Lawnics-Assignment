package in.thelosergeek.lawnicsassignment;

public class Model {

    String pImage,pID, pTime;


    public void ModelHome() {
    }

    public void ModelHome(String pImage,String pID, String pTime) {

        this.pImage = pImage;
        this.pTime = pTime;
    }
    public String getpImage() {
        return pImage;
    }

    public void setpImage(String pImage) {
        this.pImage = pImage;
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime;
    }
    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }
}
