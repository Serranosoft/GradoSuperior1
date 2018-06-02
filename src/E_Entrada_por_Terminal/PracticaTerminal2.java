// PRACTICATERMINAL2. Insertar desde el teclado del terminal 5 cadenas y mostrar las que contengan la letra "a"

package E_Entrada_por_Terminal;


public class PracticaTerminal2{

	public static void main(String[] args){
            
            
            for (int i = 0; i < 5; i++) {
                int c = args[i].indexOf('a');
                if(c>=0){
                    System.out.println(args[i]);
                }
            }

	}
}

