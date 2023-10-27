package src.Menu;

import src.factorymethod.Juguete;

import java.util.Map;
import java.util.stream.Collectors;

import static src.Menu.Main.juguetes;

public class ConversionSetMap implements Accion{
    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("\n\t Debe agregar juguetes primero ");
        } else {
            try {

                Map<Long, Juguete> crearmapa = juguetes.stream()//Se mapea los empleados
                        .collect(Collectors.toMap(juguete -> (long) juguete.getid(), juguete -> juguete));


                for (Map.Entry<Long, Juguete> entry : crearmapa.entrySet()) {
                    System.out.printf("Key -> %d, Value -> %s\n", entry.getKey(), entry.getValue().toString());
                }

            } catch (Exception e) {
                System.out.println("\n\t Valor erroneo, revise por favor ");

            }


        }

    }

    @Override
    public int getOpcion() {
        return 7;
    }
}
