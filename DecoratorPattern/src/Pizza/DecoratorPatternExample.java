package Pizza;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        //Basit Pizza
        Pizza veggiePizza= new VeggiePizza();
        System.out.println(veggiePizza.getDescription() + " = $" + veggiePizza.getCost());

        //peynir eklenmiş pizza
        Pizza cheeseDecorator = new CheeseDecorator(veggiePizza);
        System.out.println(cheeseDecorator.getDescription() + " = $" + cheeseDecorator.getCost());

        //Peynir Ve Zeytin Eklenmiş Pizza
        Pizza cheeseAndOlivePizza = new OliveDecorator(cheeseDecorator);
        System.out.println(cheeseAndOlivePizza.getDescription() + " = $" +cheeseAndOlivePizza.getCost());
    }
}