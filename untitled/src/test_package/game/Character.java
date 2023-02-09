package test_package.game;

abstract class Character implements GameCharacter, Comparable<Character> {
    protected int health;
    protected int attack;
    protected int defense;
    protected int speed;
    protected String name;

    public Character(String name , int health, int attack, int defense, int speed) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }
    public String getName() {
        return name;
    }

    public int compareTo(Character c) {
        return this.health - c.health;
    }
}