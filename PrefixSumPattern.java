public class PrefixSum {

    public static int[] buildPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        return prefix;
    }

    public static int rangeSum(int[] prefix, int l, int r) {
        return prefix[r + 1] - prefix[l];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int[] prefix = buildPrefixSum(arr);

        System.out.println(rangeSum(prefix, 1, 3));
        System.out.println(rangeSum(prefix, 0, 5));
    }
}
