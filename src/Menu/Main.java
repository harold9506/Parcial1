package src.Menu;

import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner((System.in));
    private static final int OPCION_SALIR = 5;
    public static void main(String[] args){

        Map<Integer, Accion> strategy = AccionHandler.getStrategy();
        //Map<Integer, Accion> strategy = new HashMap<>();
        //strategy.put(1, new AccionCrear());
        //strategy.put(2, new AccionLeer());
        //strategy.put(3, new AccionActualizar());
        //strategy.put(4, new AccionEliminar());

        int opcion;
        do {
            System.out.println("Por favor ingrese una opcion:" +
                    "\n1 - Crear juguete"+
                    "\n2 - Clonar juguete" +
                    "\n3 - Eliminar juguete" +
                    "\n4 - Registro de juguetes"+
                    "\n5 - Salir");
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
            }

        }while (opcion != OPCION_SALIR);
        System.out.println("Salida exitosa");
    }
}
