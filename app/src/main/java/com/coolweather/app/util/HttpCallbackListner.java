package com.coolweather.app.util;

/**
 * Created by lileyang on 2016/3/14.
 */
public interface HttpCallbackListner {

    void onFinish(String s);

    void onError(Exception e);
}
