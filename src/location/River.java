package location;

import monsters.Bear;
import monsters.Obstacle;
import player.Player;

public class River extends BattleLocation{
    public River(Player player) {
        super(player, "Nehir", new Bear(), "Su",2);
    }
}
