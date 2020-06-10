package com.firstprogram.springhelloworld.controller;

import com.firstprogram.springhelloworld.impl.DemoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class Democontroller {

   // @Autowired   //It helps to use spring's dependency injection facilities
    private DemoImpl demoImpl;


//    public Democontroller(DemoImpl demoImpl){
//        System.out.println("Hiiiiiiiiiiiiiii");
//        this.demoImpl=demoImpl;
//    }

    @Autowired
    public void setDemoImpl(DemoImpl demoImpl) {
        this.demoImpl = demoImpl;
    }

    @GetMapping(value="/check")
    public String doSomething(){
        return demoImpl.getData();
    }
}
