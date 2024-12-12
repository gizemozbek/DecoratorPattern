package designpatterns.decorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        //Basit Kahve
        Coffee simpleCoffe= new SimpleCoffee();
        System.out.println(simpleCoffe.getDescription() + " = $" + simpleCoffe.getCost());

        //Süt Eklenmiş Kahve
        Coffee milkCoffee = new MilkDecorator(simpleCoffe);
        System.out.println(milkCoffee.getDescription() + " = $" + milkCoffee.getCost());

        //Süt Ve Çikolata Eklenmiş Kahve
        Coffee milkAndChocolateCoffee = new ChocolateDecorator(milkCoffee);
        System.out.println(milkAndChocolateCoffee.getDescription() + " = $" +milkAndChocolateCoffee.getCost());
}
}