/**
 * @author Jhon Gutierrez
 * se refiere a la clase que contiene un tipo de nave espacial con sus algunas de sus fuciones y atrivutos
 */
public class Tripuladas extends NaveEspacial{
    /**
     * se refiere al numero de tripulantes
     */

    private int numeroTripulantes;
    /**
     * se refiere a la media a la que orbita la tierra
     */
    private double mediaOrbitacion;

    /**
     * metodo constructor
     * @param nombre
     * @param pais
     * @param combustible
     * @param peso
     * @param altura
     * @param actividad
     * @param empuje
     * @param numeroTripulantes
     * @param mediaOrbitacion
     */

    public Tripuladas(String nombre, String pais, String combustible, int peso, int altura, String actividad, int empuje, int numeroTripulantes,double mediaOrbitacion) {
        super(nombre, pais, combustible, peso, altura, actividad, empuje);
        this.numeroTripulantes = numeroTripulantes;
        this.mediaOrbitacion = mediaOrbitacion;
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
}
