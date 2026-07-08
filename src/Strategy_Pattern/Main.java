package Strategy_Pattern;

public class Main {
    public static void main(String[] args) {
        FareCalculator calculator=new FareCalculator(new SUVStrategy());
        System.out.println(calculator.calculator(20));
    }
}
