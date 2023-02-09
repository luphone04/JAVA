package test_package.game;

class Knight extends Character {
    private Weapon weapon;

    public Knight(String name, int health, int attack, int defense, int speed, Weapon weapon) {
        super(name, health, attack, defense, speed);
        this.weapon = weapon;
    }

    public int getAttack() {
        return super.getAttack() + weapon.getDamage();
    }
}