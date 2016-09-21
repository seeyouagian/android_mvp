package com.xiaobai.demo.http.apiservice;

import com.xiaobai.demo.model.HttpRespone;
import com.xiaobai.demo.model.UserInfo;

import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by xiaobai on 16/7/5.
 */
public interface LoginService {

    @POST
    Observable<HttpRespone<UserInfo>> login(@Body Map<String,String> map);

}
