package 蓝桥大数据分析.集合;

import java.util.ArrayList;
import java.util.List;

public class TestSet{
    public static void main(String[] args){
        List list=new ArrayList();
        list.add("你是猪");
        list.add(18.99f);
        list.add("喵喵喵");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
