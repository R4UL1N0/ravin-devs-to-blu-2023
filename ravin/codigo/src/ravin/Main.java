package ravin;

import java.sql.Timestamp;
import java.util.Date;

import javax.swing.JOptionPane;
import ravin.enums.TipoProduto;
import ravin.models.Pedido;
import ravin.models.Produto;
import ravin.views.MenuView;

public class Main {

	public static void main(String[] args) {

		// Pessoa pessoa = CadastroPessoaViews.cadastrarPessoa();
		MenuView.showMenuPrincipal();

		

	}


	public static Produto cadastrarProduto() {


		String nome = JOptionPane.showInputDialog(null, "Digite o nome do produto:");
		String descricao = JOptionPane.showInputDialog("Digite a descrição do produto:");
		String codigo = JOptionPane.showInputDialog("Digite o código do produto");
		double precoCusto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de custo do produto:"));
		double precoVenda = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço de venda do produto:"));
		String tempoPreparo = JOptionPane.showInputDialog("Digite a descrição do tempo de preparo do produto");
		String observacoes = JOptionPane.showInputDialog("Digite as observações do produto:");
		TipoProduto tipoProduto = TipoProduto.values()[Integer.parseInt(
				JOptionPane.showInputDialog("Digite o tipo do produto \n 1 - Lanche \n 2 - Bebida \n 3 - Sobremesa"))];
		boolean ativo = Boolean
				.parseBoolean(JOptionPane.showInputDialog("O produto está ativo? \n 0 - Não \n 1 - Sim"));

		return new Produto(0, nome, descricao, codigo, precoCusto, precoVenda, tempoPreparo, observacoes, tipoProduto,
				ativo);

	}
	
	public static Pedido cadastrarPedido() {
		Pedido pedido = new Pedido();
		
		pedido.setDataHoraSolicitacao(new Timestamp(new Date().getTime()));
		pedido.setObservacao(JOptionPane.showInputDialog("Observações:"));
		pedido.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de items que você quer para esse pedido")));
		
		return pedido;
	}

}
