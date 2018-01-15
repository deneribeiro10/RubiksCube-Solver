/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubosolverjava;

/**
 *
 * @author Dener
 */
public class Cubo {
    private int[] pQuinas;
    private int[] oQuinas;
    private int[] pMeios;
    private int[] oMeios;
    
    Cubo() {
        this.pQuinas = new int[8];
        this.oQuinas = new int[8];
        this.pMeios = new int[12];
        this.oMeios = new int[12];
    }
    
    void cuboResolvido() {
        this.pQuinas = new int[]{1,2,3,4,5,6,7,8};
        this.oQuinas = new int[]{0,0,0,0,0,0,0,0};
        this.pMeios = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
        this.oMeios = new int[]{0,0,0,0,0,0,0,0,0, 0, 0, 0};
    }
    
    
    /*
     * Face moves
     */
    void moveF() {
         
        // orientacao das quinas
        int oQuinasInt = this.oQuinas[2];
        this.oQuinas[2] = ( this.oQuinas[3] + 1 ) % 3;
        this.oQuinas[3] = ( this.oQuinas[7] + 2 ) % 3;
        this.oQuinas[7] = ( this.oQuinas[6] + 1 ) % 3;
        this.oQuinas[6] = ( oQuinasInt + 2 ) % 3;
        
        // permutacao das quinas movimento F
        int pQuinasInt = this.pQuinas[2];
        this.pQuinas[2] = this.pQuinas[3];
        this.pQuinas[3] = this.pQuinas[7];
        this.pQuinas[7] = this.pQuinas[6];
        this.pQuinas[6] = pQuinasInt;
        
        // orientacao meios
        int oMeiosInt = this.oMeios[2];
        this.oMeios[2] = ( this.oMeios[7] + 1 ) % 2;
        this.oMeios[7] = ( this.oMeios[10] + 1 ) % 2;
        this.oMeios[10] = ( this.oMeios[6] + 1 ) % 2;
        this.oMeios[6] = ( oMeiosInt + 1 ) % 2;
        
        // permutacao meios
        int pMeiosInt = this.pMeios[2];
        this.pMeios[2] = this.pMeios[7];
        this.pMeios[7] = this.pMeios[10];
        this.pMeios[10] = this.pMeios[6];
        this.pMeios[6] = pMeiosInt;
        
        
    }
    void moveF2() {
        // orientacao das quinas
        int oQuinasInt = this.oQuinas[2];
        this.oQuinas[2] = this.oQuinas[7];
        this.oQuinas[7] = oQuinasInt;
        oQuinasInt = this.oQuinas[3];
        this.oQuinas[3] = this.oQuinas[6];
        this.oQuinas[6] = oQuinasInt;
        
        // permutacao das quinas movimento F
        int pQuinasInt = this.pQuinas[2];
        this.pQuinas[2] = this.pQuinas[7];
        this.pQuinas[7] = pQuinasInt;
        pQuinasInt = this.pQuinas[3];
        this.pQuinas[3] = this.pQuinas[6];
        this.pQuinas[6] = pQuinasInt;
        
        // orientacao meios
        int oMeiosInt = this.oMeios[2];
        this.oMeios[2] = this.oMeios[10];
        this.oMeios[10] = oMeiosInt;
        oMeiosInt = this.oMeios[6];
        this.oMeios[6] = this.oMeios[7];
        this.oMeios[7] = oMeiosInt;
        
        // permutacao meios
        int pMeiosInt = this.pMeios[2];
        this.pMeios[2] = this.pMeios[10];
        this.pMeios[10] = pMeiosInt;
        pMeiosInt = this.pMeios[6];
        this.pMeios[6] = this.pMeios[7];
        this.pMeios[7] = pMeiosInt;
    }
    void move_F() {
        
        // orientacao das quinas
        int oQuinasInt = this.oQuinas[2];
        this.oQuinas[2] = ( this.oQuinas[6] + 1 ) % 3;
        this.oQuinas[6] = ( this.oQuinas[7] + 2 ) % 3;
        this.oQuinas[7] = ( this.oQuinas[3] + 1 ) % 3;
        this.oQuinas[3] = ( oQuinasInt + 2 ) % 3;
        
        // permutacao das quinas movimento F
        int pQuinasInt = this.pQuinas[2];
        this.pQuinas[2] = this.pQuinas[6];
        this.pQuinas[6] = this.pQuinas[7];
        this.pQuinas[7] = this.pQuinas[3];
        this.pQuinas[3] = pQuinasInt;
        
        // orientacao meios
        int oMeiosInt = this.oMeios[2];
        this.oMeios[2] = ( this.oMeios[6] + 1 ) % 2;
        this.oMeios[6] = ( this.oMeios[10] + 1 ) % 2;
        this.oMeios[10] = ( this.oMeios[7] + 1 ) % 2;
        this.oMeios[7] = ( oMeiosInt + 1 ) % 2;
        
        // permutacao meios
        int pMeiosInt = this.pMeios[2];
        this.pMeios[2] = this.pMeios[6];
        this.pMeios[6] = this.pMeios[10];
        this.pMeios[10] = this.pMeios[7];
        this.pMeios[7] = pMeiosInt;
        
    }
    
