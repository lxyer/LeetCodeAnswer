package emo.generic;

public class Gen2<K, V> {
    K k;
    V v;

    public Gen2(K k, V v) {
        this.k = k;
        this.v = v;
    }

    void showType() {
        System.out.println("Type of K is " + k.getClass().getName() + ",Type of V is " + v.getClass().getName());
    }
}
