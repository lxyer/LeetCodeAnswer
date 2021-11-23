package leetcode.editor.cn.单例模式;

public class LazySingleton {
    //volatile 保障在所用线程中同步
    private static volatile LazySingleton instance = null;

    
    //private 防止类在外面被实例化
    private LazySingleton(){}
    public static synchronized LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
