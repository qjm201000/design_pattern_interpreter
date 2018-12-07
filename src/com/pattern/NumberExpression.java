package com.pattern;

/**
 * 数字类
 */
public class NumberExpression implements AbstractExpression{
    private int number;
    public NumberExpression(int number){
        this.number = number;
    }

    @Override
    public int interptet() {
        return number;
    }
}
