package designpatterns.decorator;

public class ChocolateDecorator extends CoffeeDecarator{
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() +" Chocolate";
    }
    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2.0 ; //Çikolata ek maliyeti
    }
}
