package Activity_13;

public class Ex_30_11 {
    static String resource1 = "Cheese1";
    static String resource2 = "Cheese2";
    public static void main(String[] args) {
        Thread crow1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Crow 1: locked cheese1");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println("Crow 1: locked cheese2");
                }
            }
        });
        Thread crow2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Crow 2: locked cheese2");
                try { Thread.sleep(1000);}
                catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (resource1)
                {
                    System.out.println("Crow 2: locked cheese1");
                }
            }
        });
        crow1.start();
        crow2.start();
    }
}
