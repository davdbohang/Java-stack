import java.lang.Math;

public class FizzBuzz {
    public static void main(String[] args){
    }
    public String fizzBuzz(int number) {
        String output;
        if (number % 3 == 0 && number % 5 == 0) {
            output = "FizzBuzz";
        } else if (number % 5 == 0) {
            output = "Buzz";
        } else if (number % 3 == 0) {
            output = "Fizz";
        } else {
            output = "number";
        }
        return output;
    }
}