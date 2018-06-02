/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores.Practica5;

import java.util.Comparator;

/**
 *
 * @author alumno
 */
public class OrdenAlternativoCilindrada implements Comparator<Coche_Practica5>{


  
   @Override
    public int compare(Coche_Practica5 o1, Coche_Practica5 o2) {
        return o1.getCilindrada() - o2.getCilindrada();
    }
    
    
    
    
    
    
    
    
    
}
