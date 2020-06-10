package com.firstprogram.springhelloworld.impl;

import com.firstprogram.springhelloworld.interfaces.DemoInterface;
import org.springframework.stereotype.Component;

@Component
public class DemoImpl implements DemoInterface {

    @Override
    public String getData() {
        return "Hello Spring Demo";
    }
}
