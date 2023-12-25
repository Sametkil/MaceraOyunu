package player;

import equipments.Weapon;
import location.Location;
import location.SafeHouse;
import location.ToolStore;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int orjinalHealth;
    private int money;
    private String charName;
    private String name;
    private Invertory invertory;
    private Scanner input=new Scanner(System.in);


    public void selectChar(){
        GameChar[] charList={new Samurai(),new Archer(),new Knight()};
        System.out.println("Karakterler");
        System.out.println("-------------------");
        for (GameChar gameChar:charList) {
            System.out.println("ID : "+gameChar.getId()+"\t"+
                    "Karakter :"+gameChar.getName()+"\t" +
                    "Hasar : "+gameChar.getDamage()+"\t"+
                    "Sağlık : "+gameChar.getDamage()+"\t"+
                    "Para : "+gameChar.getMoney());
        }
        System.out.println("-------------------");
        System.out.println("Bir karakter seçiniz:");
        int selectChar=input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Karakter: "+this.getCharName()
                            +", Hasar: " +this.getDamage()
                            +", Sağlık: "+this.getHealth()
                            +", Para: "+this.getMoney());

    }


    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setOrjinalHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }
    public void printInfo(){
        System.out.println(
                "Silah : " +this.getInvertory().getWeapon().getName()+
                ", Zırh : "+this.getInvertory().getArmor().getName()+
                ", Bloklama : "+this.getInvertory().getArmor().getBlock()+
                ", Hasar : " +this.getTotalDamage()+
                ", Sağlık : "+this.getHealth()+
                ", Para : "+this.getMoney());
    }



    public Player(String name) {
        this.name = name;
        this.invertory = new Invertory();
    }



    public int getTotalDamage(){
        return damage+this.getInvertory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health<0){
            health=0;
        }
        this.health = health;
    }

    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Invertory getInvertory() {
        return invertory;
    }

    public void setInvertory(Invertory invertory) {
        this.invertory = invertory;
    }


}
