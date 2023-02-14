package com.itheima.test1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;


    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义方法，用于攻击别人
    //思考：谁攻击谁？
    //Role r1 = new Role();
    //Role r2 = new Role();
    //r1.攻击(r2);
    //方法的调用者攻击参数
    public void attack(Role role) {
        //计算造成的伤害1-20
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //修改一下挨揍的人的血量
        int remainBlood = role.getBlood() - hurt;

        //剩余血量可能为负数
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改一下剩余血量
        role.setBlood(remainBlood);

        //this表示方法的调用者
        System.out.println(this.getName() + "举起拳头打了" + role.getName() + "一下，" +
                "造成了" + hurt + "点伤害，" + role.getName() + "还剩下" + remainBlood + "点血");

    }


}
