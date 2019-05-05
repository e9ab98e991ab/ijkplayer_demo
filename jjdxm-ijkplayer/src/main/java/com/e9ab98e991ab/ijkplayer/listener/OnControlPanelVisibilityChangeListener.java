package com.e9ab98e991ab.ijkplayer.listener;

/**
 * @author gaoxin 2019-05-05 14:37
 * @version V1.0.0
 * @name OnControlPanelVisibilityChangeListener
 * @mail godfeer@aliyun.com
 * @description  操作面板显示或者隐藏改变监听
 */
public interface OnControlPanelVisibilityChangeListener {

    /**true 为显示 false为隐藏*/
    void change(boolean isShowing);
}