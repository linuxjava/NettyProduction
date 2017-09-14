package com.tencent.tvmanager.netty.msg;

/**
 * Created by robincxiao on 2017/8/23.
 */

public class Header {
    public static final byte PROTOCOL_VERSION = 1;

    /**
     * 消息类型
     */
    public class MsgType {
        public static final byte COMMOND = 1;//控制消息
        public static final byte PAYLOAD = 2;//透传消息

        public static final byte PING = 100;
        public static final byte PONG = 101;
        public static final byte ACK = 102;
        public static final byte EXCHANGE_KEY = 103;//交换key
        public static final byte EXCHANGE_KEY_RESP = 104;//交换key响应
        public static final byte CHECK_KEY = 105;//验证key
    }

    /**
     * 具体业务类型
     */
    public class BusynessType {
    }
}
