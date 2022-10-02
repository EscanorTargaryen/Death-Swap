package it.escanortargaryen.deathswap;

import dev.jorel.commandapi.CommandAPI;
import dev.jorel.commandapi.CommandAPIConfig;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.LinkedList;
import java.util.List;

public class MainClass extends JavaPlugin {

    public static MainClass INSTANCE;
    /**
     * List of the games
     */
    public static List<Game> GAMES = new LinkedList<>();

    @Override
    public void onLoad() {
        CommandAPI.onLoad(new CommandAPIConfig().verboseOutput(true));

    }

    @Override
    public void onEnable() {
        CommandAPI.onEnable(this);
        INSTANCE = this;

        new RegisterCommands();

    }

}
