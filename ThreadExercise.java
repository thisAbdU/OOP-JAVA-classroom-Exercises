public class ThreadExercise {

    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() ->{
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hi");
                }
            });
        Thread t2 = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello");
                }
            });

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        t2.start();

       
    }
}
