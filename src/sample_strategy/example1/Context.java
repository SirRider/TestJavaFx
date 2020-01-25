package sample_strategy.example1;

public class Context {
    private Strategy strategy = null;

    public void setStrategy(final Strategy strategy){
        this.strategy = strategy;
    }
    public Strategy getStrategy(){
        return this.strategy;
    }

    // Hier sollte ich irgendwelche Methode benutze um zeigen,dass alles funktioniert.
}
