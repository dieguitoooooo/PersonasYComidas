
/**
 * Write a description of class Comida here.
 *
 * @author Diego Antonio Almonte
 * @version (a version number or a date)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String nombreComida;
    private int calorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombre, int calorias)
    {
        // initialise instance variables
        this.nombreComida = nombre;
        this.calorias = calorias;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  Método que no resive parametros
     * @return  Devuelve las calorias del alimento
     */
    public int getCalorias()
    {
        // put your code here
        return calorias;
    }
    
    /**
     * @param Método que no recibe parametros
     * @return Devuelve el nombre del alimento
     */
    public String getNombre()
    {
        return nombreComida;
    }
    
}
