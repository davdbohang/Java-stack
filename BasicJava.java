import java.util.ArrayList;

public class BasicJava {
    public void printTo255() {
        for (int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }

    public void printTo255Odds() {
        for (int i = 1; i <256; i += 2) {
            System.out.println(i);
        }
    }

    public void printSumTo255() {
        String str;
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            sum += i;
            str = "number: " + i + " sum: " + sum;
            System.out.println(str);
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void printMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public void printAverage(int[] arr) {
        int sum = 0;
        for (int i =0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }

    public ArrayList<Integer> getOdds255() {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for (int i = 1; i < 256; i+=2) {
            arrList.add(i);
        }
        return arrList;
    }

    public void greaterThanY(int[] arr, int y) {
        int numbers = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y) {
                numbers++;
            }
        }
        System.out.println(numbers);
    }

    public int[] sqrValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        return arr;
    }

    public int[] noNegatives(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0; 
            }
        }
        return arr; 
    }

    public double[] maxMinAvg(double[] arr) {
        double sum = 0;
        double max = arr[0];
        double min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        double avg = sum / arr.length;
        double[] results = {max, min, avg};
        return results;
    }

    public int[] shiftValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                arr[i] = 0;
            } else {
                arr[i] = arr[i+1];
            }
        }
        return arr;
    }
}