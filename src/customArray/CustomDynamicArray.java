package customArray;


public class CustomDynamicArray {
    public static void main(String[] args) {
        MyArray<Integer> integerMyArray = new MyArray<>();

        for(int i = 1; i <= 100; i++){
            integerMyArray.add(i);
        }

        for (int i = 0; i < integerMyArray.size(); i++) {
            System.out.println(integerMyArray.get(i));
        }

        MyArray<String> stringMyArray = new MyArray<>();
        stringMyArray.add("Cat");
        stringMyArray.add("Dog");
        stringMyArray.add("Cow");
        stringMyArray.add("Snake");

        for (int i = 0; i < stringMyArray.size(); i++) {
            System.out.println(stringMyArray.get(i));
        }
    }
}
