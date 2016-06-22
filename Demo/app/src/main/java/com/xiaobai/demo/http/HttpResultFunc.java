package com.xiaobai.demo.http;

import com.xiaobai.demo.entity.HttpResult;

import rx.functions.Func1;

/**
 * Created by xiaobai on 16/6/22.
 */
public class HttpResultFunc<T> implements Func1<HttpResult<T>, T> {


    @Override
    public T call(HttpResult<T> httpResult) {
        if (httpResult.getCount() == 0) {
            throw new ApiException(100);
        }
        return httpResult.getSubjects();
    }

}
