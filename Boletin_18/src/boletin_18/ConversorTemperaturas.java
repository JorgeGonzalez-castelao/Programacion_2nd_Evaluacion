
package boletin_18;

/**
 *
 * @author jorge
 */
public class ConversorTemperaturas {
    public final static float TEMPERATURA = 80;
    
    public float centigradosAFharenheit (float temp)throws TemperaturaErradaExcepcion{
        float fharenheir;
        if (TEMPERATURA < temp){
            fharenheir = 9.0f / 5.0f * temp + 32.4f;
           
            
        } 
        else {
            throw new TemperaturaErradaExcepcion("Los ºC para la conversion a ºFharenheit no pueden ser menor de 80");
        }
        return fharenheir;
    }
    
    public float centigradosARemur (float temp)throws TemperaturaErradaExcepcion{
        float reamur;
        if (TEMPERATURA < temp){
            reamur = 4.0f/5.0f*temp;
           
            
        } 
        else {
            throw new TemperaturaErradaExcepcion("Los ºC para la conversion a ºReamur no pueden ser menor de 80");
        }
        return reamur;
    }
            
    
}
