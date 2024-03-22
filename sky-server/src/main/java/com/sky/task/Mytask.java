package com.sky.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 自定义的定时任务类
 */
@Component
@Slf4j
public class Mytask {

    /**
     * 定时任务，定时任务的逻辑在这里写
     */
    //@Scheduled(cron = "0/5 * * * *  ?")
    public void executeTask(){
        log.info("定时任务开始执行：{}", new Date());
    }
}