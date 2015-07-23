package com.firstcase.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 对SharePreference的封装
 * 
 * @author Kevin
 * 
 */
public class PrefUtils {
	/**
	 * 存和取布尔值
	 * @param key
	 * @param value
	 * @param ctx
	 */
	public static void putBoolean(String key, boolean value, Context ctx) {
		SharedPreferences sp = ctx.getSharedPreferences("config",
				Context.MODE_PRIVATE);//config是存数据的xml的文件名
		sp.edit().putBoolean(key, value).commit();
	}

	public static boolean getBoolean(String key, boolean defValue, Context ctx) {
		SharedPreferences sp = ctx.getSharedPreferences("config",
				Context.MODE_PRIVATE);
		return sp.getBoolean(key, defValue);
	}
	/**
	 * 存和取字符串
	 * @param key
	 * @param value
	 * @param ctx
	 */
	public static void putString(String key, String value, Context ctx) {
		SharedPreferences sp = ctx.getSharedPreferences("config",
				Context.MODE_PRIVATE);
		sp.edit().putString(key, value).commit();
	}

	public static String getString(String key, String defValue, Context ctx) {
		SharedPreferences sp = ctx.getSharedPreferences("config",
				Context.MODE_PRIVATE);
		return sp.getString(key, defValue);
	}
	/**
	 * 存和取整型值
	 * @param key
	 * @param value
	 * @param ctx
	 */
	public static void putInt(String key, int value, Context ctx) {
		SharedPreferences sp = ctx.getSharedPreferences("config",
				Context.MODE_PRIVATE);
		sp.edit().putInt(key, value).commit();
	}

	public static int getInt(String key, int defValue, Context ctx) {
		SharedPreferences sp = ctx.getSharedPreferences("config",
				Context.MODE_PRIVATE);
		return sp.getInt(key, defValue);
	}
}
