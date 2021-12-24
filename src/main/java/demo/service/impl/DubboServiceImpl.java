package demo.service.impl;

import com.google.common.util.concurrent.RateLimiter;
import demo.service.DubboService;

public class DubboServiceImpl implements DubboService {
    @Override
    public String echoed(String str) {
        RateLimiter rateLimiter = RateLimiter.create(5.0);
        return "I hear " + str;
    }

}
