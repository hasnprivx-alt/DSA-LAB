public class Sum {
   public int[] doubleAll(int[] numbers){
        int[] result = new int[numbers.length];
        for (int i = 0 ; i < numbers.length ; i++){
            result[i] = numbers[i] *2;
        }
        return result;
    }
    public static void main(String[] args){
        Sum demo = new Sum();
        int[] data = {1,2,3};
        System.out.println("Input : " + java.util.Arrays.toString(data) );
        int[] result = demo.doubleAll(data);
        System.out.println("Output : " + java.util.Arrays.toString(result));
    }
}
 