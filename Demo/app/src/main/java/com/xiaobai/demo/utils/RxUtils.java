package com.xiaobai.demo.utils;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by xiaobai on 16/6/22.
 */
public class RxUtils {

    /**
     * 线程切换
     * @param <T>
     * @return
     */
    public static <T> Observable.Transformer<T, T> applyAsySchedulers() {
        return new Observable.Transformer<T, T>() {
            @Override
            public Observable<T> call(Observable<T> observable) {
                return observable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

}
