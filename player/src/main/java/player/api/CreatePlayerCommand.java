package player.api;

public class CreatePlayerCommand {

    private String username;

    protected CreatePlayerCommand() {
    }

    public CreatePlayerCommand(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
