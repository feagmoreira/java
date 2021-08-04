import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double X, Y, consumo;
        
        X = teclado.nextDouble();
        Y = teclado.nextDouble();
        consumo = X / Y;

        System.out.printf("%.3f km/l\n", consumo);
    }
}