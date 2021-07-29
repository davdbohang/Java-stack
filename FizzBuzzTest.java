public class FizzBuzzTest {
    public static void main(String args[]) { 
        FizzBuzz test = new FizzBuzz();
        String output = test.fizzBuzz(3);
        String output2 = test.fizzBuzz(5);
        String output3 = test.fizzBuzz(15);
        String output4 = test.fizzBuzz(2);

        System.out.println(output);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
    }
}