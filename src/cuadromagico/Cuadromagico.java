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
        int n , 
        constante;        
        //tamaño de la matriz  por el usuario 
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingresa el tamaño del cubo magico: ");
        n = Integer.parseInt(reader.readLine());
        
        int[][] matriz = new int[n][n];
        
        // El usuario ingresa los numeros del cubo majico 
        System.out.println("Ingresa los numeros del cubo majico: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = Integer.parseInt(reader.readLine());
            }
       }
        // Calcular la constate del cubo majico
        constante = n *(n*n +1)/2;
        
        //la suma del cubo magico F,c,Diagonales
        boolean esMagico = true;
        for (int i = 0; i< n; i++){
             int sumaFila =0;
             for (int j = 0; j< n; j++){
                 sumaFila += matriz[i][j];
             }
             
             System.out.println("La de la filla " + i + "es:" + sumaFila);
             if (sumaFila != constante){
                 esMagico = false;
                 break;
             }
             //suma de columnas 2
             int sumaColumna = 0;
             for (int j = 0; j< n; j++){
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
        for (int i = 0; i < n; i++){
            sumaDiagonalUno += matriz[i][i];
        }
        System.out.println("La suma del diagonal Uno :" + sumaDiagonalUno);
        
        //suma diagonaDos
        int sumaDiagonalDos = 0;
        for (int i = 0; i < n; i++){
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