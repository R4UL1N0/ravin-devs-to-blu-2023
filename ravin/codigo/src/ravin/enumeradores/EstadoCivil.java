package ravin.enumeradores;

public enum EstadoCivil {
	
	SOLTEIRO(0),
	CASADO(1),
	VIUVO(2),
	DIVORCIADO(3),
	SEPARADO(4);

	private final int value;
	private final EstadoCivil valueEnum;

	EstadoCivil(int value) {
		this.value = value;
		this.valueEnum = EstadoCivil.values()[value];
	}

	public int getValue() {
		return value;
	}

	public EstadoCivil getValueEnum() {
		return valueEnum;
	}

	public static EstadoCivil getEstadoCivil(int n) {
		return EstadoCivil.values()[n];
	}
}
