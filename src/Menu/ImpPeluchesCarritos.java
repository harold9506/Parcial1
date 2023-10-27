package src.Menu;

import src.factorymethod.Juguete;

import java.util.Optional;
import java.util.Scanner;

import static src.Menu.Main.juguetes;

public class ImpPeluchesCarritos implements Accion{
    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("\n\t Debe agregar juguetes primero ");
        } else {
            try {

                Scanner scanner = new Scanner((System.in));
                final int OPCION_SALIR = 3;
                int opcion;
                do {
                    System.out.println("Que desea imprimir:" +
                            "\n1 - Imprimir peluche" +
                            "\n2 - Imprimir carrito" +
                            "\n3 - Volver al menu anterior");
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    if (opcion == OPCION_SALIR) {
                        continue;
                    }else {
                        if (opcion == 1) {

                            Optional<Juguete> imppeluche = juguetes.stream() //encontrar cualquier elemento
                                    .filter(peluche -> peluche.toString().charAt(0) == 'P')
                                    .findAny();

                            System.out.println(imppeluche);

                        } else {
                            if (opcion == 2) {

                                Optional<Juguete> impcarrito = juguetes.stream() //encontrar cualquier elemento
                                        .filter(carrito -> carrito.toString().charAt(0) == 'C')
                                        .findAny();

                                System.out.println(impcarrito);



                            } else {
                                System.out.println("Esta opcion no existe");
                            }
                        }
                    }
                } while (opcion != OPCION_SALIR);
                System.out.println("Salida exitosa");

            } catch (Exception e) {
                System.out.println("\n\t Valor erroneo, revise por favor ");

            }


        }
    }

    @Override
    public int getOpcion() {
        return 5;
    }
}
