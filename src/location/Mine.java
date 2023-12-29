package location;

import monsters.Obstacle;
import monsters.Snake;
import player.Player;

public class Mine extends BattleLocation{

    public Mine(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, "Maden", new Snake(), award, maxObstacle);
    }
}
