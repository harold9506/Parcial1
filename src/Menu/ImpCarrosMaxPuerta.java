package src.Menu;

import src.factorymethod.Juguete;

import java.util.Comparator;
import java.util.Optional;

import static src.Menu.Main.juguetes;

public class ImpCarrosMaxPuerta implements Accion{
    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("\n\t Debe agregar juguetes primero ");
        } else {
            try {

                Optional<Juguete> maximo = juguetes.stream() //valor maximo
                        .max(Comparator.comparing(juguete -> juguete.getnumpuertas()));

                System.out.println("\n\t El carro con mayor numero de puertas es: ");
                System.out.println(maximo);

            } catch (Exception e) {
                System.out.println("\n\t Valor erroneo, revise por favor ");

            }


        }

    }

    @Override
    public int getOpcion() {
        return 6;
    }
}
