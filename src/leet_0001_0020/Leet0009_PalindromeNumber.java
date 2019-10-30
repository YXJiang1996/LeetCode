package leet_0001_0020;

/**
 * 题目描述：
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/10/30 17:43
 */
public class Leet0009_PalindromeNumber {
    public boolean isPalindrome(int x){
        String str=String.valueOf(x);
        StringBuilder sb=new StringBuilder(str);
        String newStr=sb.reverse().toString();
        if(str.equals(newStr)){
            return true;
        }else{
            return false;
        }
    }
}
