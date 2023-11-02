package exercise_refactored;

public interface ITimedDoor {
	
	void lock();

    void unlock();

    void open();

    void close();

    void timeOutCallback() throws Exception;

}
