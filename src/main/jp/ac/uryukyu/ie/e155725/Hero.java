package jp.ac.uryukyu.ie.e155725;

public class Hero extends LivingThing{

    public Hero (String name, int maximumHP, int attack) {
        super(name,maximumHP, attack);
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        //サブクラスの初期化？

    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}