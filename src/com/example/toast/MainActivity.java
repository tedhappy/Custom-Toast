package com.example.toast;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.toast.utils.ToastUtil;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


	}

	/**
	 * 自定义message字体、背景色[默认]
	 * @param view
	 */
	public void showToast(View view) {
		// TODO Auto-generated method stub
		ToastUtil toastUtil = new ToastUtil();
		toastUtil
				.Short(MainActivity.this, "自定义message字体、背景色")
				.setToastColor(Color.WHITE,
						Color.YELLOW).show();
	}
	
	/**
	 * 自定义message字体颜色和背景[圆角]
	 * @param view
	 */
	public void showToast1(View view) {
		ToastUtil toastUtil = new ToastUtil();
		toastUtil.Short(MainActivity.this,"自定义message字体颜色和背景").setToastBackground(Color.WHITE,R.drawable.toast_radius).show();
	}
	
	/**
	 * 向Toast添加了一个ImageView
	 * @param view
	 */
	public void showToast2(View view) {
		ToastUtil toastUtil = new ToastUtil();
		 ImageView toastImage = new ImageView(getApplicationContext());
		 toastImage.setImageResource(R.drawable.ic_launcher);
		 toastUtil.Short(MainActivity.this,"向Toast添加了一个ImageView").setToastBackground(Color.WHITE,R.drawable.toast_radius).addView(toastImage,0).show();
	}
	
	/**
	 * toast显示自定义布局
	 * @param view
	 */
	public void showToast3(View v) {
		 View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.image,null);
		 new ToastUtil(MainActivity.this,view,Toast.LENGTH_SHORT).show();
	}

}
