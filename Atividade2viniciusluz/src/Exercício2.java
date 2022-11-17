import java.util.Random;
import java.util.Scanner;

public class Exercício2 {

    public static void preencher(int[] valores, int val) {
        Random random = new Random();
        for (int i = 0; i < val; i++) {
            valores[i] = random.nextInt(100);
        }
    }

    public static void imprimir(int[] valores, int val) {
        for (int i = 0; i < val; i++) {
            System.out.printf("%d ", valores[i]);
        }
        
        System.out.println();
    }
    

    public static boolean acharposicao(int[] array, int val) {
        int VMenor = 0;
        int VMaior = array.length - 1;
        int VMeio;
        while (VMenor <= VMaior) {
            VMeio = (VMenor + VMaior) / 2;

            if (array[VMeio] < val)
                VMenor = VMeio + 1;
            else if (array[VMeio] > val)
                VMaior = VMeio - 1;
            else
            	
                return true;
        }
        
        
        return false;
    }

    public static void ordenar(int[] array, int val) {
        int x;
        int vet;
        int y;

        for (x = 1; x < val; x++) {
            vet = array[x];
            for (y = x - 1; (y >= 0) && (array[y] > vet); y--) {
                array[y + 1] = array[y];
            }
            array[y + 1] = vet;
        }

    }

    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println(" -- |Quadro de números| --");
        preencher(numeros, 10);
        imprimir(numeros, 10);
        ordenar(numeros, 10);
        imprimir(numeros, 10);
        System.out.println("Informe um valor que você queira puxar do quadro, note que ele pode ou não estar la!:");
        int val = teclado.nextInt();
        System.out.println("O número que você digitou está dentro do quadro!" + acharposicao(numeros, val));

    }

}


