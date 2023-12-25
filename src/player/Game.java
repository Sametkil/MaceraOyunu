package player;

import location.*;

import java.util.Scanner;

public class Game {
    private Scanner input=new Scanner(System.in);

    public void start() {
        System.out.println("Macera oyununa hoşgeldiniz !");
        System.out.print("Lütfen bir isim giriniz :");
        String playerName= input.nextLine();
        Player player =new Player(playerName);
        System.out.println("Sayın "+player.getName()+" bu karanlık ve sisli adaya hoşgeldiniz ! Burada yaşanan herşey gerçek...");
        System.out.println("Bir karakter seçiniz.");
        System.out.println("-------------------");
        player.selectChar();

        Location location=null;
        while (true){
            player.printInfo();
            System.out.println();
            System.out.println("Bölgeler: ");
            System.out.println();
            System.out.println("1-Güvenli ev");
            System.out.println("2-Dükkan");
            System.out.println("3-Mağara");
            System.out.println("4-Orman");
            System.out.println("5-Nehir");
            System.out.println("0-Oyunu sonlandır");
            System.out.print("-----Gitmek istediğiniz yeri seçin : ");
            int selectLoc=input.nextInt();
            switch (selectLoc){
                case 0:
                    location=null;
                    break;
                case 1:
                    location=new SafeHouse(player);
                    break;
                case 2:
                    location=new ToolStore(player);
                    break;
                case 3:
                    location=new Cave(player);
                    break;
                case 4:
                    location=new Forest(player);
                    break;
                case 5:
                    location=new River(player);
                    break;
                default:
                    System.out.println("Geçerli bir bölge giriniz !");
            }
            if (location == null){
                System.out.println("Çok çabuk pes ettin :)");
                break;
            }
            if (!location.onLocation()){
                System.out.println("Oyun bitti kaybettiniz!!!");
                break;
            }
        }

    }

}
