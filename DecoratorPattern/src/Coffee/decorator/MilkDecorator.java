package designpatterns.decorator;

public class MilkDecorator extends CoffeeDecarator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription() + " , Milk";
    }
    @Override
    public double getCost(){
        return decoratedCoffee.getCost() + 1.5; //süt ek maliyeti
    }
}
