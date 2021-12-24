package leetcode.editor.cn.单例模式;

import leetcode.editor.cn.base.ListNode;
import lombok.val;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HungrySingleton {
    //类加载后就直接初始化
    private static final HungrySingleton instance = new HungrySingleton();
    //私有化构造器，防止类外部实例化
    private HungrySingleton(){}
    private static HungrySingleton getInstance(){
        return instance;
    }
}
