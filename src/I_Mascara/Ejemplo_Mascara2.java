/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Mascara;


public class Ejemplo_Mascara2 {

   
    public static void main(String[] args) {
        double q = 1.0/3.0;
        
        System.out.printf("1/3= %10.3f %n", q);  // 1/3 =     0,333
        System.out.printf("1/3= %(.3f %n", q);   // 1/3= 0,333
        System.out.printf("1/3= %(.3f %n", -q);   // 1/3= (0,333)
        System.out.printf("1/3= %(.20f %n", -q);   // 1/3= -0000000000000000,333
        System.out.printf("1/3= %(015.3f %n", -q); // 1/3= (00000000000,333) indica que ponga 0, 15 enteros y 3 decimales
        
        
        q = 1000.0/3.0;
        
        System.out.printf("1000/3= %7.2e %n", q);   // 1000/3=3,33
        
        q = 1.0/0.0;
        System.out.printf("1/0= %7.2e %n", q);  // 1/0= Infinity
        
        q = 0.0/0.0;
        
        System.out.printf("1/0= %7.2e %n", q);  // 1/0=    NaN
        
        System.out.printf("pi= %5.3f, e= %10.4f %n", Math.PI, Math.E);
        
        double r = 1.1;
        System.out.printf("(P=2*pi*r y A=pi*r*r): P=2* %1$10.5f * %2$4.1f, " + "A= %1$4.1f * %2$2.5f %n", Math.PI, r); // (P=2*pi*r y A=pi*r*r): P= 2 * 3,14159 * 1,1, A=  3,1 * 1,10000 
        
      
        
    }
    
}
