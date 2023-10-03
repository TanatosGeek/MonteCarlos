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
        int pos[]={0,1,2,3,4,5,6,7,8,9};
        double prob=0.1;
        double LimInf []={0,prob*1,prob*2,prob*3,prob*4,prob*5,prob*6,prob*7,prob*8, prob*9};
        double LimSup[]={prob*1,prob*2,prob*3,prob*4,prob*5,prob*6,prob*7,prob*8, prob*9,1};
        Random Numero=new Random();
        double Num_ale=Numero.nextDouble();
            for(int x=0; x<10;x++)
                if(Num_ale>LimInf[x]&&Num_ale<=LimSup[x])
                return pos[x];
          return -1;
    }
}
