package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //JFrame  界面，窗体
    //子类呢？也是一个界面，窗体
    //规定：GameJFrame这个界面表示的就是游戏主界面
    //以后和游戏相关的所有逻辑都写在这个类中

    //创建二维数组，目的是用来管理数据
    //加载图片时，会根据二维数组里的数据进行加载，写在外面的原因是后面还要用
    int[][] date1 = new int[4][4];

    //记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    //定义一个变量记录当前展示的图片的路径
    String path = "jigsawgame\\image\\animal\\animal3\\";

    //定义正确的图片排列数组，用来判断是否成功
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0},
    };

    //定义计数器，记录步数
    int step = 0;

    //创建选项下面的条目对象，后面添加事件要用
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFrame() {
        //初始化界面
        initJFrame();

        //设置菜单
        initJMenuBar();

        //初始化数据（打乱）
        initData();

        //初始化图片（根据打乱后的结果加载图片）
        initImage();


        //让界面显示出来
        this.setVisible(true);//没有这个就不会显示
    }


    private void initData() {

        //定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱数组顺序
        //遍历数组，得到每一个元素，再和随机一个元素进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[index];
            tempArr[index] = tempArr[i];
            tempArr[i] = temp;
        }

        //解法一
        //遍历一维数组的每一个元素，把每一个元素一次添加到二维数组中
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {//记录空白方块的位置
                x = i / 4;
                y = i % 4;
            }
            date1[i / 4][i % 4] = tempArr[i];//很巧妙哈哈


        }

    }

    private void initImage() {
        //清除已经出现的所有图片
        this.getContentPane().removeAll();
        if (victory()){
            //显示胜利的图标
            JLabel winJLabel = new JLabel(new ImageIcon("D:\\Java\\IdeaProjects\\basic-code\\jigsawgame\\image\\win.png"));
            winJLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("步数："+step);
        stepCount.setBounds(50,30,100,20);
        this.getContentPane().add(stepCount);

        //创建一个图片ImageIcon的对象
        //ImageIcon icon = new ImageIcon("jigsawgame\\image\\animal\\animal3\\1.jpg");
        //int num = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int num = date1[i][j];
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon(path + num + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //把图片位置尽量居中

                //给图片添加边框
                /*  0：图片凸起  1：图片凹下去 */
                jLabel.setBorder(new BevelBorder(1));

                //把管理容器添加到界面中
                //this.add(jLabel1);
                this.getContentPane().add(jLabel);
                //num++;//添加一次后自增，表示添加下一张，放在内循环
            }
        }


        //先加载的图片在上方
        //添加背景图片
        ImageIcon icon = new ImageIcon("jigsawgame\\image\\background.png");
        JLabel backGround = new JLabel(icon);
        backGround.setBounds(40, 40, 508, 560);
        this.getContentPane().add(backGround);

        //刷新界面
        this.getContentPane().repaint();
    }

    private void initJMenuBar() {
        //创建菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单上面的两个选项的对象  功能  关于我们
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");



        //将每个选项下面的条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

        //将菜单里面的两个选项添加到菜单
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面大小
        this.setSize(603, 680);//单位:像素
        //设置标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式进行放置
        this.setLayout(null);
        //给整个界面添加键盘监听事件
        this.addKeyListener(this);
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松时会调用这个方法
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //把界面中所有图片删除
            this.getContentPane().removeAll();
            //加载完整图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //加载背景图片
            ImageIcon icon = new ImageIcon("jigsawgame\\image\\background.png");
            JLabel backGround = new JLabel(icon);
            backGround.setBounds(40, 40, 508, 560);
            this.getContentPane().add(backGround);
            this.getContentPane().repaint();
        }

    }


    //松开按键时调用这个方法
    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利，此方法直接结束，不能执行后面的移动代码
        if (victory()){
            return;
        }

        //对上下左右进行判断
        //左：37  上：38  右：39  下：40
        int code = e.getKeyCode();
        if (code == 37) {
            if (y == 3) {
                return;
            }
            //把空白方块右面的图片往左移动
            //
            date1[x][y] = date1[x][y + 1];
            date1[x][y + 1] = 0;
            y++;

            //每移动一次，计数器加1
            step++;
            //调用方法，按照最新的数字加载图片
            initImage();
            System.out.println("向左移动");
        } else if (code == 38) {
            if (x == 3) {
                //表示空白图片已经在最下方了，他的下面没有图片
                return;
            }
            //把空白方块下面的图片往上移动
            //
            date1[x][y] = date1[x + 1][y];
            date1[x + 1][y] = 0;
            x++;

            //每移动一次，计数器加1
            step++;
            //调用方法，按照最新的数字加载图片
            initImage();
            System.out.println("向上移动");
        } else if (code == 39) {
            if (y == 0) {
                return;
            }
            //把空白方块左面的图片往右移动
            //
            date1[x][y] = date1[x][y - 1];
            date1[x][y - 1] = 0;
            y--;

            //每移动一次，计数器加1
            step++;
            //调用方法，按照最新的数字加载图片
            initImage();
            System.out.println("向右移动");
        } else if (code == 40) {
            if (x == 0) {
                return;
            }
            //把空白方块上面的图片往下移动
            //
            date1[x][y] = date1[x - 1][y];
            date1[x - 1][y] = 0;
            x--;

            //每移动一次，计数器加1
            step++;
            //调用方法，按照最新的数字加载图片
            initImage();
            System.out.println("向下移动");
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            date1 = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0},
            };
            initImage();
        }
    }


    //判断data1数组中的数据是否和win数组中相同，相同则成功通关，返回ture
    public boolean victory(){
        for (int i = 0; i < date1.length; i++) {
            for (int j = 0; j < date1[i].length; j++) {
                if (date1[i][j] != win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前点击的条目对象
        Object obj = e.getSource();
        //判断
        if (obj==replayItem){
            System.out.println("重新游戏");

            //计数器清零，顺序不能换
            step=0;
            //再次打乱二维数组中的数据
            initData();
            //重新加载图片
            initImage();


        }else if (obj==reLoginItem){
            System.out.println("重新登录");

            //关闭当前游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();

        }else if (obj==closeItem){
            System.out.println("退出游戏");

            //直接关闭虚拟机即可
            System.exit(0);
        }else if (obj==accountItem){
            System.out.println("公众号");

            //创建弹窗对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片的容器对象
            JLabel jLabel = new JLabel(new ImageIcon("jigsawgame\\image\\about.png"));
            //设置位置和宽高
            jLabel.setBounds(0,0,258,258);
            //把图片添加到弹窗中
            jDialog.getContentPane().add(jLabel);
            //给弹窗设置大小
            jDialog.setSize(344,344);
            //让弹窗置顶
            jDialog.setAlwaysOnTop(true);
            //让弹窗居中
            jDialog.setLocationRelativeTo(null);
            //弹窗不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹窗显示出来
            jDialog.setVisible(true);


        }
    }
}
