package com.pattern;

public class Main {
    public static void main(String[] args) {
        Context context = new Context("22 + 33 + 44");
        int result = context.calculate();//计算结果
        System.out.println("计算结果："+result);
    }
}
