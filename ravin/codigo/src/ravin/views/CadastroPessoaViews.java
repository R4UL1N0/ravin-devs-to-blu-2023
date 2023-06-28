package ravin.views;

import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ravin.enums.EstadoCivil;
import ravin.models.Cliente;
import ravin.models.Funcionario;
import ravin.models.Pessoa;
import ravin.utils.DateUtils;

public class CadastroPessoaViews {
    
    public static Pessoa cadastrarPessoa() {

		JTextField idField = new JTextField();
		JTextField nomeField = new JTextField();
		JTextField enderecoField = new JTextField();
		JTextField telefoneField = new JTextField();
		JTextField cpfField = new JTextField();
		JTextField dataNascimentoField = new JTextField();
		JTextField observacaoField = new JTextField();
		JTextField booleanField = new JTextField();

		Object[] fields = {
                "ID:", idField,
                "Nome:", nomeField,
                "Endereço:", enderecoField,
				"Telefone:", telefoneField,
				"Cpf:", cpfField,
				"Data de Nascimento:", dataNascimentoField,
				"Observações:", observacaoField,
				"Ativo (0 - NÃO; 1: SIM):", booleanField,
        };

		int result = JOptionPane.showConfirmDialog(
                null,
                fields,
                "Informe os dados do novo usuário:",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            
            try {

				int id = Integer.parseInt(idField.getText());
				String nome = nomeField.getText();
            	String endereco = enderecoField.getText();
				String telefone = telefoneField.getText();
				String cpf = cpfField.getText();
				Date dataNascimento = DateUtils.stringToDate(dataNascimentoField.getText());
				String observacao = observacaoField.getText();
				boolean ativo = Integer.parseInt(booleanField.getText()) == 0 ? false : true;

				

				return new Pessoa(id, nome, endereco, 
					telefone, cpf, dataNascimento, 
					observacao, ativo);


            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Erro ao converter valores.",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            System.out.println("Input canceled.");
        }

		return new Pessoa();
		
	}

    public static void isFuncionarioOuCliente() {

        String funcOuCliente = JOptionPane.showInputDialog("Seu usuário será um Funcionário (0) ou Cliente (1)?");
        int value;

        try {
            value = Integer.parseInt(funcOuCliente);

            if (value == 0) {

            } else if (value == 1){

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }

    public static Funcionario cadastrarFuncionario(Pessoa p) {

        JTextField rgField = new JTextField();
        JTextField estadoCivilField = new JTextField();
        JTextField escolaridadeField = new JTextField();
        JTextField cargoField = new JTextField();
        JTextField pisField = new JTextField();

        boolean disponibilidade = false;
        Date dataAdmissao = new Date();
        Date dataDemissao = null;

        // \n 1 - Faxineiro \n 2 - Garçom \n 3 - Cozinheiro \n 4 - Gerente"

        Object[] fields = {
                "RG:", rgField,
                "Estado Civil / Solteiro (0) - Casado (1):", estadoCivilField,
                "Escolaridade / Fundamental (0) - Médio (1) - Superior (2):", escolaridadeField,
				"Cargo / Faxineiro (0) - Garçom (1) - Cozinheiro (2) - Gerente (3):", cargoField,
				"PIS:", pisField,
        };

        int result = JOptionPane.showConfirmDialog(
                null,
                fields,
                "Informe os dados do novo funcionário:",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {

            try {

                String rg = rgField.getText();
                EstadoCivil estadoCivil = EstadoCivil.getEstadoCivil(Integer.parseInt(estadoCivilField.getText()));
                


                Funcionario f = new Funcionario();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("Operação cancelada");
        }

        return new Funcionario();
    }

    public static Cliente cadastrarCliente(Pessoa p) {
        return new Cliente();
    }

    private static Funcionario setValuesPessoaToFuncionario(Funcionario f, Pessoa p) {
        return new Funcionario();
    }

    private static Cliente setValuesPessoaToCliente(Cliente c, Pessoa p) {
        return new Cliente();
    }
}
