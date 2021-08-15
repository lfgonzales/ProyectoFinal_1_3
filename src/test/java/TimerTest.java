import activities.Clock.Main;
import activities.Clock.Timer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sessions.Session;

import java.net.MalformedURLException;

public class TimerTest {
    private Main mainActivity = new Main();
    private Timer timerActivity = new Timer();

    @Test
    public void testSetTime() throws MalformedURLException {
        mainActivity.timerButton.click();
        timerActivity.number1Button.click();
        timerActivity.number2Button.click();
        timerActivity.number3Button.click();
        timerActivity.number4Button.click();
        timerActivity.number5Button.click();
        String time = timerActivity.timeLabel.getText();

        Assertions.assertEquals("01h 23m 45s", time, "Tiempo incorrecto.");
    }

    @AfterEach
    public void close() throws MalformedURLException {
        Session.getInstance().close();
    }
}
