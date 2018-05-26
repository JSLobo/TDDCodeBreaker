package co.edu.udea.codeBreaker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       CodeBreaker codeBreaker=new CodeBreaker();
       String resultado=codeBreaker.game(1234);
       System.out.println(resultado);
    }
}
