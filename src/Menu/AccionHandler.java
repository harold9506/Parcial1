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
                    new Eliminacion(),
                    new ImpPeluchesCarritos(),
                    new ImpCarrosMaxPuerta(),
                    new ConversionSetMap(),
                    new EliminacionPorColor());

    public static Map<Integer, Accion> getStrategy(){
        Map<Integer, Accion> strategy = new HashMap<>();
        for(Accion accion : ListaDeAcciones){
            strategy.put(accion.getOpcion(), accion);
        }
        return strategy;
    }


}
