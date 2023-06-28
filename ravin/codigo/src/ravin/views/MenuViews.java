package ravin.views;

import javax.swing.JOptionPane;

import ravin.utils.MenuStringContents;

public class MenuViews {
    
    

    

    

    public static void showSubMenu(String opcao) {

         boolean running = true;

        for (;running;) {
             String option = JOptionPane.showInputDialog(null, opcao);
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
                continue;
            }

        }
    }

    public static void showMenuPrincipal() {

        
        boolean running = true;
        
        for (;running;) {
            String option = JOptionPane.showInputDialog(null, MenuStringContents.menuPrincipal());
            try {
                int chosen = Integer.parseInt(option);

                switch(chosen) {
                    case 1:
                        running = false;
                        // showSubMenuFuncionario("Funcionário");
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
                continue;
            }

        }
    }
}
