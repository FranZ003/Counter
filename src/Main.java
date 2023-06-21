public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter(5);
        Counter counter2 = new Counter(10);


        System.out.println("Contatore numero 1: " + counter1.getNumber());
        System.out.println("Contatore numero 2: " + counter2.getNumber());


        System.out.println("Conteggio iniziale: " + Counter.getCount());

        Counter.incrementCount(counter1.getNumber());
        System.out.println("Conto dopo l'incremento: " + Counter.getCount());

        counter2.setNumber(7);
        Counter.incrementCount(counter2.getNumber());
        System.out.println("Conto dopo il secondo incremento: " + Counter.getCount());
    }
}
