import java.util.ArrayList;
import java.util.List;

/**
 * The Speaker class represents a speaker at a conference with a name, bio, and a list of sessions.
 */
public class Speaker {
    private String name;
    private String bio;
    private List<String> sessions;

    /**
     * Constructs a new Speaker with the specified name and bio.
     *
     * @param name the name of the speaker
     * @param bio the bio of the speaker
     */
    public Speaker(String name, String bio) {
        this.name = name;
        this.bio = bio;
        this.sessions = new ArrayList<>();
    }

    /**
     * Returns the bio of the speaker.
     *
     * @return the bio of the speaker
     */
    public String getBio() {
        return bio;
    }

    /**
     * Adds a session to the speaker's list of sessions.
     *
     * @param session the session to be added
     */
    public void addSession(String session) {
        if (session == null || session.isEmpty()) {
            throw new IllegalArgumentException("Session cannot be null or empty");
        }
        sessions.add(session);
    }

    /**
     * Returns a list of sessions of the speaker.
     *
     * @return a list of sessions of the speaker
     */
    public List<String> getSessions() {
        return new ArrayList<>(sessions);
    }

    /**
     * Returns a string representation of the speaker.
     *
     * @return a string representation of the speaker
     */
    @Override
    public String toString() {
        return "Speaker: " + name + " (Bio: " + bio + ")";
    }
}