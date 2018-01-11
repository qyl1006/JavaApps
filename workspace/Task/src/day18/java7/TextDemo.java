package day18.java7;
/*
 * 自动关闭资源新特性:  java7之前需要手动finally--->try--catch 关闭资源 很重复
 * 						java7后 只需要在try代码块 括号->放实现java.lang.AutoCloseable接口的资源
 * 										catch后JVM自动关闭相关资源
 * 
 * 
 * 增强的throw java7处理抛出更精确,方便调用者能够精确定位问题的所在,而不是在一个大的异常类中排查
 * 
 *多异常捕捉    --> 就是单个try--catch中catch括号中可以放多个不同的异常类(父类子类可以一起上)
 *
 * 最后总结:  异常-->对于代码编写者--1)可以抛出返回throw异常 或 直接告诉调用者代码有问题需要处理throws 也可以直接处理try--catch
 * 						调用者 ----->1)try--catch捕捉处理 --throw在抛    或 抛出去throws
 * 					RuntimeException可处理不处理  非RuntimeException类必须处理   
 * 					
 */
public class TextDemo {

}
