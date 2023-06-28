package ravin.enumeradores;

public enum Escolaridade {
	
	FUNDAMENTAL(0),
	MEDIO(1),
	SUPERIOR(2);

	private final int value;
	private final Escolaridade valueEnum;

	Escolaridade(int value) {
		this.value = value;
		this.valueEnum = Escolaridade.values()[value];
	}

	public int getValue() {
		return value;
	}

	public Escolaridade getValueEnum() {
		return valueEnum;
	}

	public static Escolaridade getEscolaridade(int n) {
		return Escolaridade.values()[n];
	}

}
