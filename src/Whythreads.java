package src;
import java.util.Random;

 class ArrayAdditionSingleThread {
    public static void main(String[] args) {
        int size = 100_000_000;
        int[] a = new int[size];
        int[] b = new int[size];
        int[] result = new int[size];

        Random rand = new Random();

        // Initialize arrays with random integers
        for (int i = 0; i < size; i++) {
            a[i] = rand.nextInt(100); // values between 0-99
            b[i] = rand.nextInt(100); // values between 0-99
        }

        long start = System.currentTimeMillis();

        // Single-threaded addition
        for (int i = 0; i < size; i++) {
            result[i] = a[i] + b[i];
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken (single-thread with random values): " + (end - start) + " ms");
    }
}

class ArrayAdditionMultiThread {
    static class AdderThread extends Thread {
        int[] a, b, result;
        int start, end;

        AdderThread(int[] a, int[] b, int[] result, int start, int end) {
            this.a = a;
            this.b = b;
            this.result = result;
            this.start = start;
            this.end = end;
        }

        public void run() {
            for (int i = start; i < end; i++) {
                result[i] = a[i] + b[i];
            }
        }
    }

    public static void main(String[] args) {
        int size = 100_000_000;
        int[] a = new int[size];
        int[] b = new int[size];
        int[] result = new int[size];

        Random rand = new Random();

        // Initialize arrays with random values
        for (int i = 0; i < size; i++) {
            a[i] = rand.nextInt(100); // values from 0 to 99
            b[i] = rand.nextInt(100); // values from 0 to 99
        }

        int numThreads = 8;
        AdderThread[] threads = new AdderThread[numThreads];
        int chunkSize = size / numThreads;

        long start = System.currentTimeMillis();

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            int startIdx = i * chunkSize;
            int endIdx = (i == numThreads - 1) ? size : startIdx + chunkSize;
            threads[i] = new AdderThread(a, b, result, startIdx, endIdx);
            threads[i].start();
        }

        // Wait for threads to finish
        for (AdderThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken (multi-thread with random values): " + (end - start) + " ms");
    }
}
