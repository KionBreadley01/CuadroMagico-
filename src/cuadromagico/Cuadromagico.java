/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuadromagico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author ROBERTO
 */
public class Cuadromagico {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) throws IOException {
        int filas, columnas ;
        int constante;    
        
        //tamaño de la matriz  por el usuario 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa las filas  del cubo magico: ");
        filas = Integer.parseInt(reader.readLine());
        
         System.out.println("Ingresa las columnas del cubo magico: ");
        columnas= Integer.parseInt(reader.readLine());
        
        int[][] matriz = new int[filas][columnas];
        
        // El usuario ingresa los numeros del cubo majico 
        System.out.println("Ingresa los numeros del cubo majico: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = Integer.parseInt(reader.readLine());
            }
       }
        // Calcular la constate del cubo majico
        constante = filas*(filas*filas +1)/2;
        
        //la suma del cubo magico F,c,Diagonales
        boolean esMagico = true;
        for (int i = 0; i< filas; i++){
             int sumaFila =0;
             for (int j = 0; j< columnas; j++){
                 sumaFila += matriz[i][j];
             }
             
             System.out.println("La de la filla " + i + "es:" + sumaFila);
             if (sumaFila != constante){
                 esMagico = false;
                 break;
             }
             //suma de columnas 2
             int sumaColumna = 0;
             for (int j = 0; j< columnas; j++){
                 sumaColumna +=matriz [j][i];
             }
              System.out.println("La de la filla " + i +"es:" + sumaColumna);
             if (sumaColumna != constante){
                 esMagico = false;
                 break;
             }
        }
         
        //suma diagonalUno
        int sumaDiagonalUno = 0;
        for (int i = 0; i < filas ; i++){
            sumaDiagonalUno += matriz[i][i];
        }
        System.out.println("La suma del diagonal Uno :" + sumaDiagonalUno);
        
        //suma diagonaDos
        int sumaDiagonalDos = 0;
        for (int i = 0; i < filas ; i++){
            sumaDiagonalDos += matriz[i][i];
        }
        System.out.println("La suma del diagonal Dos :" + sumaDiagonalDos);
        
        if(sumaDiagonalUno != constante || sumaDiagonalDos != constante){
            esMagico = false;
        }
        if(esMagico){
            System.out.println("El cubo es magico");
        }else{
            System.out.println("El cubo no es magico");
        }
    }    
}