public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();

         boss.setDamage(50);
         boss.setHitPoints(300);
         boss.setDefenceType("Magic");
        System.out.println("Damage: " + boss.getDamage() + "\n Hit Point: "
                + boss.getHitPoints() + "\n Defence Type: " + boss.getDefenceType());


    }
}