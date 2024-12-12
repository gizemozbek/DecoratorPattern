package Pizza;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription(){
        return decoratedPizza.getDescription() + " , Cheese";
    }
    @Override
    public double getCost(){
        return decoratedPizza.getCost() + 1.5; //cheese ek maliyeti
    }
}
