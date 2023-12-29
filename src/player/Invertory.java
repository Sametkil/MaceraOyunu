package player;

import equipments.Armor;
import equipments.Weapon;

public class Invertory {
    private Weapon weapon;
    private Armor armor;
    private boolean Food,Water,Wood;



    public Invertory(){
        this.weapon=new Weapon("Yumruk",-1,0,0);
        this.armor=new Armor(-1,"Paçavra",0,0);
        this.Food=false;
        this.Water=false;
        this.Wood=false;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isFood() {
        return Food;
    }

    public void setFood(boolean food) {
        Food = food;
    }

    public boolean isWater() {
        return Water;
    }

    public void setWater(boolean water) {
        Water = water;
    }

    public boolean isWood() {
        return Wood;
    }

    public void setWood(boolean wood) {
        Wood = wood;
    }
}
