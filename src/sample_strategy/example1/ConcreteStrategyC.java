package sample_strategy.example1;

public class ConcreteStrategyC implements Strategy {
    @Override
    public void algorithmus() {
        System.out.println(this.getClass().getName()+" : Multipiziere");
    }

    @Override
    public int berechnungen(int a, int b) {
        return a * b;
    }
}
