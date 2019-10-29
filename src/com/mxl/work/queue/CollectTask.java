package com.mxl.work.queue;

public class CollectTask {
    private String target;
    private String type;
    private long timestamp;
    
    public CollectTask(final String target, final String type, final long timestamp) {
        this.target = target;
        this.type = type;
        this.timestamp = timestamp;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "CollectTask [target=" + target + ", type=" + type + ", timestamp="
                + timestamp + "]";
    }
    
    
}
