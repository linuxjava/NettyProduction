package com.netty.client.handler;

import com.netty.client.core.threadpool.CallbackTask;
import com.netty.client.core.threadpool.ExecutorFactory;
import com.netty.client.core.threadpool.MessageRecvTask;
import com.netty.client.innermsg.CallbackMessage;
import com.netty.client.innermsg.Header;
import com.netty.client.innermsg.NettyMessage;
import com.netty.client.utils.L;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Created by robincxiao on 2017/8/23.
 */
@ChannelHandler.Sharable
public class MessageRecvHandler extends SimpleChannelInboundHandler<NettyMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, NettyMessage message) throws Exception {
        switch (message.msgType) {
            case Header.MsgType.PAYLOAD:
                ExecutorFactory.submitRecvTask(new MessageRecvTask(channelHandlerContext.channel(), message));
                break;
            case Header.MsgType.EXCHANGE_KEY_RESP: {
                CallbackMessage callbackMessage = new CallbackMessage();
                callbackMessage.type = CallbackMessage.MSG_TYPE_RECV_MSG;
                callbackMessage.recvMessage = message;
                ExecutorFactory.submitCallbackTask(new CallbackTask(callbackMessage));
            }
            break;
            case Header.MsgType.RESPONSE:
                switch (message.businessType) {
                    case Header.BusinessType.RESPONSE_APP_ADDED://安装APP
                    case Header.BusinessType.RESPONSE_APP_REMOVED://删除APP
                    case Header.BusinessType.RESPONSE_APP_LIST://已安装列表
                        CallbackMessage callbackMessage = new CallbackMessage();
                        callbackMessage.type = CallbackMessage.MSG_TYPE_RECV_MSG;
                        callbackMessage.recvMessage = message;
                        ExecutorFactory.submitCallbackTask(new CallbackTask(callbackMessage));
                        break;
                }
                break;
        }
    }
}