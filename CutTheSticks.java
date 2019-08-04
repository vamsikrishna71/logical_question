/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cutthesticks;
import java.util.*;
/**
 *
 * @author vamsi
 */
public class CutTheSticks {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the number of sticks");
        Scanner m = new Scanner(System.in);
        int M = m.nextInt();
        int[] stick = new int[1000];
        for (int i = 0; i < M; i++) {
            int stickLength = m.nextInt();
            stick[stickLength]++;
        }
        System.out.println("Remaining Sticks");
        int remSticks = M;
        System.out.println(remSticks);
        for (int i = 0; i < stick.length; i++) {
            if (stick[i] > 0) {
                remSticks = remSticks-stick[i];
                if (remSticks == 0) {
                    break;
                }
                
                System.out.println(remSticks);
            }
        }
        m.close();
    }
    
}
