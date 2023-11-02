package exercise_refactored;

import java.util.Random;

public class Sensor
{
    public void register(ISensingDoor  door) throws Exception
    {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
