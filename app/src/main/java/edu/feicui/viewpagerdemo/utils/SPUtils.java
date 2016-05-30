package edu.feicui.viewpagerdemo.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 一个包含保存和获取数据方法的类
 */
public class SPUtils {
    private static SharedPreferences mPreferences;
    private static final String NAME="ViewPager";

    public static void putBoolen(Context context,String key,boolean value){
        SharedPreferences sp = getPreferences(context);
        SharedPreferences.Editor editor=sp.edit();
        editor.putBoolean(key,value);
        editor.apply();
    }

    private static SharedPreferences getPreferences(Context context) {
        if(mPreferences==null){
            mPreferences=context.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        }
        return mPreferences;
    }
    public static boolean getBoolen(Context context,String key){
        return getBoolen(context,key, false);
    }

    private static boolean getBoolen(Context context, String key, boolean defvalue) {
        SharedPreferences sp=getPreferences(context);
        return sp.getBoolean(key,defvalue);
    }
}
