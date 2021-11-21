package leetcode.editor.cn.单例模式;

public class HungrySingleton {
    //类加载后就直接初始化
    private static final HungrySingleton instance = new HungrySingleton();
    //私有化构造器，防止类外部实例化
    private HungrySingleton(){}
    private static HungrySingleton getInstance(){
        return instance;
    }
}
