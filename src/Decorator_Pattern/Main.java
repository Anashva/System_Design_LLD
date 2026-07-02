package Decorator_Pattern;

public class Main {
    public static void main(String[] args) {
//        Payment p=new LogginDecorator(
//                new CashbackDecorator(
//                        new DiscountDecorator(
//                                new CreditCardPayment()
//                        )
//                )
//        );
//        p.pay(100);


        Pizza pizza=new BasicPizza();
        pizza=new CheeseDecorator(pizza);
        pizza=new MushroomPizza(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
