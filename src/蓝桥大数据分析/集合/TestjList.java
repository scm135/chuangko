package 蓝桥大数据分析.集合;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestjList {
    public static void main(String[] args){
        Set set=new HashSet();
        set.add("你是猪");
        set.add("只会嘟嘟嘟");
        set.add("你是猪");
        Iterator iterator=set.iterator();//用一个迭代器来完成循环输出
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //循环的条件是还有下一个可以读到
        }
    }
}
