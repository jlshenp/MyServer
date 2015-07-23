package com.firstcase.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {
	private static void showToast(Context ctx,String text) {
		Toast.makeText(ctx, text, Toast.LENGTH_LONG).show();
		
	}
}