    /*
     * Rigt moves
     */
    void moveR() {
        
        // orientacao das quinas
        int oQuinasInt = this.oQuinas[2];
        this.oQuinas[2] = ( this.oQuinas[6] + 2 ) % 3;
        this.oQuinas[6] = ( this.oQuinas[5] + 1 ) % 3;
        this.oQuinas[5] = ( this.oQuinas[1] + 2 ) % 3;
        this.oQuinas[1] = ( oQuinasInt + 1 ) % 3;
        
        // permutacao das quinas movimento F
        int pQuinasInt = this.pQuinas[2];
        this.pQuinas[2] = this.pQuinas[6];
        this.pQuinas[6] = this.pQuinas[5];
        this.pQuinas[5] = this.pQuinas[1];
        this.pQuinas[1] = pQuinasInt;
        
        // orientacao meios
        int oMeiosInt = this.oMeios[1];
        this.oMeios[1] = this.oMeios[6];
        this.oMeios[6] = this.oMeios[9];
        this.oMeios[9] = this.oMeios[5];
        this.oMeios[5] = oMeiosInt;
        
        // permutacao meios
        int pMeiosInt = this.pMeios[1];
        this.pMeios[1] = this.pMeios[6];
        this.pMeios[6] = this.pMeios[9];
        this.pMeios[9] = this.pMeios[5];
        this.pMeios[5] = pMeiosInt;
        
    }
    void moveR2() {
        
        // orientacao das quinas
        int oQuinasInt = this.oQuinas[2];
        this.oQuinas[2] = this.oQuinas[5];
        this.oQuinas[5] = oQuinasInt;
        oQuinasInt = this.oQuinas[1];
        this.oQuinas[1] = this.oQuinas[6];
        this.oQuinas[6] = oQuinasInt;
        
        // permutacao das quinas
        int pQuinasInt = this.pQuinas[2];
        this.pQuinas[2] = this.pQuinas[5];
        this.pQuinas[5] = pQuinasInt;
        pQuinasInt = this.pQuinas[1];
        this.pQuinas[1] = this.pQuinas[6];
        this.pQuinas[6] = pQuinasInt;
        
        // orientacao meios
        int oMeiosInt = this.oMeios[1];
        this.oMeios[1] = this.oMeios[9];
        this.oMeios[9] = oMeiosInt;
        oMeiosInt = this.oMeios[5];
        this.oMeios[5] = this.oMeios[6];
        this.oMeios[6] = oMeiosInt;
        
        // permutacao meios
        int pMeiosInt = this.pMeios[1];
        this.pMeios[1] = this.pMeios[9];
        this.pMeios[9] = pMeiosInt;
        pMeiosInt = this.pMeios[5];
        this.pMeios[5] = this.pMeios[6];
        this.pMeios[6] = pMeiosInt;
        
    }
    void move_R() {
        
        // orientacao das quinas
        int oQuinasInt = this.oQuinas[2];
        this.oQuinas[2] = ( this.oQuinas[1] + 2 ) % 3;
        this.oQuinas[1] = ( this.oQuinas[5] + 1 ) % 3;
        this.oQuinas[5] = ( this.oQuinas[6] + 2 ) % 3;
        this.oQuinas[6] = ( oQuinasInt + 1 ) % 3;
        
        // permutacao das quinas movimento F
        int pQuinasInt = this.pQuinas[2];
        this.pQuinas[2] = this.pQuinas[1];
        this.pQuinas[1] = this.pQuinas[5];
        this.pQuinas[5] = this.pQuinas[6];
        this.pQuinas[6] = pQuinasInt;
        
        // orientacao meios
        int oMeiosInt = this.oMeios[1];
        this.oMeios[1] = this.oMeios[5];
        this.oMeios[5] = this.oMeios[9];
        this.oMeios[9] = this.oMeios[6];
        this.oMeios[6] = oMeiosInt;
        
        // permutacao meios
        int pMeiosInt = this.pMeios[1];
        this.pMeios[1] = this.pMeios[5];
        this.pMeios[5] = this.pMeios[9];
        this.pMeios[9] = this.pMeios[6];
        this.pMeios[6] = pMeiosInt;
        
    }
    
    void mostraCubo() {
        int i;
	System.out.print("pQuinas: ");
	for(i = 0; i < 8; i++) {
            System.out.print(this.pQuinas[i]);
            System.out.print(" ");
	}
	System.out.print("\noQuinas: ");
	for(i = 0; i < 8; i++) {
            System.out.print(this.oQuinas[i]);
            System.out.print(" ");
	}
	System.out.print("\npMeios: ");
	for(i = 0; i < 12; i++) {
            System.out.print(this.pMeios[i]);
            System.out.print(" ");
	}
	System.out.print("\noMeios: ");
	for(i = 0; i < 12; i++) {
            System.out.print(this.oMeios[i]);
            System.out.print(" ");
	}
	System.out.println("");
    }
    
    void setCubo(Cubo c) {
        
    }
    
    Cubo getCubo() {
        return this;
    }
    
}
