package com.example.administrator.networkrequest;

import java.util.List;

/**
 * Created by Administrator on 2016/9/13 0013.
 */
public class RecordPlay {
    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }
    public static class DataBean {
        private String id;  //视频id
        private String type; //模块分类
        private String category;//模块分类
        private String seekpositions ;//当前(播放)时间
        private String remain_time;//剩余时间
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getSeekpositions() {
            return seekpositions;
        }

        public void setSeekpositions(String seekpositions) {
            this.seekpositions = seekpositions;
        }

        public String getRemain_time() {
            return remain_time;
        }

        public void setRemain_time(String remain_time) {
            this.remain_time = remain_time;
        }
    }
}
