package BankingSystem;

public class Transactions {
    private static final int initialCapacity = 100;
    private int capacity;
    private int size;
    private Transaction[]  transactions;
    public Transactions() {
        capacity = initialCapacity;
        size = 0;
        transactions = new Transaction[capacity];
    }
    private void resize() {
        capacity *= 2;
        Transaction[] tempArray = new Transaction[capacity];
        System.arraycopy(transactions, 0, tempArray, 0, size);
        transactions = tempArray;
    }

    public void add(Transaction transaction) {
        if (size == capacity) {
            resize();
        }
        transactions[size++] = transaction;
    }

    public Transaction get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        return transactions[index];
    }

    public int size() {
        return size;
    }
    public void printStatements(){
        for (int i = 0; i < size; i++) {
            System.out.println(transactions[i].toString());
        }
    }
}
