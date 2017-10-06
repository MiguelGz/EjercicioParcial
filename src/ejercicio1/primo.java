
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Godoy
 */


import java.util.Scanner;

public class primo {

 public static void main(String[] args)  {
        
    

        Scanner primito = new Scanner(System.in);
        
        int p = 0, i, n;
        
        System.out.println("Ingresa el numero a verificar: ");
        
        n = primito.nextInt();
        
        for (i = 1; i < (n + 1); i++) 
            if (n % i == 0) 
                p++;
        if (p != 2) 
            System.out.println("El numero "+n+" no es un numero primo ");
         else 
            System.out.println("El numero "+n+"  es un numero primo ");
        

    }
}