package problems;

public class S {
    public static void printName(int count, String name) {
        if (count > 0) {
            System.out.println(name);
            printName(count - 1, name);
        }
    }

    public static void main(String[] args) {
        String name = "YourName";  // Replace "YourName" with your actual name
        int timesToPrint = 1000000;
        printName(timesToPrint, name);
    }
}
