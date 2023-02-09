package test_package.game;
import java.util.Random;
import java.util.Scanner;

public class Fight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first character's name: ");
        String name1 = scan.nextLine();
        System.out.print("Enter the first character's health: ");
        int health1 = scan.nextInt();
        System.out.print("Enter the first character's attack: ");
        int attack1 = scan.nextInt();
        System.out.print("Enter the first character's defense: ");
        int defense1 = scan.nextInt();
        System.out.print("Enter the first character's speed: ");
        int speed1 = scan.nextInt();
        System.out.print("Enter the first character's type (Knight/Wizard): ");
        String type1 = scan.next();
        System.out.println();

        Character c1;
        if (type1.equals("Knight")) {
            System.out.print("Enter the weapon's damage: ");
            int damage1 = scan.nextInt();
            Weapon w1 = new Weapon(damage1);
            c1 = new Knight(name1 , health1, attack1, defense1, speed1, w1);
        } else {
            System.out.print("Enter the spell's damage: ");
            int damage1 = scan.nextInt();
            Spell s1 = new Spell(damage1);
            c1 = new Wizard(name1, health1, attack1, defense1, speed1, s1);
        }


        System.out.print("Enter the second character's name: ");
        scan.nextLine();
        String name2 = scan.nextLine();
        System.out.print("Enter the second character's health: ");
        int health2 = scan.nextInt();
        System.out.print("Enter the second character's attack: ");
        int attack2 = scan.nextInt();
        System.out.print("Enter the second character's defense: ");
        int defense2 = scan.nextInt();
        System.out.print("Enter the second character's speed: ");
        int speed2 = scan.nextInt();
        System.out.print("Enter the second character's type (Knight/Wizard): ");
        String type2 = scan.next();
        System.out.println();

        Character c2;
        if (type2.equals("Knight")) {
            System.out.print("Enter the weapon's damage: ");
            int damage2 = scan.nextInt();
            Weapon w2 = new Weapon(damage2);
            c2 = new Knight(name2, health2, attack2, defense2, speed2, w2);
        } else {
            System.out.print("Enter the spell's damage: ");
            int damage2 = scan.nextInt();
            Spell s2 = new Spell(damage2);
            c2 = new Wizard(name2, health2, attack2, defense2, speed2, s2);
        }

        while (c1.getHealth() > 0 && c2.getHealth() > 0) {
            if (c1.getSpeed() >= c2.getSpeed()) {
                c2.health -= c1.getAttack();
                System.out.println(c1.getName() + " attacks " + c2.getName() + " for " + c1.getAttack() + " damage.");
                System.out.println(c2.getName() + " now has " + c2.getHealth() + " health.");
                if (c2.getHealth() <= 0) {
                    break;
                }
                c1.health -= c2.getAttack();
                System.out.println(c2.getName() + " attacks " + c1.getName() + " for " + c2.getAttack() + " damage.");
                System.out.println(c1.getName() + " now has " + c1.getHealth() + " health.");
            } else {
                c1.health -= c2.getAttack();
                System.out.println(c2.getName() + " attacks " + c1.getName() + " for " + c2.getAttack() + " damage.");
                System.out.println(c1.getName() + " now has " + c1.getHealth() + " health.");
                if (c1.getHealth() <= 0) {
                    break;
                }
                c2.health -= c1.getAttack();
                System.out.println(c1.getName() + " attacks " + c2.getName() + " for " + c1.getAttack() + " damage.");
                System.out.println(c2.getName() + " now has " + c2.getHealth() + " health.");
            }
        }

        if (c1.getHealth() <= 0) {
            System.out.println(c2.getName() + " wins!");
        } else {
            System.out.println(c1.getName() + " wins!");
        }

    }
}
