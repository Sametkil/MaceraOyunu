package location;

import monsters.Obstacle;
import monsters.Zombie;
import player.Player;

public class Cave extends BattleLocation{

    public Cave(Player player) {

        super(player, "Mağara", new Zombie(), "Yemek",3);
    }
}
