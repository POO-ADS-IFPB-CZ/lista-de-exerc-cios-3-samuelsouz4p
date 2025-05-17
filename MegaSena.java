import java.util.Scanner;
import java.util.Arrays;

public class MegaSena {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int quantidade;

        do {
            System.out.print("Informe a quantidade de numeros (entre 6 e 10): ");
            quantidade = scanner.nextInt();
            if(quantidade<6 || quantidade >10){
                System.out.println("A quantidade deve ser entre 6 e 10 numeros!");
            }
        }while (quantidade < 6 || quantidade > 10);
        int [] numeros = new int[quantidade];

        //leitura dos numeros
        int k=0;
        while(k < quantidade){
            System.out.println("Informe o " + (k + 1) + "º numero(1 a 60): ");
            int numero = scanner.nextInt();

            if(numero < 1 || numero > 60){
                System.out.println("Numero inválido(entre 1 e 60). Tente novamente.");
                continue;
            }

            boolean repetido = false;
            for(int i = 0; i < k;i++){
                if(numeros[i] == numero){
                    repetido = true;
                    break;
                }
            }

            if(repetido == true){
                System.out.println("Numero ja selecionado, informe outro.");
            }else {
                numeros[k] = numero;
                k++;
            }
        }
        Arrays.sort(numeros);
        System.out.println("Bilhete de " +quantidade+ " numeros.");
        System.out.println("Numeros: "+Arrays.toString(numeros));
    }
}