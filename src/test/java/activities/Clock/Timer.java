package activities.Clock;

import controlsAppium.Button;
import controlsAppium.Label;
import org.openqa.selenium.By;

public class Timer {
    public Button number1Button = new Button(By.id("com.google.android.deskclock:id/timer_setup_digit_1"));
    public Button number2Button = new Button(By.id("com.google.android.deskclock:id/timer_setup_digit_2"));
    public Button number3Button = new Button(By.id("com.google.android.deskclock:id/timer_setup_digit_3"));
    public Button number4Button = new Button(By.id("com.google.android.deskclock:id/timer_setup_digit_4"));
    public Button number5Button = new Button(By.id("com.google.android.deskclock:id/timer_setup_digit_5"));
    public Label timeLabel = new Label(By.id("com.google.android.deskclock:id/timer_setup_time"));
}
