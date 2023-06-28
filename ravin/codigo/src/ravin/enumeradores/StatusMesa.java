package ravin.enumeradores;

public enum StatusMesa {
	
	RESERVADA(0),
	OCUPADA(1),
	LIBERADA(2);

	private final int value;
	private final StatusMesa valueEnum;

	StatusMesa(int value) {
		this.value = value;
		this.valueEnum = StatusMesa.values()[value];
	}

	public int getValue() {
		return this.value;
	}

	public StatusMesa getValueEnum() {
		return this.valueEnum;
	}

	public static StatusMesa getStatusMesa(int n) {
		return StatusMesa.values()[n];
	}

}
