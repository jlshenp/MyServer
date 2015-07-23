package com.firstcase.View;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class FocusedTextView extends TextView {
	//当布局文件中具有属性和样式style时，系统底层解析时，就会调用此方法
	public FocusedTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	//当布局文件具有属性时，系统底层解析时，就会调用这个构造方法
	public FocusedTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	//从代码中new对象
	public FocusedTextView(Context context) {
		super(context);
	}
	
	//强制让TextView具有焦点
	@Override
	public boolean isFocused() {
		return super.isFocused();
	}
}
