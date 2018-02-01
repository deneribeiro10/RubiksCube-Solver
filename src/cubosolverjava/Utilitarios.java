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
public class Utilitarios {
    
    
    
    /*
        definindo os 6 centros
        0 a 5
    */
    static final byte U = 0;
    static final byte F = 1;
    static final byte L = 2;
    static final byte R = 3;
    static final byte B = 4;
    static final byte D = 5;
    
    
    /*
        Definindo os 18 movimentos
    */
    static final byte Ux1 = 0x0;
    static final byte Ux2 = 0x1;
    static final byte Ux3 = 0x2;
    static final byte Fx1 = 0x3;
    static final byte Fx2 = 0x4;
    static final byte Fx3 = 0x5;
    static final byte Lx1 = 0x6;
    static final byte Lx2 = 0x7;
    static final byte Lx3 = 0x8;
    static final byte Rx1 = 0x9;
    static final byte Rx2 = 0xA;
    static final byte Rx3 = 0xB;
    static final byte Bx1 = 0xC;
    static final byte Bx2 = 0xD;
    static final byte Bx3 = 0xE;
    static final byte Dx1 = 0xF;
    static final byte Dx2 = 0x10;
    static final byte Dx3 = 0x11;
    
    public final String[] movimentosString 
            = {"U ", "U2", "U'", "F ", "F2", "F'", "L ", "L2", "L'",
               "R ", "R2", "R'", "B ", "B2", "B'", "D ", "D2", "D'"};
    
    public void adicionaMovimentos(String s, byte move) {
        s += this.movimentosString[move] + ",";
    }
    
    static int calculaFatorial(int n) {
        if(n <= 1) {
            return 1;
        }
        return n * calculaFatorial(n - 1);
    }
    
    static int arrayParaValorPerm(byte[] arr0, boolean quinaMeio) {      
        int valor = 0;  
        int tamanho = quinaMeio ? 12 : 8;
        byte[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int indice;
        
        for(int i = 0; i < tamanho-1; i++) {
            indice = (int)(arr0[i] & 0xF);
            valor += Utilitarios.calculaFatorial(tamanho-i-1) * array[indice];
            for(int j = indice + 1; j < 12; j++) {
                array[j]--;
                
            }
        }
        
        return valor;
    } 
    
    static void valorPermParaArray(byte[] arr0, int valor, boolean quinaMeio) {
        byte[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int tamanho = quinaMeio ? 12 : 8;
        byte[] valores = new byte[tamanho-1];
        
        
        for(int i = 2; i <= tamanho; i++) {
            valores[i-2] = (byte)(valor % i);
            valor /= i;
        }
        
        for(int j = 0; j < tamanho-1; j++) {
            
            arr0[j] &= (0x7 << 4); // limpa o valor de permutacao e mantem de orientacao
            
            int v = (int) valores[tamanho-j-2]; // indice para array e valores
                       
            arr0[j] |= array[v];
            
            int tamanhoCopia = 11-v;
            System.arraycopy(array, (v+1), array, v, tamanhoCopia);
            array[11] = 0;
        }
        
        
        arr0[tamanho-1] &= (0x7 << 4);
        arr0[tamanho-1] |= array[0];
    }
    
    static void valorOriParaArray(byte[] arr0, int valor, boolean quinaMeio) {
        int orientacao = quinaMeio ? 2 : 3;
        int tamanho = quinaMeio ? 12 : 8;
        int maxOri = quinaMeio ? 12 : 15;
        
        for(int i = 0; i < tamanho-1; i++) {
            arr0[i] &= 0xF;
            arr0[i] |= (byte)(valor % orientacao) << 4;
            valor /= orientacao;
            maxOri -= (arr0[i] >> 4) & 0xF;
        }

        arr0[tamanho-1] &= 0xF;
        arr0[tamanho-1] |= (byte)(maxOri % orientacao) << 4;
    }
    
    static int arrayParaValorOri(byte[] arr0, boolean quinaMeio) {
        int orientacao = quinaMeio ? 2 : 3;
        int tamanho = quinaMeio ? 12 : 8;
        int valor = 0;
        
        for(int i = 0; i < tamanho-1; i++) {
            valor += Math.pow(orientacao, i) * (int)((arr0[i] >> 4) & 0xF);
        }
        
        return valor;
    }
       
}

