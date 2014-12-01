package uk.me.paulswilliams.auction.tests;


import com.objogate.wl.swing.AWTEventQueueProber;
import com.objogate.wl.swing.driver.JFrameDriver;
import com.objogate.wl.swing.driver.JLabelDriver;
import com.objogate.wl.swing.gesture.GesturePerformer;
import uk.me.paulswilliams.auction.Main;

import static org.hamcrest.CoreMatchers.equalTo;
import static uk.me.paulswilliams.auction.MainWindow.SNIPER_STATUS_NAME;

public class AuctionSniperDriver extends JFrameDriver{
    public AuctionSniperDriver(int timeoutMillis) {
        super(new GesturePerformer(),
                JFrameDriver.topLevelFrame(named(Main.MAIN_WINDOW_NAME), showingOnScreen()),
                new AWTEventQueueProber(timeoutMillis, 100));
    }

    public void showsSniperStatus(String statusText) {
        new JLabelDriver(this, named(SNIPER_STATUS_NAME)).hasText(equalTo(statusText));
    }


}
