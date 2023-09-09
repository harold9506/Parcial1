package src.factorymethod;

public class CreadorPizzaHawaiana implements CreadorPizza {

    @Override
    public Juguete crear() {
        return new PizzaHawaiana();
    }
}
