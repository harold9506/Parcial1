package src.factorymethod;

import java.util.Scanner;
import java.util.ArrayList;

import static src.Menu.Main.juguetes;
import static src.Menu.Main.scanner;

public class CreadorPeluche implements CreadorJuguete{


    public static CreadorJuguete crear() {

        Peluche Peluchenuevo;
        Scanner sc=new Scanner(System.in);
        String materialexterior, relleno, color;

        System.out.println("\n\t CREACIÓN DEL PELUCHE");
        System.out.println("\n\t Ingrese material del exterior");
        materialexterior = sc.next();
        System.out.println("\n\t Ingrese relleno ");
        relleno = sc.next();
        System.out.println("\n\t Ingrese color del peluche ");
        color = sc.next();

        int id;
        id = juguetes.size();

        Peluchenuevo = new Peluche(id,materialexterior, relleno, color);

        juguetes.add(Peluchenuevo);
        System.out.println("\n\t Peluche guardado correctamente ");
        return null;
    }


}
