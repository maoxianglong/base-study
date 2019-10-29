package com.mxl.work.queue;

public class TaskFactory {
    public static CollectTask makeTask(final String target, final String type, final long timestamp) {
        return new CollectTask(target, type, timestamp);
    }
}
