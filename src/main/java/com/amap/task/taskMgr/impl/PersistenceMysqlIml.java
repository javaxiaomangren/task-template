package com.amap.task.taskMgr.impl;

import com.amap.task.beans.Task;
import com.amap.task.taskMgr.Persistence;

import java.util.List;
import java.util.Map;

/**
 * Created by yang.hua on 14-4-1.
 */
public class PersistenceMysqlIml implements Persistence {
    @Override
    public Task getTask(String id) {
        return null;
    }

    @Override
    public List<Task> getTasks(int limit) {
        return null;
    }

    @Override
    public void save(List<Map<String, Object>> param, Task task) {

    }

    @Override
    public void assignTask(Task task) {

    }
}
