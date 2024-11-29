public enum Rating {
    POOR(1),
    AVERAGE(2),
    GOOD(3),
    EXCELLENT(4);

    private final int value;

    Rating(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
