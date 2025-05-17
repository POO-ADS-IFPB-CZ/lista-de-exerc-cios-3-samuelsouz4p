import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Informe o numero N: ");
        n = scanner.nextInt();

        int []fibonacci = new int[n];

        fibonacci [0] = 0;
        if(n>1){
            fibonacci[1] = 1;
        }
        //restante da sequencia
        for(int k = 2; k < n; k++){
            fibonacci[k] = fibonacci[k-1] + fibonacci[k-2];
        }
        //exibindo
        System.out.println("Sequencia de Fibonacci ate o "+n+"º termo:");
        for(int i= 0; i < n; i++){
            System.out.println(fibonacci[i]);
        }

    }
}
