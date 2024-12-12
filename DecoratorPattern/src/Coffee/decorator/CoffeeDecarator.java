package designpatterns.decorator;

abstract class CoffeeDecarator implements Coffee{
    protected Coffee decoratedCoffee;
    public CoffeeDecarator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
