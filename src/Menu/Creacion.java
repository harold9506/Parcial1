package src.Menu;

import java.util.Map;
import java.util.Scanner;
public class Creacion implements Accion{

    private static Scanner scanner = new Scanner((System.in));
    private static final int OPCION_SALIR = 3;

    Map<Integer, Accion> strategy = AccionHandler.getStrategy();
    @Override
    public void aplicar() {
        int opcion;
        do {
            System.out.println("Por favor ingrese una opcion:" +
                    "\n1 - Crear peluche"+
                    "\n2 - crear carrito" +
                    "\n3 - Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            Accion accion = strategy.get(opcion);
            if (opcion == OPCION_SALIR) {
                continue;
            }
            if (accion == null) {
                System.out.println("Esta opcion no existe");
            } else {
                accion.aplicar();
                //crear if 1 crear peluche
            }

        }while (opcion != OPCION_SALIR);
        System.out.println("Salida exitosa");

    }

    @Override
    public int getOpcion() {
        return 1;
    }
}
