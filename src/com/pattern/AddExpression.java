package com.pattern;

/**
 * 运算类
 */
public class AddExpression implements AbstractExpression{
    private AbstractExpression expression1;
    private AbstractExpression expression2;
    public AddExpression(AbstractExpression expression1,AbstractExpression expression2){
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public int interptet() {
        return expression1.interptet() + expression2.interptet();
    }
}
