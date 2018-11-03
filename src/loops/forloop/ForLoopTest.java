/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops.forloop;

/**
 *
 * @author duminda
 */
public class ForLoopTest {

    public static void main(String[] args) {

        // For Loop Syntax
        // for(Intialization Statement ; Condtion ; Increment/ Decrement)
        // Print x 1-10
        // int x is valid to use inside for loop only
        for (int x = 0; x < 10; x++) {
            System.out.println("X : " + x);
        }

        // For Loop Can be define like this also. This way similar way like while loop
        int y = 0;
        for(;y < 10 ; ){
            System.out.println("y : "+ y);
            ++y;
        }
        
        // Nested For Loop
        // Nested For use when iterate outer loop, if any sub iterations inside outer loop
        // Following Program Every single iteration of outer loop, inner loop iterate 3 times
        
        // Outer Loop
        for(int a = 0 ; a < 10 ; a++){
            System.out.println("a : " + a);
            // Inner Loop
            for(int b = 0 ; b < 3 ; b++){
                System.out.println("b : " + b);
            }
            
            System.out.println("---------------------");
        }
        
        // Star Traingle
        /*
        
        Print following star traingle
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
        
        */
        for(int a = 0 ; a < 5 ; a++){
            // Inner Loop
            for(int b = 0 ; b <= a ; b++){
                System.out.print("* ");
            }
            
            System.out.print("\n");
        }
        
        
    }

}
