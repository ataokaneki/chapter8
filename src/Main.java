public class Main {
    public static void main(String[] args) {

        Hero h1 = new Hero("ミナト");
        System.out.println(h1.name);

        Hero h2 = new Hero();
        System.out.println(h2.name);

        /*Wizard w = new Wizard();
        w.name = "スガワラ";
        w.hp = 100;

        w.heal(h1);
        w.heal(h2);
        w.heal(h2);

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        h.slip();
        m1.run();
        m2.run();
        h.run();
        */
    }
}