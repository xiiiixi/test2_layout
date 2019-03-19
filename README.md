# test2_layout
这是关于线性布局、相对布局、表格布局的实验
# 实验一
学号：123012016072 
姓名：陈琪
班级：软工2班

## 一、实验内容
阅读文献了解Activity，验证Activity的生命周期，参看上述文档，完成其中生命周期的例子，并设法验证

## 二、实验步骤和结果
**(1)代码：**
MainActivity.java：
```
package com.example.c7.activitylife;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
        public static final String TAG = "Lifecycle";
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d(TAG,"onCreate is running");
        }
        @Override
        protected void onStart(){
            super.onStart();
            Log.d(TAG,"onStart is running");
        }
        @Override
        protected void onResume() {
            super.onResume();
            Log.d(TAG,"onResume is running");
        }
        @Override
        protected void onPause() {
            super.onPause();
            Log.d(TAG,"onPause is running");
        }
        @Override
        protected void onStop() {
            super.onStop();
            Log.d(TAG,"onStop is running");
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d(TAG,"onDestroy is running");
        }
        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d(TAG,"onRestart is running");
        }
}
```
**(2)结果截图：**
1、主界面（主活动）：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190317234756487.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZpdmljNw==,size_16,color_FFFFFF,t_70)
2、半遮住活动
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190317235118505.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZpdmljNw==,size_16,color_FFFFFF,t_70)
3、退出活动，回到home界面
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190317235127736.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZpdmljNw==,size_16,color_FFFFFF,t_70)
4、相应操作对应activity的生命周期
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190317235152308.jpg)
## 三、总结
触发相应活动调用相应的回调函数中编写的操作
