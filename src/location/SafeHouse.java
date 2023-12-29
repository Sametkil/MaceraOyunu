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

        if (getPlayer().getInvertory().isFood()==true &&
                getPlayer().getInvertory().isWater()==true &&
                getPlayer().getInvertory().isWood()==true) {

            System.out.println("Tebrikler adada hayatta kaldınız");
            System.out.println("Oyunu kazandınız !!!");
        }

        return true;
    }

}
