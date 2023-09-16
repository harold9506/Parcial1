package src.Menu;

import src.factorymethod.Juguete;
import java.util.ArrayList;
import java.util.*;
import static src.Menu.Main.juguetes;

public class Eliminacion implements Accion{


    @Override
    public void aplicar() {


        if (juguetes.isEmpty()){
            System.out.println("\n\t Debe agregar juguetes primero ");
        }else {
                Scanner sc=new Scanner(System.in);
                int buscar, k=0; //iniciamos variables que vamos a usar en el metodo
                System.out.println("\n\t Ingrese id del juguete que desea eliminar");
                buscar = sc.nextInt();
                for (int i=0; i < juguetes.size(); i++)
                {
                    if(juguetes.get(i).getid() == buscar) {
                        k++;
                    }
                }
                if (k > 0){
                    for (int i=0; i < juguetes.size(); i++)
                    {
                        if(juguetes.get(i).getid() == buscar) {
                            juguetes.remove((int)i);
                            System.out.println("\n\t Juguete eliminado correctamente");

                        }
                        juguetes.get(i).setid(i);
                    }

                }else{
                    System.out.println("\n\t El juguete NO existe"); //si k nunca incremento es porque no se encontro el dato a eliminar por el usuario
                }
        }

    }

    @Override
    public int getOpcion() {
        return 3;
    }
}
