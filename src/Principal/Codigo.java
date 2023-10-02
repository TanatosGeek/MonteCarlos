/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;
import java.util.*;
import java.text.*;
/**
 *
 * @author jazmi
 */
public class Codigo
  {
  
    public static int Numeros(){
        int n_aleatorio=0,int_a,int_b;
        int cant_numale;
        Random n_alea= new Random();
        int_a=0;
        int_b=9;
        cant_numale=1;
        for (int i=0; i<cant_numale; i++)
        n_aleatorio= (int)(n_alea.nextDouble()*int_b+1);
        return n_aleatorio;
    }
}
