package trabajo.pkg5;


public class Arreglo {
    
    
    @SuppressWarnings("empty-statement")
    public static int sumarLista(int [] arreglo){
        int total = 0;
             for(int i=0; i<arreglo.length ; i++){
                  total+=arreglo[i];
               }
         return total;
    }
    public static int buscarMayor(int [][] matris){
        int mayor=0;
        for(int a=0;a<matris.length;a++){    //recorro la cantidad de filas
            for (int b = 0; b <matris[a].length; b++) {//recorro las columnas por fila 
              if (matris[a][b]>mayor){ //comparo el valor mayor actual con el valor puntual dentro de la matris o areglo bidimencional y si es mayor :
                  mayor=matris[a][b];//remplaso el valor de mayor con el valor de la matris o arreglo bi dimencional
              }    
            }    
        }
     return mayor;   
     }
    
    //mente en blanco no se como seguir AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ayuda
    public static int cuentaVocales(String cadena){
        int nVocales=0;
        char[] cadenaDeChar= cadena.toCharArray();  //paso el char a un arreglo de char 
        for (int g = 0; g < cadenaDeChar.length; g++) {//recorro el erreclo de char 
            if (cadenaDeChar[g]=='a'||cadenaDeChar[g]=='e'||cadenaDeChar[g]=='i'||cadenaDeChar[g]=='o'||cadenaDeChar[g]=='u'){
                //cada ves que el char sea igual a una vocal incrementa el numero de nVocales 
                nVocales+=1;
                //lo queria hacer con un switch pero no se si se puede hacer que compare chars o como hacer que compare char mejor dicho 
            }
        }
        return nVocales;
        
    }
     public static int cuentaCaracter(String cadena,char caracter){
        int nCaracter=0;
        char[] cadenaDeChar= cadena.toCharArray();  //paso el char a un arreglo de char 
        for (int g = 0; g < cadenaDeChar.length; g++) {//recorro el erreclo de char 
            if (cadenaDeChar[g]==caracter){
                //cada ves que el char sea igual al caracter incrementa el numero de n Caracter
                nCaracter+=1;
            }
        }
        if (nCaracter==0){
            System.out.println("el caracter no esta dentro del String");
            return nCaracter;
        }
        return nCaracter;
   
    }
  public static int buscarMayor(int [] arreglo){
         int mayor=0;
        for (int d = 0; d <= arreglo.length-1; d++) {//recorro las columnas por fila 
              if (arreglo[d]>mayor){ //comparo el valor mayor actual con el valor puntual dentro de la matris o areglo bidimencional y si es mayor :
                  mayor=arreglo[d];
              }
         }   return mayor;
    }
}        
    
