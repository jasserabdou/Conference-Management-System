/**
 * The FeedbackProvider interface represents an entity that can provide
 * feedback.
 */
public interface FeedbackProvider {
    /**
     * Provides feedback with comments and a rating.
     * 
     * @param comments the comments for the feedback
     * @param rating   the rating for the feedback
     */
    void provideFeedback(String comments, int rating);
}