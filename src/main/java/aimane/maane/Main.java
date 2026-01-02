package labrini.ouiam;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.SetStrategy(new StrategyImpl1());
        context.executeStrategy();

        context.SetStrategy(new StrategyImpl2());
        context.executeStrategy();


    }
}