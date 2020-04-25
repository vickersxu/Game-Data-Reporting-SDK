package com.bs.vickers.data_sdk;

import android.os.Bundle;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;
import java.net.HttpURLConnection;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


public class MainActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public API initRequest(){
        //构建Retrofit实例
        Retrofit retrofit = new Retrofit.Builder()
                //设置网络请求BaseUrl地址
                .baseUrl("http://111.229.153.168:7777")
                //设置数据解析器
                .build();
        return retrofit.create(API.class);
    }

    public void aaa(String app_id,String app_name,String app_version,String device_id,String country,String sex,String first_day,String day,String hour){

        Call<ResponseBody> job = initRequest().aaa(app_id,app_name,app_version,device_id,country,sex,first_day,day,hour);
        job.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.code()== HttpURLConnection.HTTP_OK)
                {
//                        UnityPlayer.UnitySendMessage("Main Camera","toUnity",response.body().toString());
//                        Log.d(TAG, response.body().toString());
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
            }
        });
        UnityPlayer.UnitySendMessage("Main Camera","toUnity","调用成功1");
    }

    public void bbb(String app_id,String app_name,String app_version,String device_id,String country,String sex,String day,String time,String start_time,String end_time,String hour){

        Call<ResponseBody> job = initRequest().bbb(app_id,app_name,app_version,device_id,country,sex,day,time,start_time,end_time,hour);
        job.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.code()== HttpURLConnection.HTTP_OK)
                {
//                        UnityPlayer.UnitySendMessage("Main Camera","toUnity",response.body().toString());
//                        Log.d(TAG, response.body().toString());
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
            }
        });
        UnityPlayer.UnitySendMessage("Main Camera","toUnity","调用成功2");
    }

    public void ccc(String app_id,String app_name,String app_version,String device_id,String country,String sex,String day,String sort,String type,String position){

        Call<ResponseBody> job = initRequest().ccc(app_id,app_name,app_version,device_id,country,sex,day,sort,type,position);
        job.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.code()== HttpURLConnection.HTTP_OK)
                {
//                        UnityPlayer.UnitySendMessage("Main Camera","toUnity",response.body().toString());
//                        Log.d(TAG, response.body().toString());
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
            }
        });
        UnityPlayer.UnitySendMessage("Main Camera","toUnity","调用成功3");
    }




}
