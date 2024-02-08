package pl.codegym.task.task16.task1617;

/* 
Odliczanie na wyścigach
*/

public class Solution {
    public static volatile int numSeconds = 5;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }
    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {

                for (int i = numSeconds; i > 0; i--) {

                    try {
                        System.out.print(i + " ");
                        Thread.sleep(1000);
                        numSeconds--;
                    } catch (InterruptedException e) {
                        System.out.print("Przerwane!");
                        return;
                    }
            }
                    System.out.print("Start!");
        }
    }
}
