package com.itheima.a04objectdemo;

//Cloneable
//如果一个接口里没有抽象方法，表示当前接口是一个标记接口
//现在Cloneable一旦被实现，那么当前类的对象就能被克隆，没有实现，则不能被克隆

import java.util.StringJoiner;

public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;//游戏图片
    private int[] date;//游戏进度


    public User() {
    }

    public User(int id, String username, String password, String path, int[] date) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.date = date;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return date
     */
    public int[] getDate() {
        return date;
    }

    /**
     * 设置
     * @param date
     */
    public void setDate(int[] date) {
        this.date = date;
    }

    public String toString() {
        return "id = " + id + ", username = " + username + ", password = " + password + "," +
                " path = " + path + ", date = " + arrToString();
    }

    public String arrToString() {
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int i = 0; i < date.length; i++) {
            sj.add(date[i]+"");
        }
        return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的克隆方法
        //相当于让Java帮我们克隆一个对象，并把克隆之后的对象返回出去
        return super.clone();
    }

    protected Object cloneDeep() throws CloneNotSupportedException {
        //先把被克隆对象中的数组取出来
        int[] data = this.date;

        //创建新的数组
        int[] newData = new int[data.length];

        //拷贝数组中的数据
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        //调用父类中的方法克隆对象
        User u = (User) super.clone();
        //因为父类中的克隆方法是浅克隆，替换克隆出来的对象中的数组地址值
        u.date = newData;
        return u;
    }
}
