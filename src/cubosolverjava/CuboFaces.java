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
        Faces - cores
        A soma dos valores das cores de lados opostos é sempre 5
    */
    int U = 0;
    int F = 1;
    int L = 2;
    int R = 3;
    int B = 4;
    int D = 5;
    
    /*
        U - peças
    */
    int u1 = 0;
    int u2 = 1;
    int u3 = 2;
    int u4 = 3;
    int u5 = 4;
    int u6 = 5;
    int u7 = 6;
    int u8 = 7;
    int u9 = 8;
    
    /*
        D - peças
    */
    int d1 = 9;
    int d2 = 10;
    int d3 = 11;
    int d4 = 12;
    int d5 = 13;
    int d6 = 14;
    int d7 = 15;
    int d8 = 16;
    int d9 = 17;
    
    /*
        F - peças
    */
    int f1 = 18;
    int f2 = 19;
    int f3 = 20;
    int f4 = 21;
    int f5 = 22;
    int f6 = 23;
    int f7 = 24;
    int f8 = 25;
    int f9 = 26;
    
    /*
        B - peças
    */
    int b1 = 27;
    int b2 = 28;
    int b3 = 29;
    int b4 = 30;
    int b5 = 31;
    int b6 = 32;
    int b7 = 33;
    int b8 = 34;
    int b9 = 35;
    
    /*
        L - peças
    */
    int l1 = 36;
    int l2 = 37;
    int l3 = 38;
    int l4 = 39;
    int l5 = 40;
    int l6 = 41;
    int l7 = 42;
    int l8 = 43;
    int l9 = 44;
    
    /*
        R - peças
    */
    int r1 = 45;
    int r2 = 46;
    int r3 = 47;
    int r4 = 48;
    int r5 = 49;
    int r6 = 50;
    int r7 = 51;
    int r8 = 52;
    int r9 = 53;
    
    
    /*
        Quinas 
        São 8 quinas, cada uma delas tem 3 lados (cores)
        segue a definição das cores das quinas
        URF - UFL - ULB - UBR - DFR - DLF - DBL - DRB
    */
    int quinas[][] = {{u9, r1, f3},     /* URF */
                        {u7, f1, l3},   /* UFL */
                        {u1, l1, b3},   /* ULB */
                        {u3, b1, r3},   /* UBR */
                        {d3, f9, r7},   /* DFR */
                        {d1, l9, f7},   /* DLF */
                        {d7, b9, l7},   /* DBL */
                        {d9, r9, b7}};  /* DRB */
    
    
    /*
        Meios
        São 12 meios, cada um deles tem 2 lados (cores)
        segue a definição das cores dos meios
        UF - UL - UB - UR - DF - DL - DB - DR - FR - FL - BL - BR
    */
    int meios[][] = {{u8, f2},
                        {u4, l2},
                        {u2, b2},
                        {u6, r2}, 
                        {d2, f8}, 
                        {d4, l8},
                        {d8, b8},
                        {d6, r8},
                        {f6, r4},
                        {f4, l6},
                        {b6, l4},
                        {b4, r6}};
    
    
    /*
        Centros
        São 6 centros cada um deles tem apenas um lado (uma cor)
        não é possivel trocar centros de posição 
        segue a definição dos centros
        U - D - F - B - L - R
    */
    int centros[] = {u5,        /* U */
                        d5,     /* D */
                        f5,     /* F */
                        b5,     /* B */
                        l5,     /* L */
                        r5};    /* R */
    
    
    /*
        array que representa o cubo seguindo as definiçoes anteriores
    */
    int cubo[] = new int[54];
    
    
    
}
