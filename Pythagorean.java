import java.lang.Math;

public class Pythagorean {
    public static void main(String[] args){
    }
    public double calculateHypotenuse(int legA, int legB) {
        // the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
        return Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2));
    }
}