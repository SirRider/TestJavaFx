package sample_strategy.example1;

public class Client {
    public final Context context = new Context();
    public static void main(String[] args) {
        final Client client = new Client();
        int a = 10;
        int b = 13;

        // Strategy A
        client.context.setStrategy(new ConcreteStrategyA());
        client.context.getStrategy().algorithmus();
        System.out.println(client.context.getStrategy().berechnungen(a,b));

        // Strategy B
        client.context.setStrategy(new ConcreteStrategyB());
        client.context.getStrategy().algorithmus();
        System.out.println(client.context.getStrategy().berechnungen(a,b));

        // Strategy C
        client.context.setStrategy(new ConcreteStrategyC());
        client.context.getStrategy().algorithmus();
        System.out.println(client.context.getStrategy().berechnungen(a,b));
    }
}
