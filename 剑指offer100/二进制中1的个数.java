package 剑指offer100;

import java.util.Arrays;

public class 二进制中1的个数 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(-3));
        //左移和右移
        /*int res = (1 << 0);
        System.out.println(res);*/
        /*String res = Integer.toBinaryString(-3);
        System.out.println(res);
        System.out.println(Integer.toBinaryString(0));*/

    }
    public static int hammingWeight(int n) {
        int resCount = 0;
        //位运算
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0){
                resCount++;
            }
        }
       /* while (n != 0){
            if (n % 2 == 1){
                resCount++;
                n = n-1;
            }else {
                n = n/2;
            }
        }*/
        return resCount;
    }
}
