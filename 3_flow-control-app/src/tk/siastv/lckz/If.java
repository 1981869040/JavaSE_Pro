package tk.siastv.lckz;

public class If {
    public static void main(String[] args) {
        //需求：心跳（60 - 100）之间是正常的，否则系统提示进一步检测
        //格式1：if(条件表达式）{代码...}
        int xintiao = 90;
        if (xintiao < 60 || xintiao > 100) {
            System.out.println("您的心跳是：" + xintiao + "，您可能需要进一步检测");
        }
        System.out.println("检查结束");

        //格式2：if(条件表达式）{代码...} else{代码...}
        //需求：发红包
        int hongbao = 5000;
        if (hongbao >= 12000) {
            System.out.println("您的红包余额为：" + hongbao + " 成功发送红包");
        } else {
            System.out.println("您的红包余额不够");
        }

        //格式3：if(条件表达式){代码...} else if{代码...} else{代码...}
        // 需求：绩效系统 0-60 C 60-80 B 80-90 A 90-100 A+
        int jixiao = 999;
        if (jixiao >= 0 && jixiao < 60) {
            System.out.println("您的绩效为：C");
        } else if (jixiao >= 60 && jixiao < 80) {
            System.out.println("您的绩效为：B");
        } else if (jixiao >= 80 && jixiao < 90) {
            System.out.println("您的绩效为：A");
        } else if (jixiao >= 90 && jixiao <= 100) {
            System.out.println("您的绩效为：A+");
        }else {
            System.out.println("您录入的绩效有误");
        }
    }
}
