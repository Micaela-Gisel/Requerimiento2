package app;

import java.util.Scanner;
      
public class Ejercicio2 {
    public Ejercicio2() {
        super();
    }

    public static void main(String[] args) {
        //Ejercicio2 ejercicio2 = new Ejercicio2();
        Float base= new Float (3.5f);
        Float altura = null;
              
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la altura");
         altura = sc.nextFloat();
         
        System.out.println("Ingrese la base");
        base = sc.nextFloat();
        Float r = null;
        r = areaCalcular(base, altura);
        System.out.println("El resultado es: "+ r);
        }
    
    private static Float areaCalcular(float base, float altura){ 
      
       Float R = null;
        
        R = base * altura;
       return R;
         
    }
}

