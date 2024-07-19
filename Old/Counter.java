class Counter {
    public static void main(String[] args) {
        Thread timerthread = new Thread(() -> {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Time up!");
        });
        timerthread.start();
    }
}
