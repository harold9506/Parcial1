package src.Menu;
import src.factorymethod.Juguete;

import java.sql.SQLException;

import static src.Menu.Main.juguetes;
import static src.Menu.Main.main;

public class Registro implements Accion{

    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("\n\t Debe agregar juguetes primero ");
        } else {
            try {

                System.out.println("\n\t Los juguetes son: ");
                for (int i = 0; i < juguetes.size(); i++) {
                    System.out.println("\n\t" + juguetes.get(i));
                }

            } catch (Exception e) {
                System.out.println("\n\t Valor erroneo, revise por favor ");

            }


        }
    }

    @Override
    public int getOpcion() {
        return 4;
    }
}
