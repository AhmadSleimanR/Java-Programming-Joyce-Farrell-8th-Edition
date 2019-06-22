package democandles;

/**
 *
 * @author Lycan
 */
public class ScentedCandle extends Candle{
    private String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
    @Override
    public void setHeight(int height){
        this.height = height;
        this.price = height * 0.393701 * 3;
    }
}
