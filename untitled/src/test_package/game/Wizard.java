package test_package.game;

class Wizard extends Character {
    private Spell spell;

    public Wizard(String name , int health, int attack, int defense, int speed, Spell spell) {
        super(name, health, attack, defense, speed);
        this.spell = spell;
    }

    public int getAttack() {
        return super.getAttack() + spell.getDamage();
    }
}

