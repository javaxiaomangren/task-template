package com.amap.task;

import com.amap.task.executor.TaskExecution;
import com.amap.task.taskMgr.impl.TaskHandlerImpl;
import com.amap.task.taskMgr.impl.TaskProducerImpl;
import com.amap.task.utils.SimpleMailSender;
import com.amap.task.utils.Utils;

/**
 * Main Class
 * Created by yang.hua on 14-4-1.
 */
public class Main {
    public static void main(String[] args) {
        try {
            new TaskExecution(new TaskProducerImpl(), new TaskHandlerImpl()).activate();
        } catch (Exception e) {
            e.printStackTrace();
            SimpleMailSender.notify(e.getMessage(), Utils.getStackTrace(e.getStackTrace()));
        }
    }
}
