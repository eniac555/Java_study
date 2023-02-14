package com.itheima.studentsystempro;

import com.itheima.studentsystem.Student;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentSystemPro {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        ArrayList<Student> list1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("--------------------------");
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作:1登录 2注册 3忘记密码 4退出");
            System.out.println("请输入对应序号进行操作");
            String choose1 = sc.next();

            switch (choose1) {
                case "1" -> {
                    System.out.println("登录");
                    login(list);
                    loop:
                    while (true) {
                        System.out.println("-----------欢迎来到学生管理系统------------");
                        System.out.println("1：添加学生");
                        System.out.println("2：删除学生");
                        System.out.println("3：修改学生");
                        System.out.println("4：查询学生");
                        System.out.println("5：退出");
                        System.out.println("请输入您的选择：");

                        //Scanner sc = new Scanner(System.in);
                        String choose2 = sc.next();

                        switch (choose2) {
                            case "1" -> addStudent(list1);
                            case "2" -> deleteStudent(list1);
                            case "3" -> updateStudent(list1);
                            case "4" -> queryStudent(list1);
                            case "5" -> {
                                System.out.println("退出");
                                break loop;
                                //第二种方法：system.exit(0)，意思是停止虚拟机运行
                            }
                            default -> System.out.println("没有这个选项");
                        }

                    }
                }
                case "2" -> {
                    System.out.println("注册");
                    register(list);
                }
                case "3" -> {
                    System.out.println("忘记密码");
                    forgetPassword(list);
                }
                case "4" -> {
                    System.out.println("谢谢使用，再见");
                    System.exit(0);
                    //第二种方法：system.exit(0)，意思是停止虚拟机运行
                }
                default -> {
                    System.out.println("没有这个选项");
                }
            }
        }
    }

    //1.注册操作
    public static void register(ArrayList<User> list) {
        //创建用户名
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();
            if (contains(list, username) && checkLength(username) && checkRange(username)
                    && checkNumber(username)) {
                System.out.println("用户名创建成功");
                break;
            } else {
                System.out.println("用户名无效，请重新创建用户名");
            }
        }

        //验证两次密码
        String password;
        while (true) {
            System.out.println("请输入密码");
            String password1 = sc.next();
            System.out.println("请再次输入密码");
            String password2 = sc.next();
            if (checkTwoPassword(password1, password2)) {
                System.out.println("密码创建成功");
                password = password1;
                break;
            } else {
                System.out.println("密码创建失败，两次输入密码不一致");
            }
        }

        //验证身份证号码     checkPersonId
        String personId;
        while (true) {
            System.out.println("请输入身份证号");
            personId = sc.next();
            //if (checkPersonId(personId)) {
            if (checkStableLength(18, personId) && zeroStart(personId)
                    && checkOffLast(personId) && checkLast(personId)) {
                System.out.println("身份证号验证成功");
                break;
            } else {
                System.out.println("身份证验证失败，请重新输入");
            }
        }

        //验证手机号
        String phoneNumber;
        while (true) {
            System.out.println("请输入手机号");
            phoneNumber = sc.next();
            if (checkStableLength(11, phoneNumber) && zeroStart(phoneNumber)
                    && checkAllNumber(phoneNumber)) {
                System.out.println("手机号验证成功");
                break;
            } else {
                System.out.println("手机号验证失败，请重新输入");
            }
        }

        User u = new User(username, password, personId, phoneNumber);
        list.add(u);

        System.out.println("注册成功");
    }


    //2.登录操作
    public static void login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        //检查系统中是否有该用户名
        if (!contains(list, username)) {
            //获得用户名所在的索引
            int index = getIndex(list, username);

            //生成随机验证码
            while (true) {
                String checkCode = getCheckCode();
                System.out.println("验证码为：" + checkCode);
                System.out.println("请输入验证码");
                String checkCodeUser = sc.next();
                if (checkTwoPassword(checkCode, checkCodeUser)) {
                    System.out.println("验证码输入正确");
                    break;
                } else {
                    System.out.println("请输入正确的验证码");
                }
            }

            //提示输入用密码
            int count = 0;
            while (count < 3) {
                System.out.println("请输入用户密码");
                String password = sc.next();
                if (checkTwoPassword(list.get(index).getPassword(), password)) {
                    System.out.println("登录成功");
                    break;
                } else {
                    count++;
                    System.out.println("密码输入错误，剩余" + (3 - count) + "次输入密码的机会");
                }
            }
            if (count == 3) {
                System.out.println("您的三次输入密码机会已经用完，请重置密码");
            }

        } else {
            System.out.println("用户名不存在，请先注册");
            return;
        }

    }


    //3.忘记密码操作
    public static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.next();
        //检查系统中是否有该用户名
        if (!contains(list, username)) {
            System.out.println("已在系统中找到该用户");
            //获取用户名所在的索引
            int index = getIndex(list, username);
            //录入身份证号
            System.out.println("请输入身份证号");
            String personId = sc.next();
            //录入身份手机号
            System.out.println("请输入手机号");
            String phoneNumber = sc.next();
            if (checkTwoPassword(list.get(index).getPersonId(), personId) &&
                    checkTwoPassword(list.get(index).getPhoneNumber(), phoneNumber)) {
                System.out.println("身份证号和手机号验证成功，可以修改密码");
                String newPassword = sc.next();
                list.get(index).setPassword(newPassword);
                System.out.println("密码修改成功，请重新登录");
            } else {
                System.out.println("验证失败，无法修改密码");
            }

        } else {
            System.out.println("用户名不存在，请先注册");
            return;
        }

    }


    //验证用户名的唯一性  不是唯一，返回false，唯一则返回true
    public static boolean contains(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(username)) {
                return false;//表示不是唯一
            }
        }
        return true;
    }

    //获得用户名所在的索引
    public static int getIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(username)) {
                return i;//表示不是唯一
            }
        }
        return -1;
    }


    //验证用户名的长度是否合理
    public static boolean checkLength(String username) {
        if (username.length() >= 3 && username.length() <= 15) {
            return true;
        }
        return false;
    }


    //检查用户名组合是否合理---检查字符范围
    public static boolean checkRange(String username) {
        //0-9   48-57
        //A-Z   65-90
        //a-z   97-122
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) < 48 || (username.charAt(i) < 65 && username.charAt(i) > 57)
                    || (username.charAt(i) > 90 && username.charAt(i) < 97)
                    || username.charAt(i) > 122) {
                return false;
            }
        }
        return true;
    }


    //检查用户名组合是否合理---检查是否纯数字
    public static boolean checkNumber(String username) {
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) >= 48 && username.charAt(i) <= 57) {
                count++;
            }
        }
        if (count < username.length()) {
            return true;
        }
        return false;
    }


    //判断两次输入密码是否一致
    public static boolean checkTwoPassword(String password1, String password2) {
        if (password1.equals(password2)) {
            return true;
        } else {
            return false;
        }
    }


    //检查固定的长度
    public static boolean checkStableLength(int length, String str) {
        if (str.length() == length) {
            return true;
        } else {
            return false;
        }
    }

    //查验是否0开头
    public static boolean zeroStart(String str) {
        if (str.charAt(0) == '0') {
            return false;
        } else {
            return true;//不是0开头，返回true
        }
    }

    //查验是否都是数字
    public static boolean checkAllNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 48 || str.charAt(i) > 57) {
                return false;
            }
        }
        return true;//纯数字，返回true
    }

    //查验最后一位数字
    public static boolean checkLast(String str) {
        if ((str.charAt(str.length() - 1) >= 48 &&
                str.charAt(str.length() - 1) <= 57)
                || (str.charAt(str.length() - 1) == 'x')
                || (str.charAt(str.length() - 1) == 'X')) {
            return true;
        } else {
            return false;//不满足条件
        }
    }

    //查验除最后一位外是否都是数字
    public static boolean checkOffLast(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) < 48 || str.charAt(i) > 57) {
                return false;
            }
        }
        return true;
    }


    //查验身份证信息    这个更细，分类返回错误
    public static boolean checkPersonId(String personId) {
        //boolean flag = true;//必须放在while循环里面

        //查验长度
        if (personId.length() != 18) {
            System.out.println("身份证长度不符合，请重新输入");
            return false;
        } else {
            //长度合法，继续查验是否0开头
            if (personId.charAt(0) == '0') {
                System.out.println("身份证第一位不能为0，请重新输入");
                return false;
            } else {
                //不是0开头，继续查验前17位是否都是数字
                for (int i = 0; i < personId.length() - 1; i++) {
                    if (personId.charAt(i) < 48 || personId.charAt(i) > 57) {
                        System.out.println("身份证前17位必须为数字，请重新输入");
                        return false;
                    }
                }

                //查验最后一位是否是数字，或者X或者x
                if ((personId.charAt(personId.length() - 1) >= 48 &&
                        personId.charAt(personId.length() - 1) <= 57)
                        || (personId.charAt(personId.length() - 1) == 'x')
                        || (personId.charAt(personId.length() - 1) == 'X')) {
                    System.out.println("身份证验证成功");
                    return true;
                } else {//最后一位不合法
                    System.out.println("身份证最后一位不合规，请重新输入");
                    return false;
                }

            }
        }

    }


    //查验手机号是否合规       这个更细，分类返回错误
    public static boolean checkPhone(String phoneNumber) {
        //boolean flag = true;//必须放在while循环里面

        //检查长度
        if (phoneNumber.length() != 11) {
            System.out.println("手机号长度不合规，请重新输入");
            return false;
        } else {
            //检查是否数字0开头
            if (phoneNumber.charAt(0) == '0') {
                System.out.println("手机号第一位不能为0，请重新输入");
                return false;
            } else {
                //检查是否都是数字
                for (int i = 0; i < phoneNumber.length(); i++) {
                    if (phoneNumber.charAt(i) > 57 || phoneNumber.charAt(i) < 48) {
                        System.out.println("手机号必须为纯数字，请重新输入");
                        return false;
                    }
                }
                System.out.println("手机号验证成功");
                return true;
            }
        }
    }


    //查验用户名是否存在


    //生成随机验证码
    public static String getCheckCode() {
        char[] result = new char[5];
        char[] arr1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] arr2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        Random r = new Random();
        //放进去四个随机字母
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(arr1.length);
            result[i] = arr1[index];
        }
        //放进去一个随机数字，放在了最后，进一步随机打乱
        int index = r.nextInt(arr2.length);
        result[result.length - 1] = arr2[index];

        //得到随机打乱后的字符数组
        char[] arrResult = randomMatch(result);
        return new String(arrResult);
    }


    //随机打乱数组
    public static char[] randomMatch(char[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
            int index = r.nextInt(arr.length);
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }

    //1.添加学生信息
    public static void addStudent(ArrayList<Student> list) {
        System.out.println("开始添加学生...");
        Student stu = new Student();//无参创建便于后面修改
        Scanner sc = new Scanner(System.in);
        String id = null;

        while (true) {
            System.out.println("请输入学生id...");
            id = sc.next();
            boolean flag = contains1(list, id);
            if (flag) {
                System.out.println("当前id已经存在，请重新输入");
            } else {
                stu.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名...");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入学生年龄...");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入学生家庭住址...");
        String address = sc.next();
        stu.setAddress(address);

        //Student stu = new Student(id, name, age, address);
        list.add(stu);

        System.out.println("学生信息添加成功！");
    }


    //2.删除学生信息
    public static void deleteStudent(ArrayList<Student> list) {
        System.out.println("开始删除学生...");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除的id...");
        String id = sc.next();

        int index = getIndex1(list, id);
        if (index >= 0) {
            //Id存在，开始删除
            list.remove(index);
            System.out.println("id为" + id + "的学生删除成功");
        } else {
            System.out.println("id不存在，删除失败");
        }

    }


    //3.修改学生信息
    public static void updateStudent(ArrayList<Student> list) {
        System.out.println("开始修改学生...");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的id");
        String id = sc.next();

        int index = getIndex1(list, id);
        if (index >= 0) {
            //id存在，开始修改
            Student stu = list.get(index);
            System.out.println("请输入要修改的学生姓名");
            String newName = sc.next();
            stu.setName(newName);

            System.out.println("请输入要修改的学生年龄");
            int newAge = sc.nextInt();
            stu.setAge(newAge);

            System.out.println("请输入要修改的学生住址");
            String newAddress = sc.next();
            stu.setAddress(newAddress);

            System.out.println("学生信息修改成功");

        } else {
            System.out.println("当前id不存在，请重新输入");
        }
    }


    //4.查询学生信息
    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("开始查询学生...");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要查询的id...");
        String id = sc.next();

        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() +
                        "\t" + list.get(i).getAge() + "\t" + list.get(i).getAddress());
            }
        }
        System.out.println("没有查询到id为" + id + "的学生信息");

    }


    //判断id是否唯一
    public static boolean contains1(ArrayList<Student> list, String id) {
        int index = getIndex1(list, id);
        if (index >= 0) {
            return true;
        } else {
            return false;
        }
    }


    //通过id获取索引的方法
    public static int getIndex1(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

}


