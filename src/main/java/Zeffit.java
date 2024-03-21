/**
 * The Zeffit is a character whose purpose is to attack Groks and eliminate them.
 * When Zeffits take a hit, they turn green.  When they take a second hit, Zeffits turn blue.
 * When they take a third hit, Zeffits turn red.  The fourth hit makes them explode in a fiery
 * death!
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class Zeffit
{
    // TODO: add final variables
    private static final int MAX_HITS = 4;
    private static final String EXPLODED_STATE = "Exploded!";

    // TODO: add instance variable(s)
    private int hits;
    private String state;

    /**
     * Constructor for objects of class Zeffit
     */
    public Zeffit()
    {
        // TODO: initialize instance variable(s)
        hits = 0;
        state = "Normal";
    }

    /**
     * Inflicts or registers a hit on this Zeffit.
     *
     */
    public void takesHit()
    {
        // TODO: replace this line with your code
        if (!isDead()) {
            hits++;
            if (hits == 1) {
                state = "Green";
            } else if (hits == 2) {
                state = "Blue";
            } else if (hits == 3) {
                state = "Red";
            } else if (hits >= MAX_HITS) {
                state = EXPLODED_STATE;
            }
        }
    }

    /**
     * Indicates whether this Zeffit has taken no hits
     *
     * @return    true if this Zeffit has taken no hits; false otherwise.
     */
    public boolean isHitFree()
    {
        // TODO: replace this line with your code
        return hits == 0;

    }

    /**
     * Indicates whether this Zeffit has taken a hit
     *
     * @return    true if this Zeffit has taken a hit; false otherwise.
     */
    public boolean isGreen()
    {
        // TODO: replace this line with your code
        return state == "Green";

    }

    /**
     * Indicates whether this Zeffit has taken two hits
     *
     * @return    true if this Zeffit has taken two hits; false otherwise.
     */
    public boolean isBlue()
    {
        // TODO: replace this line with your code
        return state == "Blue";

    }

    /**
     * Indicates whether this Zeffit has taken three hits
     *
     * @return    true if this Zeffit has taken three hits; false otherwise.
     */
    public boolean isRed()
    {
        // TODO: replace this line with your code
        return state == "Red";

    }

    /**
     * Indicates whether this Zeffit has exploded in a fiery death!
     *
     * @return    true if this Zeffit is dead; false otherwise.
     */
    public boolean isDead()
    {
        // TODO: replace this line with your code
        return state == EXPLODED_STATE;

    }
}

