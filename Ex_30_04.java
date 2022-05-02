package Activity_13;

public class Ex_30_04 {
    private static Integer sum = 0;
    public synchronized static void main(String[] args) {
        for(int i = 0; i <= 1000; i++){
            Thread thread = new Thread(new Add());
            thread.start();
        }
    }
    static class Add implements Runnable {
        public void run() {
            sum++;
            System.out.println( sum);
        }
    }
}
