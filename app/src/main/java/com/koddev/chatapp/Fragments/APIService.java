package com.koddev.chatapp.Fragments;

import com.koddev.chatapp.Notifications.MyResponse;
import com.koddev.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAASJEgviE:APA91bGoWvxxRGibkAB_-v5feW_JoC7SnPYXy1CCy7NUuDkXXgVelWzbQngea2bV23Z5NxxbLlu-bjxtu53vbD0hJbS9OqVC9blHZ8DZn9swAo1oCpzMaSTI2PBCTbHxIXVAJzafZ1Og"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
