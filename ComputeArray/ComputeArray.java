public class ComputeArray {
    public static int[] computeArray(int[] array) {
        if (array == null)
            return array;

        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = computeN(array[i]);
        }
        return result;
    }

    static int computeN(int n) {
        int mod = n % 3;

        if (mod == 0)
            return n * 5;

        if (mod == 1)
            return n + 7;

        return n;
    }

}
