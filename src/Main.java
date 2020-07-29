public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread threadLe =new Thread(new OddThread());
        Thread threadChan =new Thread(new EvenThread());
        threadLe.start();
        threadLe.join();
        threadChan.start();
    }
}
