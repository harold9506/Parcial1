package src.Menu;

import src.factorymethod.Juguete;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static ArrayList<Juguete> juguetes = new ArrayList<>();
    public static Scanner scanner = new Scanner((System.in));
    private static final int OPCION_SALIR = 5;
    public static void main(String[] args){

        try{

            Main.menu();

        } catch (Exception e) {
            System.out.println("\n\t Valor erroneo, revise por favor ");
            Main.menu();
        }
    }

    public static void menu() {

        try{
        Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        int opcion;
        do {
            System.out.println("\n\t");
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

        } catch (Exception e) {
            System.out.println("\n\t Valor erroneo, revise por favor ");
            Main.menu();
        }

    }
}
