package leet_0001_0020;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述：
 * 罗马数字转数字
 * I   1
 * V   5
 * X   10
 * L   50
 * C   100
 * D   500
 * M   1000
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 *
 * @author Jiang.YX
 * @version 1.0
 * @date 2019/10/30 17:49
 */
public class Leet0013_RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;
        int i = 0;
        while (i < s.length() - 1) {
            char pre = s.charAt(i);
            char post = s.charAt(i + 1);
            if (pre == 'I' && post == 'V') {
                result += 4;
                i += 2;
            } else if (pre == 'I' && post == 'X') {
                result += 9;
                i += 2;
            } else if (pre == 'X' && post == 'L') {
                result += 40;
                i += 2;
            } else if (pre == 'X' && post == 'C') {
                result += 90;
                i += 2;
            } else if (pre == 'C' && post == 'D') {
                result += 400;
                i += 2;
            } else if (pre == 'C' && post == 'M') {
                result += 900;
                i += 2;
            } else {
                result += map.get(pre);
                i++;
            }
        }
        if (i == s.length() - 1) {
            result += map.get(s.charAt(i));
        }
        return result;
    }

}
