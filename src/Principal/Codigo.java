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
public class Codigo {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner leer = new Scanner(System.in);
        float n_aleatorio =0, Xi, Yi,fxi;
        int Coefx, potx, varindep,cant_numale, int_a, int_b,int_m;
        DecimalFormat alea= new DecimalFormat("#.###");
        Random n_alea= new Random();
        int contador=0;
        
        float res1, res2,res3;
        // variables para la integral 
        System.out.print("Define el coeficiente de la variable X: ");
        Coefx= leer.nextInt();
        
        
        System.out.print("Define la potencia de la variable X^: ");
        potx = leer.nextInt();
        
        
        System.out.print("Declara el termino independiente: ");
        varindep= leer.nextInt();
        
        
        System.out.print("Define el intervalo 'a':  ");
        int_a=leer.nextInt();
        
        
        System.out.print("Define el intervalo 'b':  ");
        int_b= leer.nextInt();
        
        
        System.out.print("Define el intervalo 'm':  ");
        int_m= leer.nextInt();
        
        
        System.out.print("Cuantos numeros aleatorios deseas: ");
        cant_numale= leer.nextInt();
        
        float vector_aleatorios[]= new float[cant_numale];
        float vector_resultados[][]= new float [cant_numale][2];
        
        
        
        System.out.print("\n\n Los numeros aleatorios a ocupar son: \n " );
        for (int i=0; i<cant_numale; i++)
        {
            n_aleatorio= (float)(n_alea.nextFloat() + 1);
            System.out.print(alea.format(n_aleatorio));
            vector_aleatorios[i]=n_aleatorio;
        }
        
        
        System.out.print("Operaciones con los numeros aleatorios: \n");
        for(int j=0; j<cant_numale;j +=2)
        {
            Xi=int_a +vector_aleatorios[j] * (int_b - int_a);
            System.out.print("El valor de Xi, cuando usamos:  "+alea.format(vector_aleatorios[j])+ "Es de:  "+alea.format(Xi));
            Yi= vector_aleatorios[j+1] * int_m;
            System.out.print("El valor de Yi, cuando usamos:  "+alea.format(vector_aleatorios[j + 1])+ "Es de:  "+alea.format(Yi));
            fxi= (float)(Coefx * Math.pow(Xi,potx) + varindep);
            System.out.print("El valor de f(xi):   "+alea.format(fxi));
            if (Yi <= fxi)
            {
                System.out.print("Yi es igual o menor que f(xi). Por lo tanto el caso es EXITOSO \n");
                vector_resultados[contador][0]= vector_aleatorios[j];
                vector_resultados[contador][1]= vector_aleatorios[j +1];
                contador++; 
            }
            else 
            {
                System.out.println("Yi es igual o mayor que f(xi)Por lo tanto el caso NO ES EXITOSO \n");
                
            }
        }   
        
        System.out.println("\n\n Los Números que cumplen con el Punto de Exito son:  " + contador+ "\n");
        
        for(int k= 0; k<contador; k++){
            for(int l=0; l<2; l++)
            {
                System.out.print((k + 1)+ " La combinación:  " + alea.format(vector_resultados[k][l]));
            }
            System.out.println("");
        }
        
        System.out.print("\n El valor de la integral es: ");
        res1=(float) ((float) ((Coefx * Math.pow(int_b, (potx +1))) / (potx +1)) - ((Coefx * Math.pow(int_a, (potx + 1))) / (potx + 1)));
        res2=(float) (varindep * int_b) - (varindep * int_a);
        System.out.print(res1 + res2);
        
        System.out.print("\n El valor que nos da el metodo es de :  ");
        res3= (contador / (cant_numale /2)) * (int_b - int_a) * int_m;
        System.out.println(res3);
        
        System.out.print("Haciendo comparacion entre resultados "+(res1 + res2)+ "____"+ res3);
                
    }
}
