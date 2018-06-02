/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_Contenedores;

import java.util.Comparator;

/**
 *
 * @author alumno
 */
public class OrdenaPersonaPorId implements Comparator<Usuario>{
    
    @Override
    public int compare(Usuario o1, Usuario o2){
        int result = o1.getNombre().compareTo(o2.getNombre());
        if (result!=0){
            return result;
        }
        
        //result = Integer.compare(o1.getEdad(), o2.getEdad());
        result = o1.getEdad() - o2.getEdad();
        return result;
    }
    
}
