package com.vincent.liteFlow;

import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;
@Slf4j
@SpringBootApplication
public class Application implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Resource
    private FlowExecutor flowExecutor;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 调用执行规则
        LiteflowResponse liteflowResponse = flowExecutor.execute2Resp("chain1", args);
        // 验证规则
//        boolean isValid = LiteFlowChainELBuilder.validate("THEN(a, b, h)");
        log.info("执行结果：{}",liteflowResponse);
    }
}