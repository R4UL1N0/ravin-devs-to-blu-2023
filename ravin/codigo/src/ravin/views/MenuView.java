package ravin.views;

import javax.swing.JOptionPane;

import ravin.enums.OptionObjects;
import ravin.utils.MenuStringContents;

public class MenuView {
    

    public static void showMenuPrincipal() {

        
        boolean running = true;
        
        for (;running;) {
            String option = JOptionPane.showInputDialog(null, MenuStringContents.menuPrincipal());

            if (option == null) { 
                running = false;
            }

            try {
                int chosen = Integer.parseInt(option);

                if (chosen == 8) {
                    running = false;
                }

                if (chosen < 0 || chosen > 8) {
                    throw new Exception();
                }

                OptionObjects chosenEnum = OptionObjects.getOptionsObjects(chosen);
                OptionCrudView optionsCrudView = new OptionCrudView(chosenEnum);

                optionsCrudView.showEditingOptions();
                
            } catch (Exception e) {
                System.out.println("Valor Errado aqui");
                continue;
            }

        }
    }
}
