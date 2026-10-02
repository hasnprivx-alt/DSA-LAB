public class Shoping {

    static int[] shrinkifneeded(int[] cart, int size) {
        if (size < cart.length / 4) {
            int[] smaller = new int[cart.length / 2];

            System.arraycopy(cart, 0, smaller, 0, size);

            return smaller;
        }

        return cart;
    }

    public static void main(String[] args) {
        int[] cart = {10, 20, 30, 40, 50, 60, 70, 80};
        int size = 2;

        int[] result = shrinkifneeded(cart, size);

        System.out.println("Cart after shrinking:");

        for (int item : result) {
            System.out.print(item + " ");
        }
    }
}