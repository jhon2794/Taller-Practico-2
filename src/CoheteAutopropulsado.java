/**
 * @author Jhon Gutierrez
 * clase que contiene un tipo de nave espacial con sus atrivutos y funciones
 */
public class CoheteAutopropulsado  extends  NaveEspacial{
    /**
     * se refiere al numero de toneladas que soporta
     */
     private int  capacidadToneladas;

    /**
     * metodo constructor
     * @param nombre
     * @param pais
     * @param combustible
     * @param peso
     * @param altura
     * @param actividad
     * @param empuje
     * @param capacidadToneladas
     */
    public CoheteAutopropulsado(String nombre, String pais, String combustible, int peso, int altura, String actividad, int empuje,int capacidadToneladas) {
        super(nombre, pais, combustible, peso, altura, actividad, empuje);
        this.capacidadToneladas = capacidadToneladas;
    }




    @Override
    public void Despegar() {
    }
    @Override
    public void navegar() {
    }
    private void TransportarCarga(){
    }
}
