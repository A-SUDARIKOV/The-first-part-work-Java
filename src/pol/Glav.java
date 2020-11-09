/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pol;
import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class Glav {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sred = 6;
        int k = 0;
        int l = 0;
        int N=5;
        int M=6;
        int[][] array = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                array[i][j] = ((int) (Math.random() * 15) - 10);
            }
        }
        System.out.println();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(array[i][j] + " " );
            }
            System.out.println();
        }
        for(int i = 0; i < N; i++){
            k=0;
            for(int j = 0; j < M; j++){
                k+=array[i][j];
            }
            if((k/M)<sred){
                l++;
            }
        }       
        System.out.println(" ");
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(i>j){
                    array[i][j]=0;
                }                
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Количество строк = " + l);
        in.close();
        
    }        
}
