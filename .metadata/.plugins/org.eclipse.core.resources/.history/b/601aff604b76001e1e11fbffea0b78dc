package exercise;

import java.util.TimerTask;

public class Timer
{
    public void register(long timeOut, final Door door)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                try {
					door.timeOutCallback();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }, timeOut);
    }
}
