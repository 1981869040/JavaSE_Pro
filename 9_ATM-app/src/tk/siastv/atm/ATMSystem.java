package tk.siastv.atm;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.SimpleTimeZone;

// ATM系统的入口类
public class ATMSystem {
    public static void main(String[] args) {
        // 1、定义账户类
        // 2、定义一个集合容器，负责以后存储全部账户对象，进行相关的业务操作
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // 3、展示系统的首页
        while (true) {
            System.out.println("===============ATM系统==================");
            System.out.println("1、账户登陆");
            System.out.println("2、账户开户");

            System.out.println("请选择您的操作：");
            int command = sc.nextInt();

            switch (command) {
                case 1:
                    // 用户登陆操作
                    login(accounts, sc);
                    break;
                case 2:
                    // 用户开户操作
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的命令不存在");
            }
        }
    }

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("========================系统登陆操作========================");
        // 1、判断账户集合中是否存在账户，如果不存在账户，登陆功能不能进行
        if (accounts.size() == 0) {
            System.out.println("对不起，当前系统中不存在账户，请先开户，再来登录");
            return;// 卫语言风格，解决方法的执行
        }

        // 2、正式进入登录操作
        System.out.println("请输入登录卡号：");
        String cardId = sc.next();
        // 3、判断卡号是否存在，根据这个卡号去查询账户对象
        Account acc = getAccountByCarId(cardId, accounts);
        if (acc != null) {
            // 卡号存在的
            // 4、让用户输入密码，确认密码
            System.out.println("请您输入登录密码");
            String passWord = sc.next();
            // 判断当前账户对象的密码是否与用户输入的密码一致
            if (acc.getPassword().equals(passWord)) {
                // 登录成功了
                System.out.println("恭喜您" + acc.getUserName() + "登录成功");
                // 查询 转账 取款
                // 展示登录后的操作页
                showUserCommand(sc, acc, accounts);
                return; // 干掉登陆方法
            } else {
                System.out.println("对不起，您输入的密码错误");
            }
        } else {
            System.out.println("对不起，系统中不存在该账户卡号");
        }

    }

    /**
     * 展示登录后的操作页
     */
    private static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("========================用户操作页========================");
            System.out.println("1、查询账户");
            System.out.println("2、存款");
            System.out.println("3、取款");
            System.out.println("4、转账");
            System.out.println("5、修改密码");
            System.out.println("6、退出");
            System.out.println("7、注销账户");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    // 查询账户
                    showAccount(acc);
                    break;
                case 2:
                    // 存款
                    depostiMoney(acc, sc);
                    break;
                case 3:
                    // 取款
                    drawMoney(acc, sc);
                    break;
                case 4:
                    // 转账
                    transferMoney(sc, acc, accounts);
                    break;
                case 5:
                    // 修改密码
                    updatePassword(sc, acc);
                    return; // 让当前方法停止，跳出去
                case 6:
                    System.out.println("退出成功，欢迎下次光临");
                    // 退出
                    return; // 让当前方法停止执行，跳出去
                case 7:
                    // 注销账户
                    // 从当前账户集合中，删除当前账户对象，销户就完成了
                    if (deleteAccount(acc, sc, accounts)) {
                        return; // 让当前方法停止执行，跳出去
                    } else {
                        break;
                    }
                default:
                    System.out.println("命令输入错误，请重新输入");
                    showAccount(acc);
            }
        }
    }

    /**
     * 销户账户
     *
     * @param acc      当前账户对象
     * @param sc       扫描器
     * @param accounts 全部账户的集合
     */
    private static boolean deleteAccount(Account acc, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("========================用户密码修改========================");
        System.out.println("您真的要销户吗？ y/n");
        String rs = sc.next();
        switch (rs) {
            case "y":
                // 真正的销户
                // 从当前账户集合中，删除当前账户对象，销户就完成了
                if (acc.getMoney() > 0) {
                    System.out.println("您的账户中还有余额，不能进行销户");
                } else {
                    accounts.remove(acc);
                    System.out.println("您的账户销户完成");
                    return true;
                }
                break;
            default:
                System.out.println("您的账户继续保留");
        }
        return false;
    }

    /**
     * 修改密码
     *
     * @param sc  扫描器
     * @param acc 当前登陆成功的账号对象
     */
    private static void updatePassword(Scanner sc, Account acc) {
        System.out.println("========================用户密码修改========================");
        while (true) {
            System.out.println("请您输入当前密码：");
            String passWord = sc.next();
            // 1、判断这个密码是否正确
            if (acc.getPassword().equals(passWord)) {
                while (true) {
                    // 密码正确
                    // 2、输入新密码
                    System.out.println("请您输入新密码：");
                    String newPssWord = sc.next();

                    System.out.println("请您确定新密码：");
                    String okPssWord = sc.next();

                    if (newPssWord.equals(okPssWord)) {
                        // 2次密码一致，可以修改了
                        acc.setPassword(newPssWord);
                        System.out.println("恭喜您，密码修改成功");
                        return;
                    } else {
                        System.out.println("您输入的2次密码不一致");
                    }
                }
            } else {
                System.out.println("您输入的密码不正确，请重新输入");
            }
        }
    }

    /**
     * 转账功能
     *
     * @param sc       扫描器
     * @param acc      自己的账户对象
     * @param accounts 全部账户的集合
     */
    private static void transferMoney(Scanner sc, Account acc, ArrayList<Account> accounts) {
        System.out.println("========================用户转账操作========================");
        // 1、判断是否足够2个用户
        if (accounts.size() < 2) {
            System.out.println("当前系统中，不足2个账户，不能进行转账，请去开户");
            return;
        }

        // 2、判断自己的账户是否有钱
        if (acc.getMoney() == 0) {
            System.out.println("对不起，您的账户余额为 0 ");
            return;
        }

        // 3、真正开始转账
        while (true) {
            System.out.println("请输入对方账户的卡号：");
            String cardId = sc.next();

            // 这个卡号不能是自己的卡号
            if (cardId.equals(acc.getCardId())) {
                System.out.println("对不起，您不可以给自己进行转账");
                continue;
            }

            // 判断这个卡号是否存在：根据这个卡号去查询对方账户对象
            Account account = getAccountByCarId(cardId, accounts);
            if (account == null) {
                System.out.println("对不起，您输入的这个账号不存在");
            } else {
                // 这个账户存在，继续认证他的姓氏
                String userName = account.getUserName();
                String tip = "*" + userName.substring(1);
                System.out.println("请您输入[ " + tip + " ]的姓氏");
                String preNmae = sc.next();

                //认证姓氏是否输入正确
                if (userName.startsWith(preNmae)) {
                    // 认证通过，真正开始转账了
                    while (true) {
                        System.out.println("请您输入转账金额：");
                        double money = sc.nextDouble();
                        //判断余额是否足够
                        if (money > acc.getMoney()) {
                            System.out.println("对不起，您的余额不足，您最多可以转账:" + acc.getMoney() + " 元");
                        } else {
                            // 余额足够，可以转了
                            acc.setMoney(acc.getMoney() - money);
                            account.setMoney(account.getMoney() + money);
                            System.out.println("转账成功！您的账户还剩余：" + acc.getMoney() + " 元");
                            return;  // 直接干掉转账方法
                        }
                    }
                } else {
                    System.out.println("对不起，您输入的信息有误");
                }
            }
        }


    }

    /**
     * 取钱功能
     *
     * @param acc 当前账户对象
     * @param sc  扫描器
     */
    private static void drawMoney(Account acc, Scanner sc) {
        System.out.println("========================用户取钱操作========================");
        // 1、判断余额是否足够100元
        if (acc.getMoney() < 100) {
            System.out.println("对不起，当前账户中余额不足100元，不能取钱，余额为：" + acc.getMoney());
            return;
        }
        // 2、提示用户输入取钱余额
        while (true) {
            System.out.println("请您输入取款余额");
            double money = sc.nextDouble();

            // 3、判断这个金额是否满足要求
            if (money > acc.getQuotaMoney()) {
                System.out.println("对不起，您当前取款金额超过每次限额，每次最多可取：" + acc.getQuotaMoney() + " 元");
            } else {
                // 没有超过每次限额
                // 4、判断是否超过了账户余额
                if (money > acc.getMoney()) {
                    System.out.println("余额不足，您账户目前总余额为：" + acc.getMoney() + " 元");
                } else {
                    // 可以取钱了
                    System.out.println("恭喜您，取钱：" + money + " 元成功");
                    // 更新余额
                    acc.setMoney(acc.getMoney() - money);
                    //取钱结束 展示账户信息
                    showAccount(acc);
                    return; // 直接干掉取消方法
                }
            }
        }
    }

    /**
     * 存钱
     *
     * @param acc 当前账户对象
     * @param sc  扫描器
     */
    private static void depostiMoney(Account acc, Scanner sc) {
        System.out.println("========================用户存钱操作========================");
        System.out.println("请您输入存款金额");
        double money = sc.nextDouble();

        // 更新账户余额：原来的钱 + 新存入的钱
        acc.setMoney(acc.getMoney() + money);
        System.out.println("恭喜您，存钱成功，当前账户信息如下");
        showAccount(acc);
    }

    /**
     * 展示账户信息
     *
     * @param acc
     */
    private static void showAccount(Account acc) {
        System.out.println("========================当前账户信息如下========================");
        System.out.println("卡号：" + acc.getCardId());
        System.out.println("户主：" + acc.getUserName());
        System.out.println("余额：" + acc.getMoney());
        System.out.println("限额：" + acc.getQuotaMoney());
    }

    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("========================系统开户操作========================");
        // 1、创建一个账户对象，用于后期封装账户信息
        Account account = new Account();

        // 2、录入当前这个账户的信息，注入到账户对象中去
        System.out.println("请输入您的账户名：");
        String userName = sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请您输入密码：");
            String passWord = sc.next();
            System.out.println("请您输入确认密码");
            String okPassWord = sc.next();
            if (okPassWord.equals(passWord)) {
                // 密码认证通过，可以注入给账户对象
                account.setPassword(okPassWord);
                break; // 注入账户对象成功，结束死循环
            } else {
                System.out.println("您的两次密码输入不正确，请重新输入");
            }
        }

        System.out.println("请输入账户当次限额：");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        // 为账户生成8位与其他账户不同的号码 （独立功能，独立方法）
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);

        // 3、把账户对象添加到账户集合中去
        accounts.add(account);
        System.out.println("恭喜您，" + userName + "先生/女士 开户成功" + "您的卡号是：" + cardId + " 请妥善保管");
    }

    /**
     * 为账户生成8位与其他账户卡号不同的号码
     *
     * @param accounts
     * @return
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
        Random r = new Random();
        while (true) {
            // 1、先生成8位数字
            String cardId = "";
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }
            // 2、判断这个8位卡号是否与其他账户的卡号重复了
            // 根据这个卡号去查询账户对象
            Account acc = getAccountByCarId(cardId, accounts);
            if (acc == null) {
                // 说明 cardId 此时没有重复，这个卡号是一个新卡号了，可以使用这个卡号作为新注册账户的卡号了
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询出一个账户对象来
     *
     * @param cardId   卡号
     * @param accounts 全部账户集合
     * @return 账户对象 / null
     */
    private static Account getAccountByCarId(String cardId, ArrayList<Account> accounts) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null; // 查无此账户
    }
}
