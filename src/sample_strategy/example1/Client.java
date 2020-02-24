package sample_strategy.example1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Context context = new Context();
        // final Client client = new Client();
        int a = 10;
        int b = 13;

        // Strategy A
        context.setStrategy(new ConcreteStrategyA());
        context.getStrategy().algorithmus();
        System.out.println(context.getStrategy().berechnungen(a,b));

        // Strategy B
        context.setStrategy(new ConcreteStrategyB());
        context.getStrategy().algorithmus();
        System.out.println(context.getStrategy().berechnungen(a,b));

        // Strategy C
        context.setStrategy(new ConcreteStrategyC());
        context.getStrategy().algorithmus();
        System.out.println(context.getStrategy().berechnungen(a,b));


        // Dynamische Veränderung
        for (int i = 0; i < 3; i++) {
            Scanner detective = new Scanner(System.in);
            System.out.print("Welche Lösung brauchen sie(A/B/C)?:");
            String answer = detective.nextLine();
            if (answer.equals("A")){
                context.setStrategy(new ConcreteStrategyA()); context.getStrategy().algorithmus();
            }
            if (answer.equals("B")){
                context.setStrategy(new ConcreteStrategyB()); context.getStrategy().algorithmus();
            }
            if (answer.equals("C")){
                context.setStrategy(new ConcreteStrategyC()); context.getStrategy().algorithmus();
            }

        }
    }

}
