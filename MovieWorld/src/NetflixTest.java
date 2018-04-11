import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NetflixTest {

    private Netflix netflix;
    @Before
    public void init() {
        netflix = new Netflix();
    }

    @Test
    public void calculateGrossProfit() {
        netflix.setUrl("www.netflix.com");
        netflix.setDownloads(1000);
        netflix.calculateGrossProfit();
    }
}