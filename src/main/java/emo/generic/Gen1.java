package emo.generic;

public class Gen1<T> {
    T t;

    Gen1(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    void showTInfo() {
        System.out.println("Type of T is " + t.getClass().getName());
    }
}
