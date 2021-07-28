import java.lang.Math;

public class PythagoreanTest {
    public static void main(String[] args){
        Pythagorean test = new Pythagorean();
        double hypotenuse = test.calculateHypotenuse(3,4);
        System.out.println(hypotenuse);
    }
}