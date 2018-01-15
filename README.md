# Cube Solver Java :anguished:

CubeSolverJava é um projeto desenvolvido com objetivo de resolver um cubo 
mágico a partir de qualquer um de seus possiveis estados de embaralhamento.

## Algoritmo
O algoritmo que será utilizado é uma variacão do [TwoPhase Algorithm](https://github.com/muodov/kociemba)(algoritmo de duas faces). Para este projeto não serão tratadas simetrias do cubo. 

## Modelo
Para início de conversa, um cubo mágico de modelo 3x3x3 pode ser analizado
de diferentes formas. Usaremos duas representações, visualização do cubo como 
seis faces com 9 peças cada uma, e a visualização do cubo como 26 peças, são 
elas: 8 quinas, 12 meios, 6 centros.

A primeira facilita uma visualização real, onde precisamos saber as cores 
das peças ou faces, etc; já a segunda nos permite solucionar o cubo de forma 
mais eficaz.
    
>Se você ja sabe resolver um cubo, esqueça disso, lembre-se que um sistema 
computacional nem sempre segue os mesmos principios da vida real. Não estou 
dizendo que não é possivel relver o cubo utilizando tal metodo, mas sim que não
é uma boa escolha.
    
## Visualização das faces
```
                    **********************
                    *      *      *      *
                    *  u1  *  u2  *  u3  *
                    *      *      *      *
                    **********************
                    *      *      *      *
                    *  u4  *  u5  *  u6  *
                    *      *      *      *
                    **********************
                    *      *      *      *
                    *  u7  *  u8  *  u9  *
                    *      *      *      *
*************************************************************************************
*      *      *      *      *      *      *      *      *     *      *      *      *
*  l1  *  l2  *  l3  *  f1  *  f2  *  f3  *  r1  *  r2  *  r3  *  b1  *  b2  *  b3  *
*      *      *      *      *      *      *      *      *      *      *      *      *
*************************************************************************************
*      *      *      *      *      *      *      *      *      *      *      *      *
*  l4  *  l5  *  l6  *  f4  *  f5  *  f6  *  r4  *  r5  *  r6  *  b4  *  b5  *  b6  *
*      *      *      *      *      *      *      *      *      *      *      *      *
*************************************************************************************
*      *      *      *      *      *      *      *      *      *      *      *      *
*  l7  *  l8  *  l9  *  f7  *  f8  *  f9  *  r7  *  r8  *  r9  *  b7  *  b8  *  b9  *
*      *      *      *      *      *      *      *      *      *      *      *      *
*************************************************************************************
                    *      *      *      *
                    *  d1  *  d2  *  d3  *
                    *      *      *      *
                    **********************
                    *      *      *      *
                    *  d4  *  d5  *  d6  *
                    *      *      *      *
                    **********************
                    *      *      *      *
                    *  d7  *  d8  *  d9  *
                    *      *      *      *
                    **********************
```
