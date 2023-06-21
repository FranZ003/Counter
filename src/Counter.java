public class Counter {
    private static int count = 0;
    private int number;

    public Counter(int number) {
        this.number = number;
    }

    public static void incrementCount(int number) {
        count += number;
    }

    public static int getCount() {
        return count;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
