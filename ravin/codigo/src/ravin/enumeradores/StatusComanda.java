package ravin.enumeradores;

public enum StatusComanda {
	
	EM_ABERTO(0),
	PAGA(1),
	FECHADA(2);

	private final int value;
	private final StatusComanda valueEnum;

	StatusComanda(int value) {
		this.value = value;
		this.valueEnum = StatusComanda.values()[value];
	}

	public int getValue() {
		return value;
	}

	public StatusComanda getValueEnum() {
		return valueEnum;
	}

	public static StatusComanda getStatusComanda(int n) {
		return StatusComanda.values()[n];
	}

}
