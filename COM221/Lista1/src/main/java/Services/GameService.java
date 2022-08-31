package Services;

import Models.Platform;
import Models.Game;

import java.util.ArrayList;
import java.util.List;

public class GameService {

    public static List<Game> getListByPlatform(List<Game> games, Platform platform){

        List<Game> gamesByPlatform = new ArrayList<>();

        games.stream().filter(game -> game.getPlatform().equals(platform.name()));
            .forEach(game -> gamesByPlatform.add(game));
        return gamesByPlatform;


    }

}
