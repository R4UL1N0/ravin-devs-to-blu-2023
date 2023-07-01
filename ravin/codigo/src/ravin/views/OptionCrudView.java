package ravin.views;

import javax.swing.JOptionPane;

import ravin.enums.OptionObjects;
import ravin.interfaces.ObjectViewInterface;
import ravin.utils.MenuStringContents;
import ravin.views.objects_view.CardapioView;
import ravin.views.objects_view.ClienteView;
import ravin.views.objects_view.ComandaView;
import ravin.views.objects_view.FuncionarioView;
import ravin.views.objects_view.MesaView;
import ravin.views.objects_view.PedidoView;
import ravin.views.objects_view.ProdutoView;

public class OptionCrudView {
    
    private OptionObjects chosenEnum;
     

    public OptionCrudView(OptionObjects chosenEnum) {
        this.chosenEnum = chosenEnum;
    }

    private String enumName;

    private ObjectViewInterface criarObjectView() {

        switch(chosenEnum) {
            case FUNCIONARIO:
                enumName = "Funcionário";
                return new FuncionarioView();
            case CLIENTE:
                enumName = "Cliente";
                return new ClienteView();
            case PRODUTO:
                enumName = "Produto";
                return new ProdutoView();
            case CARDAPIO:
                enumName = "Cardápio";
                return new CardapioView();
            case COMANDA:
            enumName = "Comanda";
                return new ComandaView();
            case MESA:
                enumName = "Mesa";
                return new MesaView();
            case PEDIDO:
                enumName = "Pedido";
                return new PedidoView();
            default: 
                throw new Error();
        }
    }

    private ObjectViewInterface objectView = criarObjectView();

    public void showEditingOptions() {
        String subMenu = MenuStringContents.montarSubMenuGeral(enumName);
        boolean running = true;

        for (;running;) {
             String option = JOptionPane.showInputDialog(null, subMenu);

             if (option  == null) { 
               running = false;
            }
            try {
                int chosen = Integer.parseInt(option);

                switch(chosen) {
                    case 1: // consultar
                        consultar();
                        break;
                    case 2: // criar
                        criar();
                        break;
                    case 3: // alterar
                        alterar();
                        break;
                    case 4: // remover
                        remover();
                        break;
                    case 5: 
                        break;
                    default:
                        throw new IllegalArgumentException("Opção inexistente: " + chosen);

                }
                
            } catch (Exception e) {
                System.out.println("Valor Errado");
                continue;
            }
    }

    public void criar() {
        objectView.criarView();
    }

    public void alterar() {
        objectView.alterarView();
    }

    public void consultar() {
        objectView.consultarView();
        
    }

    public void remover() {
        objectView.removerView();
    }
}
