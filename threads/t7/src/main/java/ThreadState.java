public class ThreadState {

    static class TimeWaiting implements Runnable {

        @Override
        public void run() {
            while (true) {
                SleepUtils.second(1100);
            }
        }
    }


    public static void main(String[] args) {
        new Thread(new TimeWaiting(), "TimeWaitingThread").start();
    }
}
