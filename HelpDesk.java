public class HelpDesk {
    public static void main(String[] args) {
        //access singleton
        CentralQueue queue = CentralQueue.getInstance();

        //simulate desks getting numbers
        System.out.println("Help Desk 1 Queue: " + queue.getNextQueueNumber());
        System.out.println("Help Desk 2 Queue: " + queue.getNextQueueNumber());
        System.out.println("Help Desk 3 Queue: " + queue.getNextQueueNumber());

        //reset queue
        queue.resetQueue(10);
        System.out.println("Queue reset to 10.");

        System.out.println("Help Desk 1 Queue: " + queue.getNextQueueNumber());
        System.out.println("Help Desk 2 Queue: " + queue.getNextQueueNumber());
    }
}
