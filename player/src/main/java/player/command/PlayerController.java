package player.command;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import player.model.Player;
import player.api.CreatePlayerCommand;

@Controller("/api/player")
public class PlayerController {

    @Post
    public Player create(@Body CreatePlayerCommand command) {
        return new Player(0, command.getUsername());
    }

    @Get("/{id}")
    public Player read(long id) {
        return new Player(id, "pong");
    }
}
