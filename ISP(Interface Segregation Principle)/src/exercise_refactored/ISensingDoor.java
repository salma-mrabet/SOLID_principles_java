package exercise_refactored;

public interface ISensingDoor {
	
	void lock();

    void unlock();

    void open();

    void close();

    void proximityCallback() throws Exception;

}
