public class Troll extends Character {
    public Troll(String name){
        super(name);
        WeaponBehavior = new WeaponAxe();
    }

    public void display(){
        System.out.println(name+ "is is a funny troll");

    }
}

