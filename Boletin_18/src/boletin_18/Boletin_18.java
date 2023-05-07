
package boletin_18;

/**
 *
 * @author jorge
 */
public class Boletin_18 {

   
    public static void main(String[] args) {
        ConversorTemperaturas obx = new ConversorTemperaturas();
        
      
      try{
            float fharenheit = obx.centigradosAFharenheit(83);
            System.out.println("La conversion sería igual a " + fharenheit);
        }catch(TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
        }
       
       try{
            float reamur = obx.centigradosAFharenheit(69);
            System.out.println("La conversion sería igual a " + reamur);
        }catch(TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
        }
        
        
    
                        
   }
    
}
