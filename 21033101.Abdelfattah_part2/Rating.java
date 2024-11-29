/**
 * The Rating enum represents the rating levels for sessions or speakers.
 */
public enum Rating {
    POOR(1),
    AVERAGE(2),
    GOOD(3),
    EXCELLENT(4);

    private final int value;

    /**
     * Constructs a Rating with the specified value.
     * 
     * @param value the value of the rating
     */
    Rating(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the rating.
     * 
     * @return the value of the rating
     */
    public int getValue() {
        return value;
    }
}