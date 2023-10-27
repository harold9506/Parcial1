package src.Menu;

import src.factorymethod.Juguete;

import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

import static src.Menu.Main.juguetes;

public class EliminacionPorColor implements Accion{
    @Override
    public void aplicar() {

        if (juguetes.isEmpty()) {
            System.out.println("\n\t Debe agregar juguetes primero ");
        } else {
            try {
                Scanner sc=new Scanner(System.in);
                int buscar, k=0;
                System.out.println("\n\t Que  número del color quiere eliminar?");

                juguetes.stream()
                        .forEach(System.out::println);

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


            } catch (Exception e) {
                System.out.println("\n\t Valor erroneo, revise por favor ");

            }


        }


    }

    @Override
    public int getOpcion() {
        return 8;
    }
}
