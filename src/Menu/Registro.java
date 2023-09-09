package src.Menu;

public class Registro implements Accion{
    @Override
    public void aplicar() {
        System.out.println("Registro");
    }

    @Override
    public int getOpcion() {
        return 2;
    }
}
