package com.vincent.liteFlow.node;

import com.yomahub.liteflow.core.NodeComponent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component("a")
@Slf4j
public class ACmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        Object requestData = this.getRequestData();
        log.error("---------------------------->a");
        log.info("a-->:id:{}, name: {}; {},{}", getNodeId(), getName(), getChainName(), getRequestData());
        // 设置是否结束流程
        this.setIsEnd(true);
    }
}
