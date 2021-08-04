import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int X;
        
        X = teclado.nextInt();

        for (int cont=1; cont <= X; cont++){
            if (cont % 2 != 0){
                System.out.println(cont);  
            }
        }
    }
}