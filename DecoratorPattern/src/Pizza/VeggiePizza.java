package Pizza;

public class VeggiePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Veggie Pizza";
    }
    @Override
    public double getCost() {
        return 10.0;//basit pizza maliyeti
    }
}