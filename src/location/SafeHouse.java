package location;

import player.Player;

public class SafeHouse extends NormalLocation{

    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }
    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz");
        System.out.println("Canını yenilendi");
        this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
        return true;
    }
}
