package com.example.administrator.networkrequest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zhy.http.okhttp.OkHttpUtils;

public class MainActivity extends AppCompatActivity {

    Info info;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        tv = (TextView) findViewById(R.id.tv);
        String url = "https://api.yogamala.cn/styles";
        OkHttpUtils
                .get()
                .url(url)
//                .addHeader("token", token)
                .addParams("page", "2")
                .build()
                .execute(new MyCallBack(new Info()) {
                    @Override
                    public void onError(okhttp3.Call call, Exception e) {
                    }

                    @Override
                    public void onResponse(Object response) {
                        info =(Info)response;
                        tv.setText(info.getMsg());
                    }
                });


//data装着转成json的数组,上传数组
//        RecordPlay recordPlay = new RecordPlay();
//        List<RecordPlay.DataBean> beanListEnd = new ArrayList<>();
//        RecordPlay.DataBean dataEnd = new RecordPlay.DataBean();
//        for(int i=0;i<10;i++){
//            dataEnd.setId(""+i);
//            beanListEnd.add(dataEnd);
//        }
//        recordPlay.setData(beanListEnd);
//        OkHttpUtils
//                .post()
//                .url("https://api.yogamala.cn/history")
////                .addHeader("token", token)
//                .addParams("data", new Gson().toJson(recordPlay))
//                .build()
//                .execute(new MyCallBack(new Info()) {
//                    @Override
//                    public void onError(okhttp3.Call call, Exception e) {
//
//                    }
//
//                    @Override
//                    public void onResponse(Object response) {
//                        Info msgOrCode = (Info) response;
//                    }
//                });
    }
}
