package com.amap.task.taskMgr.impl;

import com.amap.task.beans.Task;
import com.amap.task.taskMgr.TaskHandler;

/**
 * Created by yang.hua on 14-4-1.
 */
public class TaskHandlerImpl implements TaskHandler {


    @Override
    public void handle(Task task) {
        System.out.println(task.toString());
    }
}
