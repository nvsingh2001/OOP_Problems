package customarray;

class MyArray<T> {
    private static final int INITIAL_CAPACITY = 10;
    private T[] array;
    private int capacity;
    private int size;

    public MyArray(int capacity) {
        this.capacity = capacity;
        size = 0;
        this.array = (T[]) new Object[capacity];
    }

    public MyArray() {
        capacity = INITIAL_CAPACITY;
        size = 0;
        array = (T[]) new Object[capacity];
    }

    private void resize() {
        capacity *= 2;
        T[] tempArray = (T[])new Object[capacity];
        System.arraycopy(array, 0, tempArray, 0, size);
        array = tempArray;
    }

    public void add(T value) {
        if (size == capacity) {
            resize();
        }
        array[size++] = value;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return array[index];
    }

    public int size() {
        return size;
    }
}
