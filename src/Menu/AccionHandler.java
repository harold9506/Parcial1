package src.Menu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccionHandler {

    private AccionHandler(){}

    private static final List<Accion> ListaDeAcciones=
            List.of(new Creacion(),
                    new Registro(),
                    new Clonacion(),
                    new Eliminacion());

    public static Map<Integer, Accion> getStrategy(){
        Map<Integer, Accion> strategy = new HashMap<>();
        for(Accion accion : ListaDeAcciones){
            strategy.put(accion.getOpcion(), accion);
        }
        return strategy;
    }

    //private static Map<Integer, Accion> strategy =
      //      List.of(new AccionCrear(),
        //            new AccionLeer(),
          //          new AccionActualizar(),
            //        new AccionEliminar())
            //.stream()
            //.collect(Collectors.toMap(Accion::getOpcion, Function.identity()));;

    //public static Map<Integer, Accion> getStrategy(){

      //  return strategy;

    //}
}
