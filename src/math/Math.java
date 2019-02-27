package math;


public class Math {

    public static void main(String[] args) {

        Math math = new Math();
        int[] array = {1, 2, 3, 4};
        System.out.println(math.sum(array));
    }

    public long sum(int[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}