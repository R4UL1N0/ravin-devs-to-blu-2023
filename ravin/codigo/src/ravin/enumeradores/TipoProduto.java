package ravin.enumeradores;

public enum TipoProduto {
	
	LANCHE(0),
	BEBIDA(1),
	SOBREMESA(2);

	private final int value;
	private final TipoProduto valueEnum;

	TipoProduto(int value) {
		this.value = value;
		this.valueEnum = TipoProduto.values()[value];
	}

	public int getValue() {
		return value;
	}

	public TipoProduto getValueEnum() {
		return valueEnum;
	}

	public static TipoProduto getTipoProduto(int n) {
		return TipoProduto.values()[n];
	}

}
