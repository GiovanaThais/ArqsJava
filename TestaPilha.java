
package PilhaExpressao;

/


import java.util.Scanner;
import pilhaDinamica.*;
/**
 *
 * @author joelsantos
 */
public class TestaPilha {

    PilhaDinamica p;
    
   public TestaPilha()
   {
       System.out.println("Escreva uma expressão matemática");
        String expressao = new Scanner(System.in).nextLine();
        
        if(verificaexpressao(expressao))
        {
            In2Pos(expressao.toCharArray());
            
        }
   }
    
    
    
    private Boolean verificaexpressao(String expressao)
    {
         Pilha p = new Pilha(expressao.length());
         
         for (int i = 0; i < expressao.length(); i++) {

            if (expressao.charAt(i) == '(') {
                p.push('(');
            } else if (expressao.charAt(i) == ')') {
                if (p.isEmpty()) {
                    System.out.println("Mal formada");
                    return false;
                    
                } else {
                    p.pop();
                    if (expressao.length() - 1 == i && p.isEmpty()) {
                        System.out.println("Bem formada");
                        return true;
                    }
                }
            }
            if (!p.isEmpty() && expressao.length() - 1 == i) {
                System.out.println("Mal formada");
                return false;
            } else if (p.isEmpty() && expressao.length() - 1 == i) {
                 System.out.println("Bem formada");
                return true;
            }
        }
         
        return true;
    }
    
    private void In2Pos(char expr[]){
        
        int i = 0;
        char c,t;

        p = new PilhaDinamica();
        

        do{
          c = expr[i];
          i++;
          if(c >= 'a' && c <= 'z'){
            //System.out.print(c);
            p.push(c);
          }
          else if(c == '('){
            p.push('(');
          }
          else if(c == ')' || c == '\0'){
            do{
              t = (char)p.pop();
              if(t != '(')
                System.out.print(t);
            }while(t != '(');
          }
          else if(c == '+' || c == '-' || 
                  c == '*' || c == '/' ||
                  c == '^' ){
              
            while(true){
              //
              t=(char) p.pop();
              
              if(Prioridade(c,t)){
                
                p.push(c);
                p.push(t);
                
                break;
              }
              else{
                System.out.print(t);                
              }
              
            }
            
            
          }
        }while(i<expr.length);
        
        System.out.println();
        //p.liberaPilha();
        p.exibePilha();
      }
    
    private Boolean Prioridade(char c, char t){
        int pc=-1,pt=-1;

        if(c == '^')
          pc = 4;
        else if(c == '*' || c == '/')
          pc = 2;
        else if(c == '+' || c == '-')
          pc = 1;
        else if(c == '(')
          pc = 4;
        else
            pc = 0;

        if(t == '^')
          pt = 3;
        else if(t == '*' || t == '/')
          pt = 2;
        else if(t == '+' || t == '-')
          pt = 1;
        else if(t == '(')
          pt = 0;
        else
            pc = 0;

        return (pc > pt);
      }


     public static void main(String[] args) {
        
            TestaPilha t = new TestaPilha();
        
            
        
    }
}
