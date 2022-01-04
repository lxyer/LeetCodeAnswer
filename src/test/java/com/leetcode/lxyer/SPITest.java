package com.leetcode.lxyer;

import demo.service.SPIService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.misc.Service;

import java.util.Iterator;
import java.util.ServiceLoader;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SPITest {
    @Test
    public void spi() {
        Iterator<SPIService> providers = Service.providers(SPIService.class);
        ServiceLoader<SPIService> load = ServiceLoader.load(SPIService.class);
        while (providers.hasNext()) {
            SPIService next = providers.next();
            next.execute();
        }
    }
}
