package ravin.views.objects_view;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import ravin.enums.EstadoCivil;
import ravin.interfaces.ObjectViewInterface;
import ravin.models.Funcionario;
import ravin.models.Pessoa;
import ravin.utils.MenuStringContents;

public class FuncionarioView implements ObjectViewInterface{

    @Override
    public void showEditingOptions() {
        String subMenuOptions = MenuStringContents.montarSubMenuGeral("Funcionário");

        
    }

    @Override
    public void criarView() {
        cadastrarFuncionario();
    }


    @Override
    public void alterarView() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterarView'");
    }


    @Override
    public void consultarView() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarView'");
    }


    @Override
    public void removerView() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerView'");
    }

    


    private static void addOpcoesPessoa() {

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
				"Ativo (0 - NÃO; 1: SIM):", booleanField,};
        

		int result = JOptionPane.showConfirmDialog(
                null,
                fields,
                "Informe os dados do novo funcionário:",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {

            try {
                


                Pessoa p = new Pessoa();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("Operação cancelada");
        }

		
	}


    private static void cadastrarFuncionario() {

        // PESSOA
        JTextField idField = new JTextField();
		JTextField nomeField = new JTextField();
		JTextField enderecoField = new JTextField();
		JTextField telefoneField = new JTextField();
		JTextField cpfField = new JTextField();
		JTextField dataNascimentoField = new JTextField();
		JTextField observacaoField = new JTextField();
		JTextField booleanField = new JTextField();

        //FUNCIONARIO
        JTextField rgField = new JTextField();
        JTextField estadoCivilField = new JTextField();
        JTextField escolaridadeField = new JTextField();
        JTextField cargoField = new JTextField();
        JTextField pisField = new JTextField();

        boolean disponibilidade = false;
        Date dataAdmissao = new Date();
        Date dataDemissao = null;

        // \n 1 - Faxineiro \n 2 - Garçom \n 3 - Cozinheiro \n 4 - Gerente"

        Object[] funcionarioFields = {
                "ID:", idField,
                "Nome:", nomeField,
                "Endereço:", enderecoField,
				"Telefone:", telefoneField,
				"Cpf:", cpfField,
				"Data de Nascimento:", dataNascimentoField,
				"Observações:", observacaoField,
				"Ativo (0 - NÃO; 1: SIM):", booleanField,
                "RG:", rgField,
                "Estado Civil / Solteiro (0) - Casado (1):", estadoCivilField,
                "Escolaridade / Fundamental (0) - Médio (1) - Superior (2):", escolaridadeField,
				"Cargo / Faxineiro (0) - Garçom (1) - Cozinheiro (2) - Gerente (3):", cargoField,
				"PIS:", pisField,
        };

        int result = JOptionPane.showConfirmDialog(
                null,
                funcionarioFields,
                "Informe os dados do novo funcionário:",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {

            try {
                String id = idField.getText();
                String nome = nomeField.getText();
                String endereco = enderecoField.getText();


                String rg = rgField.getText();
                EstadoCivil estadoCivil = EstadoCivil.getEstadoCivil(Integer.parseInt(estadoCivilField.getText()));
                


                Funcionario f = new Funcionario();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("Operação cancelada");
        }
    }
    
}
