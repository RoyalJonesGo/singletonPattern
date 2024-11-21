public class CentralQueue {
    private static CentralQueue instance;
    private int currentNumber;

    private CentralQueue() {
        this.currentNumber = 1;
    }

    //get singleton instance
    public static synchronized CentralQueue getInstance() {
        if (instance == null) {
            instance = new CentralQueue();
        }
        return instance;
    }

    //get the next queue
    public synchronized int getNextQueueNumber() {
        return currentNumber++;
    }

    //reset the queue
    public synchronized void resetQueue(int newStartNumber) {
        this.currentNumber = newStartNumber;
    }
}
