package demo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lxyer
 */
@Slf4j
public class ShutdownHook {
    public static void main(String[] args) {
        log.info("start");
        //类似于 Golang 中的 deffer 函数.主要的功能就是在 jvm 销毁前需要执行的一个线程,这个线程的逻辑需要自己去实现
        Runtime.getRuntime().addShutdownHook(new Thread(() -> log.info("hook")));
        log.info("end");
    }


}
