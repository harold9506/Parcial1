package src.Menu;

import src.factorymethod.*;
import java.util.*;

public class Creacion implements Accion {

    static ArrayList <Juguete> juguetes = new ArrayList<>();

    @Override
    public void aplicar() {

        Scanner scanner = new Scanner((System.in));
        final int OPCION_SALIR = 3;
        int opcion;
        do {
            System.out.println("Por favor ingrese una opcion:" +
                    "\n1 - Crear peluche" +
                    "\n2 - Crear carrito" +
                    "\n3 - Volver al menu anterior");
            opcion = scanner.nextInt();
            scanner.nextLine();
            if (opcion == OPCION_SALIR) {
                continue;
            }else {
                if (opcion == 1) {
                    CreadorPeluche.crear();
                } else {
                    if (opcion == 2) {
                        CreadorCarrito.crear();
                    } else {
                        System.out.println("Esta opcion no existe");
                    }
                }
            }
        } while (opcion != OPCION_SALIR);
        System.out.println("Salida exitosa");

    }

    @Override
    public int getOpcion() {
        return 1;
    }
}