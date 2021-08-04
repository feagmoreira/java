import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double numero, total, media;
        int qtpositiv;
        
        qtpositiv = 0;
        total = 0;
        for (int cont=1; cont <= 6; cont++){
            numero = teclado.nextDouble();
            if (numero >0){
                qtpositiv = qtpositiv + 1;
                total = total + numero;
            }
        } 
        media = total / qtpositiv;
        System.out.println(qtpositiv+ " valores positivos");
        System.out.printf("%.1f\n", media);
    }
}