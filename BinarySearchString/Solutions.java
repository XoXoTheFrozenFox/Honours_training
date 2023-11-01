public class Solutions {
    public static int BinarySearch(String[] array, String x) {
        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (array[m].equals(x)) {
                return m;
            } else if (array[m].compareTo(x) < 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        String[] array = {"AA", "AB", "AC", "AD"};
        int position = BinarySearch(array, "AD");
        if (position != -1) {
            System.out.println(array[position]);
        } else {
            System.out.println("Element not found");
        }
    }
}
