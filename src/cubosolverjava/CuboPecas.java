/*
    Neste nivel o cubo é definido como 26 pecas
    6 centros, 8 quinas e 12 meios


 */
package cubosolverjava;

/**
 *
 * @author Dener
 */
public class CuboPecas {
    
    /*
        Representação do cubo: 
        - quinas (orientaçao e permutação) 
        - meios (orientação e premutação)
    
        Quinas: 
        - representadas por um array de 8 bytes
        - os 4 primeiros bits representam o valor da orientação
        - os 4 ultimos bits representam o valor da permutaçao
    
        Meios:
        - representados por um array de 12 bytes
        - os 4 primeiros bits representam o valor da orientação
        - os 4 ultimos bits representam o valor da permutaçao
    */
    
    
    /*
        Cubo Resolvido:
        - todas as orientacoes = 0
        - valor da peça = indice do array
    */
    private byte quinas[];
    private byte meios[];
    
    /*
        array com os 18 possiveis movimentos 
        está para ser inicializado
    */
    static CuboPecas[] movimentos = new CuboPecas[18]; 
    
    
    public CuboPecas(int permQuinas, int oriQuinas, int permMeios, int oriMeios) {
        this.setPermQuinas(permQuinas);
        this.setOriQuinas(oriQuinas);
        this.setPermMeios(permMeios);
        this.setOriMeios(oriMeios);
    }
    
    public CuboPecas(CuboPecas cp) {
        this.copiaCubos(cp);
    }
    
    public CuboPecas() {
        
    }
    
    /*
        copia cubos
    */
    public void copiaCubos(CuboPecas de) {
        byte[] quina = new byte[8];
        byte[] meio = new byte[12];
        de.getArrayMeios(meio);
        de.getArrayQuinas(quina);
        
        this.setArrayMeios(meio);
        this.setArrayQuinas(quina);
    }
    
    /*
        multiplicacao de cubos, significa sair de um estado e ir para outro a partir de 
        um movimento realizado sobre o cubo
    */   
    static void multQuinas(CuboPecas base, CuboPecas estado, CuboPecas resultado) {
        int oriEstado;
        int oriBase;
        int oriResultado;
        int indice;
        for(int i = CuboPecas.URF; i <= CuboPecas.DFR; i++) { 
            indice = base.quinas[i] & 0xF;
            // limpa
            resultado.quinas[i] &= 0;
            // permutacao
            resultado.quinas[i] |= estado.quinas[indice] & 0xF;
            // orientaçao
            oriEstado = (int) (estado.quinas[indice] & 0x70) >> 4; 
            oriBase = (int) (base.quinas[i] & 0x70) >> 4;
            oriResultado = (oriEstado + oriBase) % 3;
            
            resultado.quinas[i] |= (byte) (oriResultado << 4);
        }
    }
    
    static void multMeios(CuboPecas base, CuboPecas estado, CuboPecas resultado) {
        int oriEstado;
        int oriBase;
        int oriResultado;
        int indice;
        for(int i = CuboPecas.UR ; i <= CuboPecas.BR; i++) {
            indice = base.meios[i] & 0xF;
            // limpa
            resultado.meios[i] &= 0;
            // permutacao
            resultado.meios[i] |= estado.meios[indice] & 0xF;
            // orientaçao
            oriEstado = (int) (estado.meios[indice] & 0x70) >> 4; 
            oriBase = (int) (base.meios[i] & 0x70) >> 4;
            oriResultado = (oriEstado + oriBase) % 2;
            
            resultado.meios[i] |= (byte) (oriResultado << 4);
        }
    }
    
    static void multCubos(CuboPecas base, CuboPecas estado, CuboPecas resultado) {
        CuboPecas.multQuinas(base, estado, resultado);
        CuboPecas.multMeios(base, estado, resultado);
    }
    
    
    /*
        inicializa os movimentos 
    */
    static void inicializaMovimentos() {
               
        CuboPecas.movimentos[0] = new CuboPecas(15120, 0, 119750400, 0);    // U
        CuboPecas.movimentos[3] = new CuboPecas(8064, 412, 29441808, 802);  // F
        CuboPecas.movimentos[6] = new CuboPecas(1230, 1236, 2949660, 0);    // L
        CuboPecas.movimentos[9] = new CuboPecas(21021, 110, 323403417, 0);  // R
        CuboPecas.movimentos[12] = new CuboPecas(224, 1521, 328552, 1160);  // B
        CuboPecas.movimentos[15] = new CuboPecas(9, 0, 5880, 0);            // D
        
        for(int i = 0; i < 18; i+=3) {
            for(int j = 0; j < 2; j++) {
                CuboPecas.movimentos[i + j + 1] = new CuboPecas();
                CuboPecas.multCubos(CuboPecas.movimentos[i], 
                        CuboPecas.movimentos[i + j], 
                        CuboPecas.movimentos[i + j + 1]);
            }
        }
        
    }
    
    /* Setters */
    
    public void setPermQuinas(int permQuinas) {
        Utilitarios.valorPermParaArray(this.quinas, permQuinas, false);
    }
    
    public void setOriQuinas(int oriQuinas) {
        Utilitarios.valorOriParaArray(this.quinas, oriQuinas, false);
    }
    
    public void setPermMeios(int permMeios) {
        Utilitarios.valorPermParaArray(this.meios, permMeios, true);
    } 
    
    public void setOriMeios(int oriMeios) {
        Utilitarios.valorOriParaArray(this.meios, oriMeios, true);
    }
    
    public void setArrayQuinas(byte[] arr) {
        System.arraycopy(arr, 0, this.quinas, 0, 8);
    }
    
    public void setArrayMeios(byte[] arr) {
        System.arraycopy(arr, 0, this.meios, 0, 12);
    }
    
    /* Getters */
    
    public int getPermQuinas() {
        return Utilitarios.arrayParaValorPerm(this.quinas, false);
    }
    
    public int getOriQuinas() {
        return Utilitarios.arrayParaValorOri(this.quinas, false);
    }
    
    public int getPemrMeios() {
        return Utilitarios.arrayParaValorPerm(this.meios, true);
    }
    
    public int getOriMeios() {
        return Utilitarios.arrayParaValorOri(this.meios, true);
    }
    
    public void getArrayQuinas(byte[] arr0) {
        System.arraycopy(this.quinas, 0, arr0, 0, 8);
    }
    
    public void getArrayMeios(byte[] arr0) {
        System.arraycopy(this.meios, 0, arr0, 0, 12);
    }
    
    
    
    /*
        Declaraçao de todas as pecas
    */
    /*
        definindo as 8 quinas
        0 a 7
    */
    static final byte URF = 0;
    static final byte UFL = 1;
    static final byte ULB = 2;
    static final byte UBR = 3;
    static final byte DFR = 4;
    static final byte DLF = 5;
    static final byte DBL = 6;
    static final byte DRB = 7;
    
    /*
        definindo os 12 meios
        0 a 11
    */
    static final byte UR = 0;
    static final byte UF = 1;
    static final byte UL = 2;
    static final byte UB = 3;
    static final byte DR = 4;
    static final byte DF = 5;
    static final byte DL = 6;
    static final byte DB = 7;
    static final byte FR = 8;
    static final byte FL = 9;
    static final byte BL = 10;
    static final byte BR = 11;
}
