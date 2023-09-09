package src.Menu;

public class Clonacion implements Accion{

    @Override
    public void aplicar() {
        System.out.println("Estoy clonando");
    }

    @Override
    public int getOpcion() {
        return 3;
    }
}
