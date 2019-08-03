/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sticks;
import java.util.*;
/**
 *
 * @author vamsi
 */
public class Sticks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final Scanner m = new Scanner(System.in);
        final int M = m.nextInt();
        final int[] stick = new int[1000];
        for (int i = 0; i < M; i++) {
            final int stickLength = m.nextInt();
            stick[stickLength]++;
        }
        int remSticks = M;
        System.out.println(remSticks);
        for (int i = 0; i < stick.length; i++) {
            if (stick[i] > 0) {
                remSticks -= stick[i];
                if (remSticks == 0) {
                    break;
                }
                System.out.println(remSticks);
            }
        }
        m.close();
    }
    
}
