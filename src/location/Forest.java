package location;

import monsters.Obstacle;
import monsters.Vampire;
import player.Player;

public class Forest extends BattleLocation{

    public Forest(Player player) {
        super(player, "Orman", new Vampire(), "Odun",3);
    }
}
