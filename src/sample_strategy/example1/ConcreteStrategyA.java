package sample_strategy.example1;

public class ConcreteStrategyA implements Strategy {

    @Override
    public void algorithmus() {
        System.out.println(this.getClass().getName()+" : Addiere");
    }

    @Override
    public int berechnungen(int a, int b) {
        return a + b;
    }
}
