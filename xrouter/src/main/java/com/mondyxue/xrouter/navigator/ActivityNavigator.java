package com.mondyxue.xrouter.navigator;

import android.content.Intent;
import android.net.Uri;

import com.mondyxue.xrouter.callback.RouteCallback;

/**
 * <br>Created by MondyXue
 * <br>E-MAIL: mondyxue@gmial.com
 */
public interface ActivityNavigator<T>{

    void startActivity();
    void startActivityForResult(RouteCallback<T> callback);

    Uri uri();
    Intent intent();

}
