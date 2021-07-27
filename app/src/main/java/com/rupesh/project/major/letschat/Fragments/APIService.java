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
                    "Authorization:key=AAAAzzvbKSM:APA91bF4-MlScdceLRYUDn1WkwrVf1bZ8WHY84j_fgxYAfHrDeZ_b-Uhu1mYk8a6YtWhexi8DlmMhjOLokmMDEIv7Pe0mTBJIdU5G2Woq_UgKT7O4uqLtGFXGqcSYZmci0TjKr-krMH_"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
