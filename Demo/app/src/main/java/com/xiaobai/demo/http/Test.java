package com.xiaobai.demo.http;

import com.xiaobai.demo.entity.Subject;
import com.xiaobai.demo.utils.RxUtils;

import java.util.List;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by xiaobai on 16/6/22.
 */
public class Test {



    private MovieService movieService;

    public Test(MovieService movieService){
        this.movieService = movieService;
    }

    /**
     * 用于获取豆瓣电影Top250的数据
     * @param subscriber  由调用者传过来的观察者对象
     * @param start 起始位置
     * @param count 获取长度
     */
    public void getTopMovie(Subscriber<List<Subject>> subscriber, int start, int count){

//        movieService.getTopMovie(start, count)
//                .map(new HttpResultFunc<List<Subject>>())
//                .subscribeOn(Schedulers.io())
//                .unsubscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(subscriber);

        Observable observable = movieService.getTopMovie(start, count)
                .map(new HttpResultFunc<List<Subject>>());

        //toSubscribe(observable, subscriber);
        observable.compose(RxUtils.applyAsySchedulers()).subscribe(subscriber);
    }
}
