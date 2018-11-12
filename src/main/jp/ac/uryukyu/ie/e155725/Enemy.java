package jp.ac.uryukyu.ie.e155725;

public class Enemy extends LivingThing{

    public Enemy (String name, int maximumHP, int attack) {
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
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}