public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        int index = 2; //A safe index
        if (index >= 0 && index < array.length) {
            array[index] = 10;
            System.out.println(array[index]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}