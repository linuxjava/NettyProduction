package com.netty.server;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(this, NettyServerService.class));
    }

    public void onCloseServer(View view){
        NettyServerService.mServerAcceptor.shutdownGracefully();
    }
}
