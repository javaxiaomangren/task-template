package com.amap.task.taskMgr;

import com.amap.task.beans.Task;

import java.util.List;

/**
 * 获取任务
 * Created by yang.hua on 14-3-31.
 */
public interface TaskProducer {

    public List<Task> getTasks();

}
