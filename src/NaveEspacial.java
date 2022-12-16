/**
 * @author Jhon Gutierrez
 *clase abstracta que contiene principales funciones y atrivutos de una nave espacial
 */
public abstract class NaveEspacial {
    /**
     * se refiere al nombre de la aeronave
     */
    public String nombre;
    /**
     * se refiere al pais al que pertenece la aeronave
     */
    public String pais;
    /**
     * se refiere al tipo de combustible utilizado
     */
    public String Combustible;
    /**
     * se refiere al peso de la aeronave
     */
    public int peso;
    /**
     * se refiere a la altura de la aeronave
     */
    public int altura;
    /**
     * se refiere al año de su actividad
     */
    public String actividad;
    /**
     * se refiere a la fuerza de empuje
     */
    public   int empuje;

    /**
     * metodo constructor
     * @param nombre
     * @param pais
     * @param combustible
     * @param peso
     * @param altura
     * @param actividad
     * @param empuje
     */
    public NaveEspacial(String nombre, String pais, String combustible, int peso, int altura, String actividad, int empuje) {
        this.nombre = nombre;
        this.pais = pais;
        Combustible = combustible;
        this.peso = peso;
        this.altura = altura;
        this.actividad = actividad;
        this.empuje = empuje;
    }

    public abstract void Despegar();
    public abstract void navegar();
    public void Orbitar(){
    }

}
