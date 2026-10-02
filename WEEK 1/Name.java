public class Name {

    public void log(int[] numbers, String[] names) {
        for (int number : numbers) {
            System.out.println(number);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Name demo = new Name();

        int[] numbers = {1, 2};
        String[] names = {"Ali", "Ahmed", "Tariq"};

        demo.log(numbers, names);
    }
}
