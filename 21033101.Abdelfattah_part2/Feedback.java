/**
 * The Feedback class represents feedback given by an attendee for a session.
 */
public class Feedback {
    private String attendeeId;
    private String comments;
    private int rating;

    /**
     * Constructs a new Feedback with the specified attendee ID, comments, and
     * rating.
     *
     * @param attendeeId the ID of the attendee providing the feedback
     * @param comments   the comments of the feedback
     * @param rating     the rating of the feedback
     * @throws IllegalArgumentException if the attendeeId or comments are null or
     *                                  empty, or if the rating is out of range
     *                                  (1-5)
     */
    public Feedback(String attendeeId, String comments, int rating) {
        if (attendeeId == null || attendeeId.isEmpty()) {
            throw new IllegalArgumentException("Attendee ID cannot be null or empty");
        }
        if (comments == null || comments.isEmpty()) {
            throw new IllegalArgumentException("Comments cannot be null or empty");
        }
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        this.attendeeId = attendeeId;
        this.comments = comments;
        this.rating = rating;
    }

    /**
     * Provides feedback by printing the feedback details.
     */
    public void provideFeedback() {
        System.out.println("Feedback from Attendee ID: " + attendeeId);
        System.out.println("Comments: " + comments);
        System.out.println("Rating: " + rating);
    }

    /**
     * Returns a string representation of the feedback.
     *
     * @return a string representation of the feedback
     */
    @Override
    public String toString() {
        return "Feedback{" +
                "attendeeId='" + attendeeId + '\'' +
                ", comments='" + comments + '\'' +
                ", rating=" + rating +
                '}';
    }
}