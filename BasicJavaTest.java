import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class BasicJavaTest {
    public static void main(String[] args) {
        BasicJava test = new BasicJava();

        test.printTo255();
        test.printTo255Odds();
        test.printSumTo255();

        int[] arr = {1,3,5,7,9,13};
        int[] arr2 = {-3, -5, -7};
        int[] arr3 = {2,10,3};
        
        test.printArray(arr);
        test.printMax(arr);
        test.printMax(arr2);
        test.printAverage(arr3);
        test.printAverage(arr);

        ArrayList<Integer> y = test.getOdds255();
        System.out.println(y);

        test.greaterThanY(arr, 3);
        test.greaterThanY(arr3, 3);

        int[] arr4 = {1,5,10,-2};
        System.out.println(Arrays.toString(test.sqrValues(arr4)));
        System.out.println(Arrays.toString(test.noNegatives(arr4)));
        // System.out.println(Arrays.toString(test.maxMinAvg(arr3)));
        System.out.println(Arrays.toString(test.shiftValues(arr4)));


    }
}