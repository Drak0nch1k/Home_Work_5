public class Hero {
    private int hitPoints;
    private int damage;
    private String superpower;


    private Hero(int hitPoints, int damage, String superpower) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.superpower = superpower;
    }
    private Hero(int hitPoints, int damage) {
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    //------------------------------
    public int getDamage() {
        return damage;
    }


    //------------------------------


    public String getSuperpower() {
        return superpower;
    }
    //------------------------------



}
