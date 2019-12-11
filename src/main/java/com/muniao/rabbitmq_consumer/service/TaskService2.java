package com.muniao.rabbitmq_consumer.service;

import com.muniao.rabbitmqdemo.annotation.TaskCode;
import com.muniao.rabbitmqdemo.vo.TaskRequest;
import com.muniao.rabbitmqdemo.vo.TaskResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import service.TaskExecutor;

@Service
@TaskCode({"T0021","T0022"})
@Slf4j
public class TaskService2 implements TaskExecutor
{
    @Override
    public TaskResponse execute(TaskRequest taskRequest)
    {
        log.info("TaskService2:"+taskRequest.toString());
        try
        {
            log.info("thread id:"+Thread.currentThread().getId());
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        TaskResponse taskResponse = new TaskResponse("1","success");
        return taskResponse;
    }
}
