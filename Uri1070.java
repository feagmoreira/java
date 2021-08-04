import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int X, cont;
        
        X = teclado.nextInt();
        cont = 1;
        
        while (cont <= 6){
            if (X % 2 != 0){
                System.out.println(X);
                cont = cont + 1;
            } 
            X = X + 1;         
        }
    }
}