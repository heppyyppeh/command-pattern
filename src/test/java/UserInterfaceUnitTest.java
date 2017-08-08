import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class UserInterfaceUnitTest {


    @Test
    public void shouldTurnOnLightWhenUserPushesSwitch() {

        UserInterface userInterface = new UserInterface();

        userInterface.pushLightSwitch();

        assertTrue(userInterface.getLight().isOn());
    }


}