package ravin.views;

import javax.swing.JOptionPane;

public class MenuViews {
    
    private static String montarMenuPrincipal() {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("============= ");
        stringBuilder.append("MENU INICIAL");
        stringBuilder.append(" =============\n");

        stringBuilder.append("1 - Funcionário\n");
        stringBuilder.append("2 - Cliente\n");
        stringBuilder.append("3 - Produto\n");
        stringBuilder.append("4 - Cardápio\n");
        stringBuilder.append("5 - Comanda\n");
        stringBuilder.append("6 - Mesa\n");
        stringBuilder.append("7 - Pedido\n");
        stringBuilder.append("8 - Sair\n");

        return stringBuilder.toString();
    }

    private static String montarSubMenu(String selecionado) {

         StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("============= ");
        stringBuilder.append(selecionado);
        stringBuilder.append(" =============\n");
        stringBuilder.append("1 - Adicionar\n");
        stringBuilder.append("2 - Alterar\n");
        stringBuilder.append("3 - Remover\n");

        return stringBuilder.toString();
    }

    public static String showMenuPrincipal() {

        String option = JOptionPane.showInputDialog(null, montarMenuPrincipal());
        boolean running = true;
        
        for (;running;) {

            try {
                int chosen = Integer.parseInt(option);

                switch(chosen) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3: 
                        break;
                    case 4:
                        break;
                    case 5: 
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        running = false;
                        break;
                    default:
                        throw new IllegalArgumentException("Opção inexistente: " + chosen);

                }
                
            } catch (Exception e) {
                System.out.println("Valor Errado");
            }

        }

        return option;
    }
}
