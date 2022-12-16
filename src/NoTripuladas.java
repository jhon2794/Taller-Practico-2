/**
 * @author Jhon Gutierrez
 * clase que contiene un tipo de nave espacial con sus funciones y atrivutos
 */
public class NoTripuladas extends NaveEspacial{
    /**
     * se refiere a la velocidad alcanzada
     */

    private int velocidad;

    /**
     * metodo constructor
     * @param nombre
     * @param pais
     * @param combustible
     * @param peso
     * @param altura
     * @param actividad
     * @param empuje
     * @param velocidad
     */

    public NoTripuladas(String nombre, String pais, String combustible, int peso, int altura, String actividad, int empuje, int velocidad) {
        super(nombre, pais, combustible, peso, altura, actividad, empuje);
        this.velocidad = velocidad;
    }

    @Override
    public void Despegar() {
    }
    @Override
    public void navegar() {
    }
    @Override
    public void Orbitar(){
    }
    private void Abastecer(){
    }
}
