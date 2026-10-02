public class Number {
    public void log(int[] numbers){
        for (int number : numbers){
            System.out.println(number);
        }
        for (int first : numbers){
            for (int second : numbers){
                System.out.println(first + " " + second);
            }
        }
    }
    
    public static void main(String[] args){
        Number demo = new Number();
        int[] data = {1,2};
        demo.log(data);
    }
    
}
