package constant;

public enum Constants {
    INIT_VALUE(0);

    private final int value;

    private Constants(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }
}
