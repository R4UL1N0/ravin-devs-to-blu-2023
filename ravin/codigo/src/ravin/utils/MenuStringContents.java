package ravin.utils;

public class MenuStringContents {
    
    public  static String menuPrincipal() {

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

    private static String montarSubMenuGeral(String selecionado) {

         StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("============= ");
        stringBuilder.append(selecionado.toUpperCase());
        stringBuilder.append(" =============\n");
        stringBuilder.append("1 - Consultar\n");
        stringBuilder.append("2 - Adicionar\n");
        stringBuilder.append("3 - Alterar\n");
        stringBuilder.append("4 - Remover\n");

        return stringBuilder.toString();
    }

    public static String montarSubFuncionario() {
        String subGeral = montarSubMenuGeral("Funcionário");

        return subGeral;
    }

    public static String montarSubcliente() {
        String subGeral = montarSubMenuGeral("Cliente");

        return subGeral;
    }

    public static String montarSubProduto() {
        String subGeral = montarSubMenuGeral("Produto");

        return subGeral;
    }

    public static String montarSubCardapio() {
        String subGeral = montarSubMenuGeral("Cardápio");

        return subGeral;
    }

    public static String montarSubComanda() {
        String subGeral = montarSubMenuGeral("Comanda");

        return subGeral;
    }

    public static String montarSubMesa() {
        String subGeral = montarSubMenuGeral("Mesa");

        return subGeral;
    }

    public static String montarSubPedido() {
        String subGeral = montarSubMenuGeral("Pedido");

        return subGeral;
    }
}
