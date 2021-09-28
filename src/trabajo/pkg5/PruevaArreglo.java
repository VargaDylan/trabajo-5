/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.pkg5;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PruevaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int largoArreglo1,numerosLista,largoM2;
     
            Scanner entrada= new Scanner(System.in);
 Scanner estring= new Scanner(System.in);
 System.out.println("ingrese cantidad de numeros dentro de la lista: ");    
   largoArreglo1=entrada.nextInt();
   int[] arreglo1=new int[largoArreglo1];
   for(int i=0;i<largoArreglo1;i++){
       System.out.print("ingrese n°"+(i+1)+": ");
          arreglo1[i]=entrada.nextInt();
       }
   
   System.out.print("la suma de la lista es: "+Arreglo.sumarLista(arreglo1));
   System.out.println();
   System.out.print("el numero mas alto es: "+Arreglo.buscarMayor(arreglo1));
   System.out.println();
    
   System.out.printf("ingrese largo de la matris o arreglo bidimencional: ");
   largoM2=entrada.nextInt();
    int[][] matris=new int[largoM2][];
    for (int g=0;g<largoM2;g++){
      System.out.print("ingrese numero de columnas en la fila: "+(1+g)+":  ");
        matris[g]=new int[entrada.nextInt()];
    }
    System.out.println("rellenaremos el arreglo bidimencional con rand para realizar la prueba");
    
        for (int[] matri : matris) {
            for (int r = 0; r < matri.length; r++) {
                matri[r] = (int) (Math.random()*100);
            }
        }
    for (int q=0;q<matris.length;q++){
      for (int r=0;r<matris[q].length;r++){
          System.out.println("maris_["+(q+1)+"]["+(r+1)+"]: "+(matris[q][r]));
      }
    
    }
   System.out.printf("el mayor numero dentro del arregolo es:  "+Arreglo.buscarMayor(matris));
   System.out.println();
   System.out.println("ingrese una cadena de estrig");
   String a=estring.nextLine();
   
   
   
 
   System.out.printf("el numero de vocales dentro del String |"+a+"| es de:  "+Arreglo.cuentaVocales(a)+" vocales.");
  System.out.println();
 
 System.out.println("que caracter desea buscar dentro del String: ");
 char b=estring.next().charAt(0);
 System.out.printf("la cantidad de veces que aparce el caracter |"+b+"| dentro del String  es de:  "+Arreglo.cuentaCaracter(a, b)+" veces");
    
    }
    
}//creo esta
