package com.bs.vickers.data_sdk;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {

//    @GET("http://icanhazip.com/")
//    Call<ResponseBody> getIp();

    @GET("/sdk/basic")
    Call<ResponseBody> aaa(@Query("app_id") String app_id,@Query("app_name") String app_name,@Query("app_version") String app_version,@Query("device_id") String device_id,@Query("country") String country,@Query("sex") String sex,@Query("first_day") String first_day,@Query("day") String day,@Query("hour") String hour);

    @GET("/sdk/playtime")
    Call<ResponseBody> bbb(@Query("app_id") String app_id,@Query("app_name") String app_name,@Query("app_version") String app_version,@Query("device_id") String device_id,@Query("country") String country,@Query("sex") String sex,@Query("day") String day,@Query("time") String time,@Query("start_time") String start_time,@Query("end_time") String end_time,@Query("hour") String hour);

    @GET("/sdk/event")
    Call<ResponseBody> ccc(@Query("app_id") String app_id,@Query("app_name") String app_name,@Query("app_version") String app_version,@Query("device_id") String device_id,@Query("country") String country,@Query("sex") String sex,@Query("day") String day,@Query("sort") String sort,@Query("type") String type,@Query("position") String first_day);


//    @GET("http://icanhazip.com/")
//    Call<ResponseBody> device_id();





}
