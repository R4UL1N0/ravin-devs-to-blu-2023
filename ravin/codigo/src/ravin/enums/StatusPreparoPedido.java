package ravin.enums;

public enum StatusPreparoPedido {
	
	PRONTO(0),
	PREPARADO(1),
	ENTREGUE(2);

	private final int value;
	private final StatusPreparoPedido valueEnum;

	StatusPreparoPedido(int value) {
		this.value = value;
		this.valueEnum = StatusPreparoPedido.values()[value];
	}

	public int getValue() {
		return value;
	}

	public StatusPreparoPedido getValueEnum() {
		return valueEnum;
	}

	public static StatusPreparoPedido getStatusMesa(int n) {
		return StatusPreparoPedido.values()[n];
	}

}
