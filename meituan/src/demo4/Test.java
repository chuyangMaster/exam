package demo4;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        String str = "12312sadbs";
        char[] chars = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = chars[i];
        }

        int max = arr[0];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(max <= arr[i]){
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(max == arr[i]){
                list.add(i);
            }
        }

        System.out.println("数组最大值元素是：" + max);
        System.out.println("最大值元素的下表是" + list.toString());
    }
}
