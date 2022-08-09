public class ReverseInt {
    public static void main(String[] args) {
        int[] array = new int[]{12, 14, 16, 18, 20, 22, 24, 26, 28, 30};

        for (int i = array.length -1; i >= 0; --i) {

            System.out.println(i + ": " + array[i]);
        }
    }
}