package pe.edu.upeu.Matrizes;

public class TransformarM {
    public void imprimirCadena(String[][] matriz) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if(matriz[f][c]!=null && !matriz[f][c].equals("")){
                    System.out.print(matriz[f][c]+"\t");
                }else{
                    System.out.print("\t");
                }                
            }
            System.out.println("");
        } 
    } 
    
public void transformada06(int dimen, int numInit){
       String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j <= i; j++){
                matriz [i][j]=""+numInit;
                numInit++;
            }
        }
        imprimirCadena(matriz);
    }

    public void transformada07(int dimen, int numInit){
        String[][] matriz = new String[dimen][dimen];
        for (int i = 0; i < dimen; i++) {
            for (int j = 0 ; j < (dimen-i); j++) {
                matriz[i][j]=""+numInit;
                numInit++;
            }
        }
        imprimirCadena(matriz);
    }
    public void transformada08(int dimen, int numInit){
        String[][] matriz = new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= (dimen-1)-i ; j++) {
                matriz[i][(j+i)]=" "+numInit;
                numInit++;
            }
        }
        imprimirCadena(matriz);
    }
   
    public void transformada09(int dimen, int numInit){
        String[][] matriz = new String[dimen][dimen];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j <= i; j++) {
                matriz[i][((dimen-1)-i)+j]=" "+numInit;
                numInit++;
            }
        }
        imprimirCadena(matriz);
    }

    public void transformada14(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[j][i]=""+valInit;
                valInit++;
            }
        }
        imprimirCadena(matriz);
    }
    
    public void transformada16(int dimen, int valInit) {
        String[][] matriz=new String[dimen][dimen];// i =filas, j=columnas
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[(dimen-1)-j][i]=""+valInit;
                valInit++;
            }
        }
        imprimirCadena(matriz); 
    }

    public void transformada20(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <=i; j++) {
                matriz[(dimen-1)-j][(dimen-1)-i]=""+numInit;
                numInit++;
            }
        }
        imprimirCadena(matriz); 
    }

    public void transformada21(int dimen, int numInit) {
        String[][] matriz=new String[dimen][dimen];// i = Fila; j=Columna
        for (int j = 0; j < matriz[0].length; j++) {
            if (j%2==0) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }
            } else {
                for (int i = matriz.length-1; i >=0 ; i--) {
                    matriz[i][j]=""+numInit;
                    numInit++;
                }                
            } 
        }
        imprimirCadena(matriz);        
    }
  public static void main(String[] args) {
      
    TransformarM htca=new TransformarM();
    System.out.println("Ejercicio N° 6");
    htca.transformada06(5,0);
    System.out.println("Ejercicio N° 7");
    htca.transformada07(5,0);
    System.out.println("Ejercicio N° 8");
    htca.transformada08(5, 0);
    System.out.println("Ejercicio N° 9");
    htca.transformada09(5, 0);
    System.out.println("Ejercicio N° 14");
    htca.transformada14(5, 0);
    System.out.println("Ejercicio N° 16");
    htca.transformada16(5, 0);
    System.out.println("Ejercicio N° 20");
    htca.transformada20(5, 0);
    System.out.println("Ejercicio N° 21");
    htca.transformada21(5,0);
    System.out.println("Ejercicio N° 24");
    
  } 
}
       