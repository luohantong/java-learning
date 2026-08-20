package com.lht.Day05;

public class Account {
    private String accountId;
    private double balance;

    //构造方法
    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }
    /**
     * 存款方法
     * @param money 存入的金额
     */
    public void deposit(double money){
        if(money <= 0){
            System.out.println("输入金额必须大于0！");
            return;
        }
        balance = balance + money;
        System.out.println("成功存入：" + money + "元");
    }

    /**
     * @param money 取款金额
     */
    public void withdraw(double money){
        if(money <= 0){
            System.out.println("取款金额必须大于0！");
            return;
        }
        if(money >= balance){
            System.out.println("取款失败！余额不足，当前余额：" + balance);
            return;
        }
        balance = balance - money;
        System.out.println("成功取出：" + money + "元");
    }

    /**
     * 查询余额
     * @return 返回当前余额
     */
    public double getBalance(){
        return balance;
    }

    //main方法测试
    public static void main(String[] args) {
        // =========对象：按照图纸new出来的实物=========
        // 创建第一个账户对象
        Account acc1 = new Account("6222001", 1000.0);
        // 创建第二个账户对象，两个对象互相独立，互不干扰
        Account acc2 = new Account("6222002", 500.0);

        System.out.println("====账户1操作====");
        acc1.deposit(500);   //存款
        acc1.withdraw(200);  //取款
        System.out.println("账户1当前余额：" + acc1.getBalance());

        System.out.println("====账户2操作====");
        acc2.deposit(300);
        acc2.withdraw(100);
        System.out.println("账户2当前余额：" + acc2.getBalance());
    }
}
