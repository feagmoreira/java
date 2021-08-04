import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double codigo, quant;
        double unit, total;
        
        codigo = teclado.nextDouble();
        quant = teclado.nextDouble();
        unit = 0;
        if (codigo == 1){
            unit = 4.00;
        }
        else if (codigo == 2){
            unit = 4.50;
        }
        else if (codigo == 3){
            unit = 5.00;
        }
        else if (codigo == 4){
            unit = 2.00;
        }
        else if (codigo == 5){
            unit = 1.50;
        }
        total = unit * quant;
        System.out.printf("Total: R$ %.2f\n", total); 
    }
}