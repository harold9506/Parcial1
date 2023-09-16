package src.factorymethod;

import java.util.Scanner;

import static src.Menu.Main.juguetes;
import static src.Menu.Main.scanner;

public class CreadorCarrito implements CreadorJuguete{


    public static CreadorJuguete crear() {

        Carrito Carritonuevo;
        Scanner sc=new Scanner(System.in);
        String color, marca;
        int numpuertas;

        System.out.println("\n\t CREACIÓN DEL CARRITO");
        System.out.println("\n\t Ingrese color");
        color = sc.next();
        System.out.println("\n\t Ingrese marca ");
        marca = sc.next();
        System.out.println("\n\t Ingrese numero de puertas ");
        numpuertas = sc.nextInt();


        int id;
        id = juguetes.size();

        Carritonuevo = new Carrito(id,color, marca, numpuertas);

        juguetes.add(Carritonuevo);
        System.out.println("\n\t Carrito guardado correctamente ");
        return null;
    }


}
