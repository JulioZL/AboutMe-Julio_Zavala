package sumatorias;

import java.util.*;

public class Sumatorias 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa n: ");
        double n = sc.nextInt(), beta=0, x=0;
        
        for(int i=1; i<=n; i++)
        {
            x+=1/n+x;
            System.out.println("La sumatoria es igual a: " + x);
        }
        
    }
    
}
