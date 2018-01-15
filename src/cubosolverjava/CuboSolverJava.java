/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubosolverjava;

import java.util.Arrays;

/**
 *
 * @author Dener
 */
public class CuboSolverJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        byte[] quinas = new byte[8];
        byte[] meios = new byte[12];
        int valor;
        
        CuboPecas.inicializaMovimentos();
                
        for(int i = 0; i < 18; i++) {
            CuboPecas.movimentos[i].getArrayQuinas(quinas);
            valor = Utilitarios.arrayParaValorOri(quinas, false);
            System.out.println(valor);
        }
              
    }
}
