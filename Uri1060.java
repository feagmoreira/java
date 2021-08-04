import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double numero;
        int qtpositiv;
        
        qtpositiv=0;

        for (int cont=1; cont <= 6; cont++){
            numero = teclado.nextDouble();
            if (numero >0){
                qtpositiv = qtpositiv + 1;
            }
        } 
        System.out.println(qtpositiv+ " valores positivos");
    }
}