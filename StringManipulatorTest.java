public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hello     ","     World    ");
        System.out.println(str); // HelloWorld 
        
        System.out.println(manipulator.getIndexOrNull("Coding", 'o'));
        System.out.println(manipulator.getIndexOrNull("Hello World", 'o'));
        System.out.println(manipulator.getIndexOrNull("Hi", 'o'));

        System.out.println(manipulator.getIndexOrNull("Hello", "llo"));
        System.out.println(manipulator.getIndexOrNull("Hello", "world"));

        System.out.println(manipulator.concatSubstring("Hello", 1, 2, "world"));
    }
}