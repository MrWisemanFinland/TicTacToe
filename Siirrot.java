/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikko
 */
import java.util.*;
public class Siirrot {

    private int[] x;
    private int[] y;
    private int[] z;

    public Siirrot() {
        this.x = new int[4];
        this.y = new int[4];
        this.z = new int[4];

    }

    public boolean siirto(int x2, int y2, int z2, int pelaaja) {
        if (!(x2 == 0)) {
            x[x2] = pelaaja;
        }

        if (!(y2 == 0)) {
            y[y2] = pelaaja;
        }

        if (!(z2 == 0)) {
            z[z2] = pelaaja;
        }
        
                
        if ((Math.abs(x[1] + x[2] + x[3]) == 3) || (Math.abs(y[1] + y[2] + y[3]) == 3) || (Math.abs(z[1] + z[2] + z[3]) == 3)
                || (Math.abs(x[1] + y[1] + z[1]) == 3) || (Math.abs(x[2] + y[2] + z[2]) == 3) || (Math.abs(x[3] + y[3] + z[3]) == 3)
                || (Math.abs(x[1] + y[2] + z[3]) == 3) || (Math.abs(x[3] + y[2] + z[1]) == 3)) {
            return false;
        }

        return true;
    }
    
    
}
