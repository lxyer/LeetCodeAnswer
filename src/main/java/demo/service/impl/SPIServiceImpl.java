package demo.service.impl;

import demo.service.SPIService;

public class SPIServiceImpl implements SPIService {
    @Override
    public void execute() {
        System.out.println("execute success!");
    }
}
