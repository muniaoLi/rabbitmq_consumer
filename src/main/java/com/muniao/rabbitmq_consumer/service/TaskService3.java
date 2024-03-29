package com.muniao.rabbitmq_consumer.service;

import com.muniao.rabbitmqdemo.annotation.TaskCode;
import com.muniao.rabbitmqdemo.vo.TaskRequest;
import com.muniao.rabbitmqdemo.vo.TaskResponse;
import org.springframework.stereotype.Service;
import service.TaskExecutor;

@Service
@TaskCode("T003")
public class TaskService3 implements TaskExecutor
{
    @Override
    public TaskResponse execute(TaskRequest taskRequest)
    {
        System.out.println("TaskService3:"+taskRequest.toString());
        TaskResponse taskResponse = new TaskResponse("1","success");
        return taskResponse;
    }
}
