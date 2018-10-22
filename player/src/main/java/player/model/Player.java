package player.model;

public class Player {

    private final long id;
    private final String username;

    public Player(long id, String username) {
        this.id = id;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
}
