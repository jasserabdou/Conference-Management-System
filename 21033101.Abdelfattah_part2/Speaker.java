import java.util.List;

/**
 * The Speaker class represents a speaker at the conference.
 * It extends the Entity class and implements the Person interface.
 */
public class Speaker extends Entity implements Person {
    private String name;
    private String bio;
    private List<Session> sessions;

    /**
     * Gets the biography of the speaker.
     * 
     * @return the biography of the speaker
     */
    public String getBio() {
        return bio;
    }

    /**
     * Gets the name of the speaker.
     * 
     * @return the name of the speaker
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the biography of the speaker.
     * 
     * @param bio the biography to set
     */
    public void setBio(String bio) {
        this.bio = bio;
    }

    /**
     * Gets the list of sessions the speaker is involved in.
     * 
     * @return the list of sessions
     */
    public List<Session> getSessions() {
        return sessions;
    }

    /**
     * Sets the list of sessions the speaker is involved in.
     * 
     * @param sessions the list of sessions to set
     */
    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}