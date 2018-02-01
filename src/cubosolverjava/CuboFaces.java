/*
    Neste nivel, o cubo é definido como um conjunto de 6 faces
    cada uma com 9 pecas, totalizando 54
    
    
*/
package cubosolverjava;

/**
 *
 * @author Dener
 */

public class CuboFaces {
    
    /*
        Quinas 
        São 8 quinas, cada uma delas tem 3 lados (cores)
        segue a definição das cores das quinas
        URF - UFL - ULB - UBR - DFR - DLF - DBL - DRB
    */
    static final int quinas[][] = {{CuboFaces.u9, CuboFaces.r1, CuboFaces.f3},     /* URF */
                        {CuboFaces.u7, CuboFaces.f1, CuboFaces.l3},   /* UFL */
                        {CuboFaces.u1, CuboFaces.l1, CuboFaces.b3},   /* ULB */
                        {CuboFaces.u3, CuboFaces.b1, CuboFaces.r3},   /* UBR */
                        {CuboFaces.d3, CuboFaces.f9, CuboFaces.r7},   /* DFR */
                        {CuboFaces.d1, CuboFaces.l9, CuboFaces.f7},   /* DLF */
                        {CuboFaces.d7, CuboFaces.b9, CuboFaces.l7},   /* DBL */
                        {CuboFaces.d9, CuboFaces.r9, CuboFaces.b7}};  /* DRB */
    
    
    /*
        Meios
        São 12 meios, cada um deles tem 2 lados (cores)
        segue a definição das cores dos meios
        UF - UL - UB - UR - DF - DL - DB - DR - FR - FL - BL - BR
    */
    static final int meios[][] = {{CuboFaces.u8, CuboFaces.f2},
                        {CuboFaces.u4, CuboFaces.l2},
                        {CuboFaces.u2, CuboFaces.b2},
                        {CuboFaces.u6, CuboFaces.r2}, 
                        {CuboFaces.d2, CuboFaces.f8}, 
                        {CuboFaces.d4, CuboFaces.l8},
                        {CuboFaces.d8, CuboFaces.b8},
                        {CuboFaces.d6, CuboFaces.r8},
                        {CuboFaces.f6, CuboFaces.r4},
                        {CuboFaces.f4, CuboFaces.l6},
                        {CuboFaces.b6, CuboFaces.l4},
                        {CuboFaces.b4, CuboFaces.r6}};
    
    
    /*
        Centros
        São 6 centros cada um deles tem apenas um lado (uma cor)
        não é possivel trocar centros de posição 
        segue a definição dos centros
        U - F - L - R - B - D 
    */
    static final int centros[] = {CuboFaces.u5,        /* U */
                        CuboFaces.f5,     /* F */
                        CuboFaces.l5,     /* L */
                        CuboFaces.r5,     /* R */
                        CuboFaces.b5,     /* B */
                        CuboFaces.d5};    /* D */
    
    
    /*
        array que representa o cubo seguindo as definiçoes anteriores
    */
    private byte cubo[] = new byte[54];
    
    /*
        Verifica se existe 9 pecas de cada cor
        @return true se sim e false se não
    */
    public boolean verifica() {
        // o contador se refere as cores
        // shift = 0, cor = 0; shift = 1, cor = 1; etc...
        int contador = 0x000000;
        
        for(int i = 0; i < 54; i++) {
            contador += (1 << (this.cubo[i] << 2));
        }
        
        return contador == 0x999999;
    } 
    
    
    /*
        passa de CuboFaces para cuboPecas
    */
    static void paraCuboPecas(CuboPecas cp) {
        
    }
    
    
    
    /*
        Declaraçao de todas as peças
        U - peças
    */
    static final int u1 = 0;
    static final int u2 = 1;
    static final int u3 = 2;
    static final int u4 = 3;
    static final int u5 = 4;
    static final int u6 = 5;
    static final int u7 = 6;
    static final int u8 = 7;
    static final int u9 = 8;
    
    /*
        F - peças
    */
    static final int f1 = 9;
    static final int f2 = 10;
    static final int f3 = 11;
    static final int f4 = 12;
    static final int f5 = 13;
    static final int f6 = 14;
    static final int f7 = 15;
    static final int f8 = 16;
    static final int f9 = 17;
    
    /*
        L - peças
    */
    static final int l1 = 18;
    static final int l2 = 19;
    static final int l3 = 20;
    static final int l4 = 21;
    static final int l5 = 22;
    static final int l6 = 23;
    static final int l7 = 24;
    static final int l8 = 25;
    static final int l9 = 26;
    
    /*
        R - peças
    */
    static final int r1 = 27;
    static final int r2 = 28;
    static final int r3 = 29;
    static final int r4 = 30;
    static final int r5 = 31;
    static final int r6 = 32;
    static final int r7 = 33;
    static final int r8 = 34;
    static final int r9 = 35;
    
    /*
        B - peças
    */
    static final int b1 = 36;
    static final int b2 = 37;
    static final int b3 = 38;
    static final int b4 = 39;
    static final int b5 = 40;
    static final int b6 = 41;
    static final int b7 = 42;
    static final int b8 = 43;
    static final int b9 = 44;
    
    /*
        D - peças
    */
    static final int d1 = 45;
    static final int d2 = 46;
    static final int d3 = 47;
    static final int d4 = 48;
    static final int d5 = 49;
    static final int d6 = 50;
    static final int d7 = 51;
    static final int d8 = 52;
    static final int d9 = 53;
    
}
