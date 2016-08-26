# 自定义toast样式

> 在这个demo中, 会结合toast的源码, 使用ToastUtils工具类来自定义toast的样式

##举例

1. 可修改toast背景色

		ToastUtil toastUtil=new ToastUtil();
		toastUtil.Short(MainActivity.this,"自定义message字体、背景色").setToastColor(Color.WHITE, getResources().getColor(R.color.colorAccent)).show();
![icon](img/1.gif)

2. 使用shape修改样式

		toastUtil.Short(MainActivity.this,"自定义message字体颜色和背景").setToastBackground(Color.WHITE,R.drawable.toast_radius).show();
![icon](img/2.gif)

3. 给toast添加图标

		 ImageView toastImage = new ImageView(getApplicationContext());
		 toastImage.setImageResource(R.mipmap.ic_launcher);
		 toastUtil.Short(MainActivity.this,"向Toast添加了一个ImageView").setToastBackground(Color.WHITE,R.drawable.toast_radius).addView(toastImage,0).show();
![icon](img/3.gif)

4. 自定义布局

		 View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.image,null);
		 new ToastUtil(MainActivity.this,view,Toast.LENGTH_SHORT).show();
![icon](img/4.gif)


##如何使用

* 使用方式很简单, 拷贝ToastUtils.java工具类即可
* 可借鉴MainActivity中的代码, 学习如何调用工具类中的方法

##关于我

* 如果你觉得不错, 欢迎star和follow
* 我的邮箱: why0229@foxmail.com
