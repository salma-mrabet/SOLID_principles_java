package exercise;

public interface Door
{
    void lock();

    void unlock();

    void open();

    void close();

    void timeOutCallback() throws Exception;

    void proximityCallback() throws Exception;
}
