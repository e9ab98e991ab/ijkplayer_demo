package com.e9ab98e991ab.ijkplayer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.e9ab98e991ab.ijkplayer.R;
import com.e9ab98e991ab.ijkplayer.bean.VideoijkBean;

import java.util.List;
/**
 * @author gaoxin 2019-05-05 14:34
 * @version V1.0.0
 * @name StreamSelectAdapter
 * @mail godfeer@aliyun.com
 * @description  用来适配不同分辨率的流（流畅、标清、高清、720P）
 */
public class StreamSelectAdapter extends BaseAdapter {

    /**
     * 上下文
     */
    private Context mContext;
    /**
     * 布局填充对象
     */
    private LayoutInflater layoutInflater;
    /**
     * 不同分辨率播放地址集合
     */
    private List<VideoijkBean> listVideos;

    public StreamSelectAdapter(Context context, List<VideoijkBean> list) {
        this.mContext = context;
        this.listVideos = list;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return listVideos.size();
    }
    @Override
    public Object getItem(int position) {
        return listVideos.get(position);
    }
    @Override
    public long getItemId(int position) {
        return (long) position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = this.layoutInflater.inflate(R.layout.simple_player_list_item, (ViewGroup) null);
            holder = new ViewHolder();
            holder.streamName = (TextView) convertView.findViewById(R.id.simple_player_stream_name);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        VideoijkBean mVideoijkBean = listVideos.get(position);
        String streamName = mVideoijkBean.getStream();
        holder.streamName.setText(streamName);
        if (mVideoijkBean.isSelect()) {
            holder.streamName.setTextColor(mContext.getResources().getColor(R.color.simple_player_stream_name_playing));
        } else {
            holder.streamName.setTextColor(mContext.getResources().getColor(R.color.simple_player_stream_name_normal));
        }
        return convertView;
    }

    class ViewHolder {
        public TextView streamName;

        ViewHolder() {
        }
    }
}