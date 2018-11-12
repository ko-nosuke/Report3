package jp.ac.uryukyu.ie.e155725;

public class Enemy extends LivingThing{

    public Enemy (String name, int maximumHP, int attack) {
        super(name,maximumHP, attack);
        this.setNam(name);
        setHitPoint(maximumHP);
        this.setAttack(attack);
        setDead(false);
        //サブクラスの初期化？

    }

    public void wounded(int damage){
       setHitPoint(getHitPoint() - damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getNam());
        }
    }


}