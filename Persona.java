
/**
 * Esta clase simula la ingesta de alimentos de una persona.
 *
 * @author Diego Antonio Almonte
 * @version (a version number or a date)
 */
public class Persona
{
    // Variables de instancia
    private String nombre;
    private boolean sexo;
    private int peso;
    private int altura;
    private int edad;
    private int totalCalorias;
    private int metabolismoBasal;

    /**
     * Constructor para los objectos de la clase Persona
     */
    public Persona(String nombre, boolean sexo, int peso, int altura, int edad)
    {
        // inicializacion de las varibables de instancia
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.totalCalorias = 0;
        //Si el sexo es falso esto quiere decir que es hombre.
        if(sexo=false){
            metabolismoBasal = (10*peso) + (6*altura) + (5*edad)+5;
        }
        else{
            metabolismoBasal = (10*peso)+(6*altura)+(5*edad)-161;
        }
    }

    /**
     * Metodo que devuelve la cantidad de calorias que tiene el alimento que
     * ha consumido y aparece mensaje de error si  la ingesta de calorias 
     * supera el metabolismo basal de la persona.
     *
     * @param  Recibe por parametro un objecto de tipo comida
     * @return   Devuelve la cantidad de calorias que tiene el alimento que
     * ha consumido esta persona
     */
    public int comer(Comida comer)
    {
        {
            int caloriasComidaHastaElMomento = -1;

            if(totalCalorias <= metabolismoBasal){
                caloriasComidaHastaElMomento = comer.getCalorias();
                totalCalorias += caloriasComidaHastaElMomento;
            }
            return caloriasComidaHastaElMomento;
        }
    }


    /**
     * Metodo Que devuelve la cantidad de calorias ingeridas hasta el momento
     * @param No recibe nada por parametro
     * @return Devuelve un entero con la cantidad de calorias consumidas
     */
    public int getCaloriasIngeridas()
    {
        return totalCalorias;
    }
    
    
}   
