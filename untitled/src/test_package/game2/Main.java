package test_package.game2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            ArrayList<GlitchRoyale.GameCharacter> characters = new ArrayList<>();
            GlitchRoyale outer = new GlitchRoyale();
            characters.add(new GlitchRoyale.Knight(100, 15, 80, "Sir Lancelot"));
            characters.add(new GlitchRoyale.Archer(80, 20, 90, "Robin Hood"));
            characters.add(new GlitchRoyale.Mage(60, 25, 100, "Merlin"));
            characters.add(new GlitchRoyale.Knight(120, 10, 70, "King Arthur"));
            characters.add(new GlitchRoyale.Archer(90, 18, 85, "Katniss Everdeen"));
            characters.add(new GlitchRoyale.Mage(70, 22, 95, "Gandalf"));

            ArrayList<GlitchRoyale.GameCharacter> playerTeam = new ArrayList<>();
            ArrayList<GlitchRoyale.GameCharacter> botTeam = new ArrayList<>();

            System.out.println("Welcome to Clash Royale! You will build your team of 4 characters to battle against the bot.");
            System.out.println("Select 4 characters from the list below to add to your team:");
            for (int i = 0; i < characters.size(); i++) {
                System.out.println((i + 1) + ") " + characters.get(i).getName());
            }

            for (int i = 0; i < 4; i++) {
                System.out.print("Enter character number " + (i + 1) + ": ");
                int choice = scan.nextInt() - 1;
                playerTeam.add(characters.get(choice));
            }

            Collections.shuffle(characters);
            for (int i = 0; i < 4; i++) {
                botTeam.add(characters.get(i));
            }

            System.out.println("Bot team: " + botTeam);
            System.out.println("Choose your 4 characters from the list: " + characters);
            for (int i = 0; i < 4; i++) {
                System.out.println("Enter the index of character " + (i + 1) + ": ");
                ;
                int index = scan.nextInt();
                while (playerTeam.contains(characters.get(index)) || botTeam.contains(characters.get(index))) {
                    System.out.println("Character already selected. Choose another character: ");
                    index = scan.nextInt();
                }
                playerTeam.add(characters.get(index));
            }

            System.out.println("Player team: " + playerTeam);
            System.out.println("Starting the game...");

            while (playerTeam.size() > 0 && botTeam.size() > 0) {
                GlitchRoyale.GameCharacter c1 = playerTeam.get(0);
                GlitchRoyale.GameCharacter c2 = botTeam.get(0);

                System.out.println(c1.getName() + " VS " + c2.getName());
                while (c1.getHealth() > 0 && c2.getHealth() > 0) {
                    if (c1.getSpeed() >= c2.getSpeed()) {
                    c2.setHealth(c2.getHealth() - c1.getDamage());
                    System.out.println(c1.getName() + " attacked " + c2.getName() + " with damage " + c1.getDamage());
                    System.out.println(c2.getName() + " now has " + c2.getHealth() + " health left");
                    } else {
                    c1.setHealth(c1.getHealth() - c2.getDamage());
                    System.out.println(c2.getName() + " attacked " + c1.getName() + " with damage " + c2.getDamage());
                    System.out.println(c1.getName() + " now has " + c1.getHealth() + " health left");
                    }
                    }

                    if (c1.getHealth() <= 0) {
                    System.out.println(c2.getName() + " won!");
                    botTeam.remove(c2);
                    playerTeam.remove(c1);
                    } else {
                    System.out.println(c1.getName() + " won!");
                    botTeam.remove(c2);
                    playerTeam.remove(c1);
                    }
                    }

                    if (playerTeam.size() == 0) {
                    System.out.println("Bot won the game!");
                    } else {
                    System.out.println("Player won the game!");
                    }
                    }


                    }
