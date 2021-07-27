package com.rupesh.project.major.letschat.Fragments;


import com.rupesh.project.major.letschat.Notifications.MyResponse;
import com.rupesh.project.major.letschat.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=Tokan will be added here"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
