package com.vincent.cont.controller;

import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.concurrent.Callable;
import java.util.logging.Logger;

/**
 * 保单处理逻辑，自动生成数据
 */
public class ContController {
    public void demo(){
        //设置 3s超时
        WebAsyncTask<String> webAsyncTask = new WebAsyncTask<>(3000, () -> {
            System.out.println(Thread.currentThread().getName()+"进入 call方法");
            // 这里设置调用调用方法
            return "call test";
        });
        System.out.println(Thread.currentThread().getName()+"进入 call方法");
        webAsyncTask.onCompletion(()->{
            System.out.println(Thread.currentThread().getName()+"进入 call方法");
        });
        webAsyncTask.onTimeout(()-> "请求超时");
    }
}
