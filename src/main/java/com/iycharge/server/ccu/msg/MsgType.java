package com.iycharge.server.ccu.msg;

/**
 * 帧类型标识定义
 * @author bwang
 */
public interface MsgType {
    
    /**
     * 充电桩登录辨识报文 (充电桩—运营平台)
     */
    short _0X_01 = 0x01;
    
    /**
     * 时间同步报文 (运营平台—充电桩) 
     */
    short _0X_02 = 0x02;
    
    /**
     * 充电桩应答时间同步报文 (充电桩—运营平台) 
     */
    short _0X_03 = 0x03;
    
    /**
     * 运营平台下収费率设置 (运营平台—充电桩) 
     */
    short _0X_10 = 0x10;
    
    /**
     * 充电桩应答费率设置 (充电桩—运营平台)
     */
    short _0X_11 = 0x11;
    
    /**
     * 运营平台下収远程参数设置 (运营平台—充电桩)
     */
    short _0X_12 = 0x12;
    
    /**
     * 充电桩应答远程参数设置 (充电桩—运营平台) 
     */
    short _0X_13 = 0x13;
    
    /**
     * 设置充电桩周期上传报文上报周期 (运营平台—充电桩)
     */
    short _0X_14 = 0x14;
    
    /**
     * 应答设置充电桩周期上传报文上报周期 (充电桩—运营平台) 
     */
    short _0X_15 = 0x15;
    
    /**
     * 充电桩实时数据 (充电桩—运营平台) 
     */
    short _0X_40 = 0x40;
    
    /**
     * 运营平台应答充电桩实时数据 (运营平台—充电桩) 
     */
    short _0X_41 = 0x41;
    
    /**
     * 充电桩充电实时数据 (充电桩—运营平台)
     */
    short _0X_42 = 0x42;
    
    /**
     * 运营平台下収认证报文 (运营平台—充电桩) 
     */
    short _0X_50 = 0x50;
    
    /**
     * 充电桩应答认证报文 (充电桩—运营平台)
     */
    short _0X_51 = 0x51;  
    
    /**
     * 充电桩上传用户信息认证报文 (充电桩—运营平台) 
     */
    short _0X_52 = 0x52;
    
    /**
     * 运营平台应答用户信息认证报文 (运营平台—充电桩)
     */
    short _0X_53 = 0x53;  
    
    /**
     * 运营平台远程控制充电桩启动 (运营平台—充电桩)
     */
    short _0X_54 = 0x54;  
    
    /**
     * 充电桩应答运营平台远程控制启动  (充电桩-运营平台)
     */
    short _0X_55 = 0x55;  
    
    /**
     * 运营平台远程控制充电桩停机 (运营平台—充电桩)
     */
    short _0X_56 = 0x56;  
    
    /**
     * 充电桩应答运营平台远程控制停机  (充电桩-运营平台)
     */
    short _0X_57 = 0x57;  
    
    /**
     * 充电桩启动事件 (充电桩—运营平台) 
     */
    short _0X_60 = 0x60;
    
    /**
     * 运营平台应答启劢事件 (运营平台—充电桩) 
     */
    short _0X_61 = 0x61; 
    
    /**
     * 充电桩停机事件 (充电桩—运营平台) 
     */
    short _0X_62 = 0x62;
    
    /**
     * 运营平台应答停机事件(运营平台—充电桩)
     */
    short _0X_63 = 0x63;
    
    /**
     * 充电记录上传 (充电桩—运营平台) 
     */
    short _0X_64 = 0x64;
    
    /**
     * 充电记录应答 (运营平台—充电桩) 
     */
    short _0X_65 = 0x65;
    
    /**
     * 告警事件 (充电桩—运营平台)
     */
    short _0X_66 = 0x66;
    
    /**
     * 告警事件应答 (运营平台—充电桩)
     */
    short _0X_67 = 0x67;
    
    /**
     * BMS 信息 (充电桩—运营平台) 
     */
    short _0X_80 = 0x80;
    
    /**
     * 电池参数信息 (充电桩—运营平台) 
     */
    short _0X_81 = 0x81; 
    
    /**
     * 电池电压数据 (充电桩—运营平台)
     */
    short _0X_82 = 0x82;
    
    /**
     * 电池温度数据 (充电桩—运营平台)
     */
    short _0X_83 = 0x83;
    
    /**
     * BMS 中止充电报文 (充电桩—运营平台)
     */
    short _0X_84 = 0x84;
    
    /**
     * BMS 统计数据 (充电桩—运营平台)
     */
    short _0X_85 = 0x85;
    
    /**
     * BMS 错误报文  充电桩—运营平台
     */
    short _0X_86 = 0x86;
}
