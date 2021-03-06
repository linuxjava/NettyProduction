package com.netty.client.core.threadpool;


import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by xiaoguochang on 2017/8/26.
 */

public class NamedThreadFactory implements ThreadFactory{
    private final boolean daemoThread;
    private final String prefix;
    private ThreadGroup threadGroup;
    private final AtomicInteger threadNum = new AtomicInteger();

    public NamedThreadFactory(String prefix, boolean daemo){
        this.daemoThread = daemo;
        this.prefix = prefix;
        SecurityManager s = System.getSecurityManager();
        threadGroup = (s == null) ? Thread.currentThread().getThreadGroup() : s.getThreadGroup();
    }

    @Override
    public Thread newThread(Runnable r) {
        StringBuilder builder = new StringBuilder();
        builder.append(prefix).append("-").append(threadNum.getAndDecrement());
        Thread thread = new Thread(threadGroup, r, builder.toString(), 0);
        if(daemoThread){
            thread.setDaemon(true);
        }
        return thread;
    }
}
