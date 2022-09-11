package ejemplo.pkg05.pkg09.pkg2022;

import java.util.Arrays;

public class Ejemplo05092022 
{
    public static void main(String[] args) 
    {
        String[] nombre = {"Mario", "Julio", "Gaby", "Faty", "Alejandro", "Jessica", "Ventura", "Esteban"};
        
        Arrays.stream(nombre)
              .filter(nom->!nom.equals("Alejandro"))
              .forEach(nom -> System.out.println(nom));
        
        
        Int[] valores = {   };
    }
    
}
