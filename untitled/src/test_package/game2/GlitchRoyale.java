package test_package.game2;
        import java.util.*;

public class GlitchRoyale  {
    abstract static class GameCharacter implements Comparable<GameCharacter> {
        private int health;
        private int attack;
        private int speed;
        private String name;


        private int damageAttack;

        public GameCharacter(int health, int attack, int speed, String name) {
            this.health = health;
            this.attack = attack;
            this.speed = speed;
            this.name = name;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getDamage() {
            return damageAttack;
        }

        public int getAttack() {
            return attack;
        }

        public int getSpeed() {
            return speed;
        }

        public String getName() {
            return name;
        }



        public int compareTo(GameCharacter o) {
            return this.speed - o.speed;
        }
    }

    public static class Knight extends GameCharacter {
        public Knight(int health, int attack, int speed, String name) {
            super(health, attack, speed, name);
        }
    }

    public static class Archer extends GameCharacter {
        public Archer(int health, int attack, int speed, String name) {
            super(health, attack, speed, name);
        }
    }

    public static class Mage extends GameCharacter {
        public Mage(int health, int attack, int speed, String name) {
            super(health, attack, speed, name);
        }
    }

}