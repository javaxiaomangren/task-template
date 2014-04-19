package com.amap.task.taskMgr.impl;

import com.amap.task.beans.Task;
import com.amap.task.taskMgr.TaskProducer;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 *
 * Created by yang.hua on 14-4-1.
 */
public class TaskProducerImpl implements TaskProducer {
    @Override
    public List<Task> getTasks() {
        Task t = new Task() ;
        t.setId("1111");
        return ImmutableList.of(t);
    }

}
