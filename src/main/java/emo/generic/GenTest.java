package emo.generic;

/**
 * @author lxyer
 */
public class GenTest {


    public static void main(String[] args) {
        Gen1<Integer> integerGen1 = new Gen1<>(22);
        integerGen1.showTInfo();
        Gen1<String> lxyer = new Gen1<>("lxyer");
        lxyer.showTInfo();
        Gen2<Integer, String> gen2 = new Gen2<>(2, "lxyer");
        gen2.showType();
    }
}
