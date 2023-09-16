package src.Menu;
import src.factorymethod.Carrito;
import src.factorymethod.Juguete;

import java.util.Scanner;

import static src.Menu.Main.juguetes;

public class Clonacion implements Accion{

    @Override
    public void aplicar() {


        if (juguetes.isEmpty()){
            System.out.println("\n\t Debe agregar juguetes primero ");
        }else {
            Scanner sc=new Scanner(System.in);
            int id, cantidad,k=0;
            System.out.println("\n\t CLONACION DE JUGUETE");
            System.out.println("\n\t Indique que ID quiere clonar");
            id = sc.nextInt();

            for (int i=0; i < juguetes.size(); i++)
            {
                if(juguetes.get(i).getid() == id) {
                    k++;
                }
            }
            if (k > 0){
                for (int i=0; i < juguetes.size(); i++)
                {
                    if(juguetes.get(i).getid() == id) {
                        System.out.println("\n\t ¿Cuantos clones quiere crear?");
                        cantidad = sc.nextInt();

                        for (int n = 0; n < cantidad; n++) {
                            Juguete jugueteclon = juguetes.get(id).clone();
                            jugueteclon.setid(juguetes.size()+1);
                            juguetes.add(jugueteclon);

                            System.out.println("\n\t Juguete clonado correctamente ");
                        }

                    }
                }

            }else{
                System.out.println("\n\t El juguete NO existe"); //si k nunca incremento es porque no se encontro el dato a eliminar por el usuario
            }

        }

    }

    @Override
    public int getOpcion() {
        return 2;
    }
}
