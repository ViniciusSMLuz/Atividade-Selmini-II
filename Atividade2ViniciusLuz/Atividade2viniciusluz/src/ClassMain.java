import java.util.Scanner;

public class ClassMain {
  
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ClassMetodo classmetodo = new ClassMetodo();
        int aux; 
        classmetodo.arrayProd();
        for( int i = 0; i < 1;) {
        	System.out.println("(1) - Criar Produto");
        	System.out.println("(2) - Pesquisar Produto");
        	System.out.println("(3) - Listar Produto");
        	System.out.println("(4) - Excluir Produto");
        	System.out.println("(5) - Encerrar");
        	System.out.print("Qual operação você deseja realizar -->");
        	aux = teclado.nextInt();
        	System.out.println();
        	if(aux == 1) {
        		classmetodo.criarProd();
        		
        	}else if(aux == 2) {
        		classmetodo.PesquiProd();
        	}else if(aux == 3) {
        		classmetodo.ListaProd();
        	}else if(aux == 4) {
        		classmetodo.excluirProd();
        	}else {
        		System.out.println("Encerramento das Operações"); 
        		i++;
        	}
        }
	}

}
