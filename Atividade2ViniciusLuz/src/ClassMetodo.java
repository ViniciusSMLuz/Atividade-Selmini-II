import java.util.Scanner;
import java.util.Formatter.*;

public class ClassMetodo {

	ClassProduto[] produto = new ClassProduto[10];

	public void arrayProd() {
		for (int i = 0; i < produto.length; i++) {
			produto[i] = new ClassProduto();
		}

	}

	public void criarProd() {
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i < produto.length; i++) {
			if (produto[i].nome.equals("")) {
				System.out.println("Informe o nome do Produto:");
				produto[i].nome = teclado.nextLine();
				System.out.println("Informe o valor do Produto:");
				produto[i].preço = teclado.nextDouble();
				System.out.println("Informe a quantidade em estoque do produto:");
				produto[i].estoque = teclado.nextInt();
				System.out.println("Seu produto foi cadastrado! \n");
				return;
			}
		}
		System.out.println("Erro, ja existem " + produto.length + " produtos cadastrados! Exclua um e tente novamente");
	}

	public void PesquiProd() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o produto que você está procurando:");
		String aux = teclado.nextLine();
		for (int i = 0; i < produto.length; i++) {
			if (aux.equals(produto[i].nome)) {
				System.out.println("Código do Produto: " + i);
				System.out.println("Nome do Produto: " + produto[i].nome);
				System.out.println("Preço do Produto: R$ " + String.format("%.2f", produto[i].preço));
				System.out.println("Disponibilidade no estoque do Produto: " + produto[i].estoque + "\n");
				return;
			}

		}
		System.out.println("Seu produto não foi encontrado, tente novamente!");
	}

	public void ListaProd() {
		int aux = 0;
		System.out.println("Listando os produtos:");
		for (int i = 0; i < produto.length; i++) {
			if (!produto[i].nome.equals("")) {
				System.out.println("Código do Produto: " + i);
				System.out.println("Nome do Produto: " + produto[i].nome);
				System.out.println("Preço do Produto: R$ " + String.format("%.2f", produto[i].preço));
				System.out.println("Disponibilidade no estoque do Produto: " + produto[i].estoque + "\n");
			} else {
				aux++;
			}
		}
		if (aux == produto.length) {
			System.out.println("Não há produtos à listar!\n");
		}
	}

	public void excluirProd() {
		Scanner teclado = new Scanner(System.in);
		boolean teste;
		System.out.println("Informe o produto que você está procurando:");
		String aux = teclado.nextLine();
		for (int i = 0; i < produto.length; i++) {
			if (aux.equals(produto[i].nome)) {
				System.out.println("Código do Produto: " + i);
				System.out.println("Nome do Produto: " + produto[i].nome);
				System.out.println("Deseja mesmo excluir o produto da sua lista? Digite S para SIM e N para NAO");
				do {

					aux = teclado.next();
					aux = aux.toLowerCase();
					
					if (aux.equals("s")) {
						teste = true;
					} else if (aux.equals("n")) {
						teste = true;
					} else {
						System.out.println("Tente Novamente");
						teste = false;
					}
				} while (teste == false);
				if (aux.equals("s")) {
					produto[i].nome = "";
					produto[i].preço = 0;
					produto[i].estoque = 0;
					System.out.println("Seu produto foi excluido com sucesso!");
					return;
				} else {
					System.out.println("Se quiser excluir outro produto, repita o mesmo processo.");
					return;
				}
			}
			System.out.println("Seu produto não foi encontrado, tente novamente.");
		}

	}
}
