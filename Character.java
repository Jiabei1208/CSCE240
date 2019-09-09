public abstract class Character {
    protected String name;
    weaponBehavior WeaponBehavior;

    public Character(String name){
        this.name=name;
    }

    public void attack()
    {
       WeaponBehavior.attack();
    }

    public void setWeaponBehavior(weaponBehavior wb)
    {
        WeaponBehavior=wb;
    }

    public abstract void display();
}
