package com.xiaozh.basic.Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", value = " + entry.getValue());
        }

        for(Integer key : map.keySet()){

            System.out.println("Key: "+ key);
        }
        for(Integer value: map.values()){
            System.out.println("Value: "+ value);
        }

        //使用迭代器, 优点是可以在遍历时调用iterator.remove()来删除entries。
        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();

        while(entries.hasNext()){
            Map.Entry<Integer, Integer> entry = entries.next();
            System.out.println(entry.getKey() + " "+ entry.getValue());

        }
    }
}
