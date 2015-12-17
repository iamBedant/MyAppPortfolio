package com.example.bebi2.myappportfolio;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by bebi2 on 12/17/2015.
 */
public class DisplayToast {
    public static void DisplayLongToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
    public static void DisplayShortToast(Context context, String message){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
    }
}
