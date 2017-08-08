import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class LightUnitTest {

    @Test
    public void shouldTurnLightOn() {

        Light light = new Light();
        light.turnOn();

        assertTrue(light.isOn());
    }

    @Test
    public void shouldTurnLightOff() {

        Light light = new Light();

        light.turnOn();
        light.turnOff();

        assertFalse(light.isOn());
    }
}
