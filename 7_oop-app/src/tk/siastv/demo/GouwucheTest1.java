package tk.siastv.demo;

import java.util.Scanner;

// 目标：面向对象编程练习，购物车模块模拟
public class GouwucheTest1 {
    public static void main(String[] args) {
        ShangPin[] gouwuche = new ShangPin[100];

        // 1、定义商品类（ShangPin），用于后期创建商品
        // 2、定义购物车对象，用数组表示
        // 3、搭建具体架构
        while (true) {
            System.out.println("请您选择如下命令进行操作");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品到购物车：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购买商品的金额：pay");
            Scanner jp = new Scanner(System.in);
            System.out.println("请您输入命令");
            String sr = jp.next();
            switch (sr) {
                case "add": // 添加商品到购物车
                    addshangpin(gouwuche, jp);
                    break;
                case "query": // 查询商品到购物车
                    queryshangpin(gouwuche);
                    break;
                case "update":// 修改商品购买数量
                    updateshangpin(gouwuche, jp);
                    break;
                case "pay": // 结算购买商品的金额
                    payshangpin(gouwuche);
                    break;
                default:
                    System.out.println("信息输入错误");
                    System.out.println("------------------");
            }
        }
    }

    // 完成结算购买商品的金额功能
    public static void payshangpin(ShangPin[] gouwuche) {
        queryshangpin(gouwuche);
        double money = 0;
        for (int i = 0; i < gouwuche.length; i++) {
            ShangPin zj = gouwuche[i];
            if (zj != null) {
                money += (zj.jiage * zj.shuliang);
            }else {
                System.out.println("购物车没有商品");
                break;
            }
        }
        System.out.println("商品总价为：" + money);
    }

    // 完成修改商品购买数量功能
    public static void updateshangpin(ShangPin[] gouwuche, Scanner jp) {
        while (true) {
            System.out.println("请输入您要修改商品的编号");
            int bh = jp.nextInt();
            ShangPin xg = xg(gouwuche, bh);
            if (xg == null) {
                System.out.println("没有该商品");
                System.out.println("------------------");
                break;
            } else {
                System.out.println("请您输入：" + xg.id + "号商品要修改的购买数量");
                int sl = jp.nextInt();
                xg.shuliang = sl;
                System.out.println("修改完成 " + xg.id + "号商品购买数量已经修改为：" + xg.shuliang);
                break;
            }
        }
    }

    // 找出用户输入编号的商品对象地址
    public static ShangPin xg(ShangPin[] gouwuche, int id) {
        for (int i = 0; i < gouwuche.length; i++) {
            ShangPin xg = gouwuche[i];
            System.out.println(xg);
            if (xg != null) { // 判断购物车是否存有商品
                if (xg.id == id) { // 判断这个对象ID是否是用户输入的ID
                    return xg;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    // 完成查询商品到购物车功能
    public static void queryshangpin(ShangPin[] gouwuche) {
        System.out.println("========查询购物车信息如下========");
        System.out.println("编号 名称 价格 数量");
        for (int i = 0; i < gouwuche.length; i++) {
            ShangPin cx = gouwuche[i];
            if (cx != null) {
                System.out.println(cx.id + "   " + cx.name + "  " + cx.jiage + "  " + cx.shuliang);
            } else {
                break;
            }
        }
    }

    // 完成商品添加到购物车功能
    public static void addshangpin(ShangPin[] gouwuche, Scanner jp) {
        // 1、录入商品信息，把这个商品信息封装成一个商品对象
        System.out.println("请输入商品编号：");
        int id = jp.nextInt();
        System.out.println("请输入商品名称：");
        String name = jp.next();
        System.out.println("请输入商品价格：");
        double jiage = jp.nextDouble();
        System.out.println("请输入购买数量：");
        int shuliang = jp.nextInt();
//
//        System.out.println("请输入商品编号：");
//        add.id = jp.nextInt();
//        System.out.println("请输入商品名称：");
//        add.name = jp.next();
//        System.out.println("请输入商品价格：");
//        add.jiage = jp.nextDouble();
//        System.out.println("请输入购买数量：");
//        add.shuliang = jp.nextInt();
//        ShangPin add1 = add;

        // 2、把这个商品信息封装成一个商品对象
        ShangPin add = new ShangPin();
        add.id = id;
        add.name = name;
        add.jiage = jiage;
        add.shuliang = shuliang;

        // 3、把这个商品对象添加到购物车数组中
        for (int i = 0; i < gouwuche.length; i++) {
            if (gouwuche[i] == null) {
                gouwuche[i] = add;
                break;
            }
        }
        System.out.println("您的商品：" + add.name + " 录入成功");
    }
}
