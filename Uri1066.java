import java.util.Scanner;

public class Uri1066{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int numero;
        int qpares, qimpares, qpositivos, qnegativos;
        qpares = 0;
        qimpares = 0;
        qpositivos = 0;
        qnegativos = 0;

        for (int cont=1; cont <= 5; cont++){
            numero = teclado.nextInt();
            if (numero % 2 == 0){
                qpares = qpares + 1;
            }
            else{
                qimpares = qimpares + 1;
            }
            if (numero > 0){
               qpositivos = qpositivos + 1; 
            }
            else if(numero < 0){
               qnegativos = qnegativos + 1; 
            }
        } 
        System.out.println(qpares+ " valor(es) par(es)");
        System.out.println(qimpares+ " valor(es) impar(es)");
        System.out.println(qpositivos+ " valor(es) positivo(s)");
        System.out.println(qnegativos+ " valor(es) negativo(s)");
    }
}