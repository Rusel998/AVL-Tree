import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = randomArrayInit();
        Tree tree = new Tree();
        //пункт 3
        long[] timeArray1 = new long[10000];
        for (int i = 0; i < array.length; i++) {
            long startTime = System.nanoTime();
            tree.insertKey(array[i]);
            long endTime = System.nanoTime();
            timeArray1[i] = endTime - startTime;
        }
        long sum1 = 0;
        for (int j = 0; j < timeArray1.length; j++) {
            sum1 += timeArray1[j];
        }
        double averageTime1 = (double) sum1 / timeArray1.length;
        double averageOperation1 = (double) tree.insertOperationsCount / timeArray1.length;
        System.out.println("Average time for insertion in the tree: " + averageTime1);
        System.out.println("Average operations for insertion in the tree: " + averageOperation1);

        //пункт 4
        Random random = new Random();
        long[] timearray2 = new long[100];
        for (int i = 0; i < 100; i ++){
            int elementToFind = array[random.nextInt(array.length)];
            long startTime = System.nanoTime();
            tree.searchKey(elementToFind);
            long endTime = System.nanoTime();
            timearray2[i] = endTime - startTime;
        }
        long sum2 = 0;
        for (int j = 0; j < timearray2.length; j++) {
            sum2 += timearray2[j];
        }
        double averageTime2 = (double) sum2 / timearray2.length;
        double averageOperation2 = (double) tree.searchOperationsCount / timearray2.length;
        System.out.println("Average time for searching in the tree: " + averageTime2);
        System.out.println("Average operations for searching in the tree: " + averageOperation2);

        //пункт 5
        long[] timearray3 = new long[1000];
        for (int i = 0; i < 1000; i ++){
            int elementToDelete = array[random.nextInt(array.length)];
            long startTime = System.nanoTime();
            tree.deleteKey(elementToDelete);
            long endTime = System.nanoTime();
            timearray3[i] = endTime - startTime;
        }
        long sum3 = 0;
        for (int j = 0; j < timearray3.length; j++) {
            sum3 += timearray3[j];
        }
        double averageTime3 = (double) sum3 / timearray3.length;
        double averageOperation3 = (double) tree.deleteOperationsCount / timearray3.length;
        System.out.println("Average time for deleting in the tree: " + averageTime3);
        System.out.println("Average operations for deleting in the tree: " + averageOperation3);


    }
    static int[] randomArrayInit(){
        Random random = new Random();
        int[] array = new int[10000];
        for (int i = 0; i < 10000; i++) {
            array[i] = Math.abs(random.nextInt());
        }
        return array;
    }
}