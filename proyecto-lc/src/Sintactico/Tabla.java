


package Sintactico;

public class Tabla {
    
     String M[][]= new String[60][51];
   String produccion ="";    
   char comillas = '"';
   String comilla =Character.toString(comillas);
   
   Tabla(){
       
       
       
       for(int i=0; i<60;i++){
          for(int j=0;j<51;j++){
            M[i][j]=" ";// primero se llena de blancos
            
            M[0][1]="clase"; M[0][2]="$"; M[0][3]=","; M[0][4]="|"; M[0][5]="konstante";M[0][6]="ID"; M[0][7]="="; M[0][8]="&"; M[0][9]="Ø"; M[0][10]="["; M[0][11]="]";M[0][12]="NUMERO"; M[0][13]=comilla; M[0][14]="'"; M[0][15]="falso"; M[0][16]="verdadero"; M[0][17]="entero";M[0][18]="real";M[0][19]="caracter"; M[0][20]="palabra"; M[0][21]="bool"; M[0][22]="vacuo"; M[0][23]="{";M[0][24]="}"; M[0][25]="#"; M[0][26]="@"; M[0][27]="central"; M[0][28]="."; M[0][29]="(";M[0][30]=")"; M[0][31]="liyiy"; M[0][32]="iskirbiy"; M[0][33]=";"; M[0][34]="*"; M[0][35]="-";M[0][36]="+"; M[0][37]="%"; M[0][38]="/"; M[0][39]="si"; M[0][40]="mana"; M[0][41]="kama";M[0][42]="pa";M[0][43]=">"; M[0][44]="<"; M[0][45]="~"; M[0][46]="retornar"; M[0][47]="obvio";M[0][48]="noobvio";M[0][49]="inmune"; M[0][50]="==";
            M[1][0]="<Clases>"; M[1][47]="<A> <Clase>";M[1][48]="<A> <Clase>"; M[1][49]="<A> <Clase>"; 
            M[2][0]="<Clase>";  M[2][47]="} <B> { ID clase <modificador_acceso>";M[2][48]="} <B> { ID clase <modificador_acceso>";M[2][49]="} <B> { ID clase <modificador_acceso>";                
            M[3][0]="<A>";     M[3][2]="λ"; M[3][47]="<A> <Clases>"; M[3][48]="<A> <Clases>";M[3][49]="<A> <Clases>";
            M[4][0]="<B>";     M[4][47]="<R> <modificador_acceso>"; M[4][48]="<R> <modificador_acceso>";M[4][49]="<R> <modificador_acceso>";           
            M[5][0]="<R>";   M[5][5]="<Subprogramas> <Declaraciones>"; M[5][6]="<G> <Subprograma>"; M[5][17]="<G> <Subprograma>";  M[5][18]="<G> <Subprograma>"; M[5][19]="<G> <Subprograma>";  M[5][20]="<G> <Subprograma>";M[5][21]="<G> <Subprograma>";  M[5][22]="<G> <Subprograma>"; M[5][47]="<Subprogramas> <Declaraciones>"; M[5][48]="<Subprogramas> <Declaraciones>";M[5][49]="<Subprogramas> <Declaraciones>";                          
            M[6][0]="<Declaraciones>"; M[6][5]="<C> <Declaración>"; M[6][47]="<C> <Declaración>"; M[6][48]="<C> <Declaración>";M[6][49]="<C> <Declaración>";              
            M[7][0]="<C>";      M[7][3]="<Declaraciones> ,"; M[7][4]="|";
            M[8][0]="<Declaracion>"; M[8][5]="<Valor> == ID <tipo> konstante"; M[8][47]="<S> ID <tipo> <modificador_acceso>"; M[8][48]="<S> ID <tipo> <modificador_acceso>";M[8][49]="<S> ID <tipo> <modificador_acceso>";          
            M[9][0]="<S>";   M[9][3]="λ"; M[9][4]="λ";M[9][10]="<E> ["; M[9][50]="<Valor> ==";
            M[10][0]="<E>";  M[10][11]="]"; M[10][12]="] <Lista_Valores>";M[10][13]="] <Lista_Valores>";M[10][14]="] <Lista_Valores>";M[10][15]="] <Lista_Valores>"; M[10][16]="] <Lista_Valores>";
            M[11][0]="<Valor>";   M[11][12]="NUMERO"; M[11][13]=comilla+"<Lista_ID>"+comilla ;M[11][14]="' ID '";M[11][15]="falso";M[11][16]="verdadero";
            M[12][0]="<Lista_Valores>"; M[12][12]="<F> <Valor>"; M[12][13]="<F> <Valor>";M[12][14]="<F> <Valor>";M[12][15]="<F> <Valor>"; M[12][16]="<F> <Valor>";                                  
            M[13][0]="<tipo>"; M[13][17]="entero"; M[13][18]="real"; M[13][19]="caracter"; M[13][20]="palabra"; M[13][21]="bool";                  
            M[14][0]="<F>"; M[14][3]="<Lista_Valores> ,"; M[14][11]="λ";                                                    
            M[15][0]="<Subprogramas>";  M[15][6]="<G> <Subprograma>"; M[15][17]="<G> <Subprograma>";M[15][18]="<G> <Subprograma>";M[15][19]="<G> <Subprograma>";M[15][20]="<G> <Subprograma>";M[15][21]="<G> <Subprograma>";M[15][22]="<G> <Subprograma>";                                                          
            M[16][0]="<G>";       M[16][6]="<G> <Subprograma>"; M[16][17]="<G> <Subprograma>";M[16][18]="<G> <Subprograma>";M[16][19]="<G> <Subprograma>";M[16][20]="<G> <Subprograma>";M[16][21]="<G> <Subprograma>";M[16][22]="<G> <Subprograma>";   M[16][24]="λ";                                        
            M[17][0]="<Subprograma>"; M[17][6]="} <I> { @ <K> # ID"; M[17][17]="} <H><Ret_metodo> <H> { @ <K> # ID <tipo>";M[17][18]="} <H><Ret_metodo> <H> { @ <K> # ID <tipo>";M[17][19]="} <H><Ret_metodo> <H> { @ <K> # ID <tipo>";M[17][20]="} <H><Ret_metodo> <H> { @ <K> # ID <tipo>";M[17][21]="} <H><Ret_metodo> <H> { @ <K> # ID <tipo>";M[17][22]="<P> vacuo";                                                  
            M[18][0]="<P>"; M[18][6]="} <H> { @ <K> # ID";  M[18][27]="} <H> { @ # central";                                                            
            M[19][0]="<H>";   M[19][17]="<Sentencias> <I>";M[19][18]="<Sentencias> <I>";M[19][19]="<Sentencias> <I>";M[19][20]="<Sentencias> <I>";M[19][21]="<Sentencias> <I>";    M[19][24]="<Sentencias> <I>"; M[19][46]="<Sentencias> <I>";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
            M[20][0]="<K>";  M[20][17]="<J> ID <tipo>";M[20][18]="<J> ID <tipo>";M[20][19]="<J> ID <tipo>";M[20][20]="<J> ID <tipo>";M[20][21]="<J> ID <tipo>"; M[20][26]="λ";                                                               
            M[21][0]="<I>";    M[21][6]="λ";  M[21][17]="<M> ID <tipo>";M[21][18]="<M> ID <tipo>";M[21][19]="<M> ID <tipo>";M[21][20]="<M> ID <tipo>";M[21][21]="<M> ID <tipo>";  M[21][24]="λ";  M[21][31]="λ"; M[21][32]="λ";  M[21][39]="λ";   M[21][41]="λ"; M[21][42]="λ";                                                                                                                                                                        
            M[22][0]="<Pametro>";  M[22][17]="<J> ID <tipo>";M[22][18]="<J> ID <tipo>";M[22][19]="<J> ID <tipo>";M[21][20]="<J> ID <tipo>";M[22][21]="<J> ID <tipo>";                  
            M[23][0]="<J>";   M[23][3]="<Pametro> ,"; M[23][26]="λ"; 
            M[24][0]="<M>";  M[24][4]="<I> |";                                        
            M[25][0]="<Sentencias>"; M[25][6]="<Q> <Sentencia>";M[25][31]="<Q> <Sentencia>";M[25][32]="<Q> <Sentencia>"; M[25][39]="<Q> <Sentencia>";      M[25][41]="<Q> <Sentencia>";M[25][42]="<Q> <Sentencia>";                                                                                                                           
            M[26][0]="<Q>";     M[26][6]="<Q> <Sentencia>"; M[26][24]="λ";  M[26][31]="<Q> <Sentencia>";M[26][32]="<Q> <Sentencia>"; M[26][39]="<Q> <Sentencia>";      M[26][41]="<Q> <Sentencia>";M[26][42]="<Q> <Sentencia>";  M[26][46]="λ";                                                                                                                                                                                                   
            M[27][0]="<Sentencia>";  M[27][6]="| <Sentencia_simple>";  M[27][31]="| <Sentencia_simple>"; M[27][32]="| <Sentencia_simple>";                                                         M[27][39]="Si(<Relacional>){<sentencias>}<16> ";  M[27][41]="kama(<Relacional>){<sentencias>}"; M[27][42]="Pa(<expresion>){<sentencias>}";                                                      
            M[28][0]="<Sentencia_simple>";  M[28][6]="<13> ID"; M[28][31]="<U> ID liyiy"; M[28][32]="<RS> iskirbiy";                 
            M[29][0]="<13>"; M[29][28]="@ <W> # ID .";  M[29][50]="<Z> ==";                                                                      
            M[30][0]="<Z>";M[30][6]="<12> ID";M[30][12]="<12> NUMERO";M[30][13]=comilla+ "<Lista_ID>" + comilla; M[30][14]="' ID '";M[30][15]="falso";M[30][16]="verdadero";M[30][29]="<12> ) <expresion_mat> (";
            M[31][0]="<12>";M[31][4]="λ";M[31][34]="<9> <10>";M[31][35]="<9> <10>";M[31][36]="<9> <10>";M[31][37]="<9> <10>";M[31][38]="<9> <10>";     
            M[32][0]="<9>";M[32][4]="λ";M[32][6]="<12> ID";M[32][12]=" <12> NUMERO ";M[32][13]=comilla +"<Lista_ID>" + comilla ;M[32][14]=" ' ID '";M[32][15]="falso ";M[32][16]="verdadero";M[32][29]="<12> ) <expresion_mat> (";  
            M[33][0]="<U>";M[33][4]="λ";M[32][10]="] [";
            M[34][0]="<RS>";M[34][6]="<TR> ID";M[34][13]="<TR> <Lista_ID>";
            M[35][0]="<TR>";M[35][4]="λ";M[35][33]="<RS> ;";
            M[36][0]="<Lista_ID>";M[36][6]="<V> ID";
            M[37][0]="<V>";M[37][6]="ID";M[37][13]="λ";
            M[38][0]="<W>";M[38][6]="<X> ID";M[38][12]="<X> <valor>";M[38][13]="<X> <valor>";M[38][14]="<X> <valor>";M[38][15]="<X> <valor>";M[38][16]="<X> <valor>";M[38][26]="λ";
            M[39][0]="<X>";M[39][3]="<W> ,";M[39][26]="λ";
            M[40][0]="<expresion_mat>";M[40][6]="<10> ID";M[40][12]="<10> NUMERO";
            M[41][0]="<10>";M[41][4]="λ";M[41][6]="λ";M[41][12]="λ";M[41][13]="λ";M[41][14]="λ";M[41][15]="λ";M[41][16]="λ";M[41][24]="λ";M[41][29]="λ"; M[41][30]="λ";M[41][34]="<11> <Op_mat>";M[41][35]="<11> <Op_mat>";M[41][36]="<11> <Op_mat>";M[41][37]="<11> <Op_mat>";M[41][38]="<11> <Op_mat>";
            M[42][0]="<11>";M[42][6]="ID";M[42][12]="NUMERO";
            M[43][0]="<Op_mat>";M[43][34]="*";M[43][35]="-";M[43][36]="+";M[43][37]="%";M[43][38]="/";   
            M[44][0]="<16>";M[44][6]="λ";M[44][24]="λ";M[44][31]="λ";M[44][32]="λ";M[44][39]="λ";M[44][40]="} <sentencias> { mana";M[44][41]="λ";M[44][42]="λ";M[44][46]="λ";
            M[45][0]="<expresion>";M[45][6]="<iteracion> , <condic> , <inicializacion>";M[45][17]="<iteracion> , <condic> , <inicializacion>";M[45][18]="<iteracion> , <condic> , <inicializacion>";
            M[46][0]="<inicializacion>";M[46][6]="<17> ID";M[46][17]="NUMERO == ID entero";M[46][18]="NUMERO == ID real";
            M[47][0]="<17>";                                          M[47][3]="λ";                                                                                                           M[47][50]="NUMERO ==";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
            M[48][0]="<iteracion>";M[48][6]="<18> ID";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
            M[49][0]="<18>";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   M[49][35]="- -";M[49][36]="+ +";                                                                                                                                                                         
            M[50][0]="<Relacional>"; M[50][6]="<14> <20>";  M[50][12]="<14> <20>";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
            M[51][0]="<14>";   M[51][8]="&";M[51][9]="Ø";                                                                                                                                                                                                                                                                                                                            M[51][30]="λ";                                                                                                                                                                                                                                                                                   
            M[52][0]="<20>";    M[52][6]="<11> <op_rel> <11>";   M[52][12]="<11> <op_rel> <11>";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
            M[53][0]="<op_rel>";  M[53][7]="=";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  M[53][43]="<op_comp> >";M[53][44]="<op_comp> <";M[53][45]="= ~";                                                              
            M[54][0]="<op_comp>";  M[54][6]="λ";M[54][7]="=";  M[54][12]="λ";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
            M[55][0]="<op_conj_dis>";    M[55][8]="&"; M[55][9]="Ø";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
            M[56][0]="<Ret_metodo>";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                M[56][46]="<T> retornar";            
            M[57][0]="<T>";        M[57][6]="<10> ID";  M[57][12]="<10> NUMERO"; M[57][13]=comilla+"<Lista_ID>"+comilla;M[57][14]="' ID '";M[57][15]="falso";M[57][16]="verdadero";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
            M[58][0]="<modificador_acceso>";    M[58][47]="obvio";M[58][48]="noobvio";M[58][49]="inmune";                                                                        
            M[59][0]="<condic>";     M[59][6]="<11> <op_rel> ID";                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
          
          } 
       }   
   }
   
   boolean Terminal (String car){
       for(int i=1; i< 51; i++)
            if(M[0][i].equals(car)) return true;
       return false;   
   }
   
   String RetProduccion(){ return produccion; }
   
    boolean ExisteInterseccion(String XX,String ae){
        int i,x=0,y=0;
        for(i=1; i< 51; i++)
            if(M[0][i].equals(ae)){System.out.println("test1: econtrar"+M[0][i]); x=i;}
        for(i=1; i< 60; i++)
            if(M[i][0].equals(XX)){System.out.println("test2: encontrar "+M[i][0]); y=i;}
        if(x ==0 || y == 0 ) return false;
        else if( M[y][x].equals(" ")) return false;
            else{ produccion=M[y][x]; return true;}
    }
    
    
    
    
}
