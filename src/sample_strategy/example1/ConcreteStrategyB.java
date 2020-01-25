package sample_strategy.example1;

public class ConcreteStrategyB implements Strategy {
    @Override
    public void algorithmus() {
        System.out.println(this.getClass().getName()+" : Subtrahiere");
    }

    @Override
    public int berechnungen(int a, int b) {
        return a - b;
    }
}
