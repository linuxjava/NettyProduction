package com.example.client.sample;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.support.multidex.MultiDex;

import com.netty.client.NettyClientService;

import xiao.framework.imageloader.ImageLoadTool;

/**
 * Created by robincxiao on 2017/8/30.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ImageLoadTool.getInstance().init(this);
        startService(new Intent(this, NettyClientService.class));
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
