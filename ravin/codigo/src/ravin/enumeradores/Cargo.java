package ravin.enumeradores;

public enum Cargo {

	FAXINEIRO(0),
	GARCOM(1),
	COZINHEIRO(2),
	GERENTE(3);

	private final int value;
	private final Cargo valueEnum;

    Cargo(int value) {
        this.value = value;
		this.valueEnum = Cargo.values()[value];
    }

    public int getValue() {
        return value;
    }

	public Cargo getValueEnum() {
		return valueEnum;
	}

	public static Cargo getCargo(int n) {
		return Cargo.values()[n];
	}

}
