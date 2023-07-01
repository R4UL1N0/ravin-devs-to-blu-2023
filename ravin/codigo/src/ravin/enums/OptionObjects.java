package ravin.enums;

public enum OptionObjects {
    FUNCIONARIO,
    CLIENTE,
    PRODUTO,
    CARDAPIO, 
    COMANDA,
    MESA,
    PEDIDO,
    SAIR;

    public static OptionObjects getOptionsObjects(int v) {
        return OptionObjects.values()[v - 1];
    }

}
