package com.e9ab98e991ab.ijkplayer.listener;

import android.widget.ImageView;

/**
 * @author gaoxin 2019-05-05 14:37
 * @version V1.0.0
 * @name OnShowThumbnailListener
 * @mail godfeer@aliyun.com
 * @description  显示视频缩列图监听
 */
public interface OnShowThumbnailListener {

    /**回传封面的view，让用户自主设置*/
    void onShowThumbnail(ImageView ivThumbnail);
}