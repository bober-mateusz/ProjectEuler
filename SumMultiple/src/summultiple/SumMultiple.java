/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summultiple;

import java.util.Scanner;
import java.util.HashSet;

/**
 *
 * @author venom
 */
public class SumMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet multiples = new HashSet();
        int multiplex = 3;
        int multipley = 5;
        while(multiplex < 1000)
        {
         multiples.add(multiplex);
         multiplex += 3;
        }
         while(multipley < 1000)
        {
         multiples.add(multipley);
         multipley += 5;
        }
        
        int sum = 0;
        for (Object x : multiples)
        {
            sum += (int)x;
        }
        System.out.println(sum);
    }
    
}
