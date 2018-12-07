package com.pattern;

import java.util.Stack;

/**
 * 上下文，解释器
 *
 */
public class Context {
    Stack<AbstractExpression> stack = new Stack<AbstractExpression>();
    public Context(String str){
        String strs[] = str.split(" ");
        for(int i=0;i<strs.length;i++){
            switch (strs[i]){
                case "+":
                    AbstractExpression number1 = stack.pop();
                    AbstractExpression number2 = new NumberExpression(Integer.parseInt(strs[++i]));
                    stack.push(new AddExpression(number1,number2));
                    break;
                default:
                    stack.push(new NumberExpression(Integer.parseInt(strs[i])));
                    break;
            }
        }
    }

    public int calculate(){
        return stack.pop().interptet();//计算结果
    }
}
