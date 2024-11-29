/**
 * Abstract class representing a generic entity with an ID and a name.
 */
public abstract class Entity {
    /**
     * The unique identifier for the entity.
     */
    protected String id;

    /**
     * The name of the entity.
     */
    protected String name;

    /**
     * Gets the unique identifier of the entity.
     * 
     * @return the ID of the entity.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the entity.
     * 
     * @param id the new ID of the entity.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets the name of the entity.
     * 
     * @return the name of the entity.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the entity.
     * 
     * @param name the new name of the entity.
     */
    public void setName(String name) {
        this.name = name;
    }
}