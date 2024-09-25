package com.sp_lib.com;

import android.app.Activity;
import android.content.Context;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.plugin.common.MethodChannel;

//import io.flutter.embedding.android.FlutterActivity;


public class SalesPanda {

    FlutterActivity flutterActivity;
    private Context context;
    public SalesPanda(Context context) {
        this.context = context;
    }

    public void callFlutterActivity(){
         context.startActivity(FlutterActivity.withNewEngine().build(context));
    }

}
