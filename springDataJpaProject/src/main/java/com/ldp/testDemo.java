package com.ldp;

import org.springframework.util.Assert;

import java.util.Scanner;

/**
 * @author T-liudp
 * @create 2022-06-06 20:35
 * 编写一个程序，录入两个纯数字构成的字符串s1,s2把s1,s2转换成整数a1,a2,并计算出s=a1+a2,
 * 输出s并用try catch来捕捉字符串转换成整数出现的错误，处理方法为输出 "无法转换成整数"+e.getMessage()
 */
public class testDemo {
    public static void main(String[] args) throws Exception {
        try {
            //首先定义一个输入对象
            Scanner scan =new Scanner(System.in);
            System.out.println("请输入你的分数：");
            Integer grade=scan.nextInt();
            Assert.isTrue(grade>=0&&grade<=100,"你的成绩无效");
            if (grade>=60){
                System.out.println("成绩及格");
            }else{
                System.out.println("你的成绩无效");
            }
            //关闭输入流
            scan.close();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw new ArithmeticException("无法转换成整数"+e.getMessage());
        }
    }
}

