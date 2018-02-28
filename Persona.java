
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
    private Comida comidaMasCaloricaIngerida;

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
        comidaMasCaloricaIngerida = null;
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
        int caloriasComidaHastaElMomento = -1;

        if(totalCalorias <= metabolismoBasal){
            //come
            caloriasComidaHastaElMomento = comer.getCalorias();
            totalCalorias += caloriasComidaHastaElMomento;
            if(comidaMasCaloricaIngerida !=null){
                //ya habia comido cosas
                if(comer.getCalorias() >= comidaMasCaloricaIngerida.getCalorias()){
                    comidaMasCaloricaIngerida = comer;
                }
            }
            else{
                //No habia comido nada todavia
                comidaMasCaloricaIngerida = comer;
            }
        }
        else{
            //No come
            System.out.println("Estoy Muy lleno, no puedo comer");
        }
        return caloriasComidaHastaElMomento;
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

    /**
     * Nos permite preguntarle cosas a la persona
     * @param pregunta lo que le queremos preguntar
     */
    public String contestar(String pregunta)
    {
        String respuesta = "";
        if(totalCalorias > metabolismoBasal || pregunta.toLowerCase().contains(nombre.toLowerCase())){
            respuesta = pregunta.toUpperCase(); 
        }
        else{
            if(pregunta.length() % 3 == 0){
                respuesta = "SI";
            }
            else{
                respuesta = "NO";
            }
        }
        System.out.println(respuesta);
        return respuesta;
    }

    /**
     * Devuelve el nombre de la comida mas calorica consumida por la persona
     * @return El nombre del alimento más calorico consumido hasta ahora
     */
    public String getAlimentosMasCaloricoConsumido()
    {
        String nombreComidaMasCalorica = null;
        if(comidaMasCaloricaIngerida == null){
            System.out.println("no he comido nada");
        }
        else{
            nombreComidaMasCalorica = comidaMasCaloricaIngerida.getNombre();
        }
        return nombreComidaMasCalorica;
    }
}   

