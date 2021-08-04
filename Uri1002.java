import java.util.Scanner;

public class Uri1002{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double n, raio, A;
        
        n = 3.14159;
        raio = teclado.nextDouble();
        A = n * raio * raio;

        System.out.printf("A=%.4f\n", A);
    }
}