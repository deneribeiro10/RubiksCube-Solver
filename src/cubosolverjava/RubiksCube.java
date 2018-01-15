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
public class RubiksCube {
    String F;       // face
    String B;       // back
    String L;       // left
    String R;       // right
    String U;       // up
    String D;       // down
    int h;          // heuristica
    int f;          // f(n) = h(n) + g(n)
    int g;          // peso
    
    public RubiksCube() {
        this.F = "F1F2F3F4F5F6F7F8F9";
        this.B = "B1B2B3B4B5B6B7B8B9";
        this.L = "L1L2L3L4L5L6L7L8L9";
        this.R = "R1R2R3R4R5R6R7R8R9";
        this.U = "U1U2U3U4U5U6U7U8U9";
        this.D = "D1D2D3D4D5D6D7D8D9";
        this.h = this.calculaHeuristica();
        this.f = this.calculaHeuristica();
        this.g = 0;
    }
                
    public int calculaHeuristica() {
        return 0;
    }
    
    
}
