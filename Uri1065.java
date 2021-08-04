import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int numero;
        int qtpares;
        qtpares = 0;

        for (int cont=1; cont <= 5; cont++){
            numero = teclado.nextInt();
            if (numero % 2 ==0){
                qtpares = qtpares + 1;
            }
        } 
        System.out.println(qtpares+ " valores pares");
    }
}