# test2_layout
这是关于线性布局、相对布局、表格布局的实验
# 实验二
学号：123012016072 
姓名：陈琪
班级：软工2班

## 一、实验内容
实现ConstraintLayout, LinearLayout和TableLayout
## 二、实验步骤和结果
### (1)代码：
**1、MainActivity.java:**
```
package com.example.c7.layout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    Intent a, b, c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.linear);
        button1.setOnClickListener(new ButtonListener());
        button2=(Button)findViewById(R.id.relative);
        button2.setOnClickListener(new ButtonListener());
        button3=(Button)findViewById(R.id.constraint);
        button3.setOnClickListener(new ButtonListener());
    }

//使用switch、case实现监听作用
//setClass函数的第一个参数是一个Context对象
//Context是一个类,Activity是Context类的子类,也就是说,所有的Activity对象都可以向上转型为Context对象
//setClass函数的第二个参数是Class对象,在当前场景下,应该传入需要被启动的Activity的class对象
    //只跳转一个活动时：可以使用如下几行代码
    //Intent intent=new Intent();
   //intent.setClass(MainActivity.this, SecondActivity.class);
    //startActivity(intent);
    class ButtonListener implements OnClickListener{
        @Override
        public void onClick(View v) {
          switch(v.getId()){
              case R.id.linear:
                a=new Intent(MainActivity.this,LinearLayout.class);
                startActivity(a);
                break;
              case R.id.relative:
                  b=new Intent(MainActivity.this,RelativeLayout.class);
                  startActivity(b);
                  break;
              case R.id.constraint:
                  c=new Intent(MainActivity.this,ConstraintLayout.class);
                  startActivity(c);
                  break;
                  default:
                      break;
          }
        }
    }
}
```
**2、LinearLayout.java:**
```
package com.example.c7.layout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * Created by c7 on 2019/3/14.
 */
public class LinearLayout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);
    }
}
```
**3、RelativeLayout.java:**
```
package com.example.c7.layout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * Created by c7 on 2019/3/14.
 */
public class RelativeLayout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativelayout);
    }
}
```
**4、ConstraintLayout .java:**
```
package com.example.c7.layout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/**
 * Created by c7 on 2019/3/14.
 */
public class ConstraintLayout extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraintlayout);
    }
}
```
**5、Bottom_border.xml:**
```
<?xml version="1.0" encoding="UTF-8"?>
<layer-list xmlns:android="http://schemas.android.com/apk/res/android">
<!-- 边框颜色值 -->
<item>
    <shape>
        <solid android:color="@android:color/white" />
    </shape>
</item>
<!-- 主体背景颜色值,控件间的间距 --><!--设置只有底部有边框-->
<item
    android:bottom="3dp">
    <shape>
        <solid android:color="@android:color/black" />
    </shape>
</item>
</layer-list>
```
**6、Textview_border.xml:**
```
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle" >
    <solid android:color="#FFFFFF" />
    <stroke android:width="1dp" android:color="#FFFFFF"/>
</shape>
```

**7、Activity_main.xml:**
```
 <LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:paddingLeft="16dp"
        android:paddingRight="16dp"
        android:orientation="vertical"
        >
        <Button
            android:id="@+id/linear"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text="LinearLayout" />
        <Button
            android:id="@+id/relative"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text="RelativeLayout" />
        <Button
            android:id="@+id/constraint"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text="ConstraintLayout" />
    </LinearLayout>
```
**8、Activity_linearlayout.xml:**
```
  <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        android:background="@color/black"
        >

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">
        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="One,One"
            android:textColor="@color/white" />
        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="One,Two"
            android:textColor="@color/white" />
        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="One,Three"
            android:textColor="@color/white" />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="One,Four"
            android:textColor="@color/white" />
    </LinearLayout>

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="Two,One"
            android:textColor="@color/white" />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="Two,Two"
            android:textColor="@color/white" />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="Two,Three"
            android:textColor="@color/white" />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="Two,Four"
            android:textColor="@color/white" />
    </LinearLayout>

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="Three,One"
            android:textColor="@color/white" />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="Three,Two"
            android:textColor="@color/white" />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="Three,Three"
            android:textColor="@color/white" />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="Three,Four"
            android:textColor="@color/white" />
    </LinearLayout>

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="Four,One"
            android:textColor="@color/white" />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="Four,Two"
            android:textColor="@color/white" />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="Four,Three"
            android:textColor="@color/white" />

        <Button
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:background="@drawable/btn_border"
            android:text="Four,Four"
            android:textColor="@color/white" />
    </LinearLayout>
</LinearLayout>
```
**9、Activity_relativelayout.xml:**
```
 <RelativeLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/black"
        >
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="RED"
            android:layout_alignParentTop="true"
            android:textColor="@color/black"
            android:background="@color/red" />
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="ORANGE"
            android:layout_alignParentTop="true"
            android:layout_centerHorizontal="true"
            android:textColor="@color/black"
            android:background="@color/orange"/>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="YELLOW"
            android:layout_alignParentTop="true"
            android:layout_alignParentRight="true"
            android:textColor="@color/black"
            android:background="@color/yellow"/>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="GREEN"
            android:layout_toLeftOf="@+id/blue"
            android:layout_centerInParent="true"
            android:textColor="@color/black"
            android:background="@color/green"/>
        <TextView
            android:id="@+id/blue"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="BLUE"
            android:layout_centerInParent="true"
            android:textColor="@color/white"
            android:background="@color/blue"/>
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="INDIGO"
            android:layout_toRightOf="@+id/blue"
            android:layout_centerInParent="true"
            android:textColor="@color/white"
            android:background="@color/indigo"/>

        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:layout_alignParentBottom="true"
            android:background="@color/violet"
            android:text="VIOLET"
            android:textColor="@color/black" />
    </RelativeLayout>
```
**10、Activity_constraintlayout.xml:**
```
  <TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/black"
        android:stretchColumns="1"
        tools:layout_editor_absoluteX="28dp"
        tools:layout_editor_absoluteY="0dp">

        <TableRow>
            <TextView
                android:padding="3dip"
                android:text=" Open..."
                android:textColor="@color/white" />
            <TextView
                android:gravity="right"
                android:padding="3dip"
                android:text="Ctr-O"
                android:textColor="@color/white" />
        </TableRow>

        <TableRow>
            <TextView
                android:padding="3dip"
                android:text=" Save..."
                android:textColor="@color/white" />
            <TextView
                android:gravity="right"
                android:padding="3dip"
                android:text="Ctr-S"
                android:textColor="@color/white" />
        </TableRow>
        <TableRow android:background="@drawable/bottom_border">
            <TextView
                android:padding="3dip"
                android:text=" Save As..."
                android:textColor="@color/white" />
            <TextView
                android:gravity="right"
                android:padding="3dip"
                android:text="Ctr-Shift-S"
                android:textColor="@color/white" />
        </TableRow>

        <TableRow>
            <TextView
                android:padding="3dip"
                android:text="×Import..."
                android:textColor="@color/white" />
            <TextView
                android:gravity="right"
                android:padding="3dip"
                android:text=""
                android:textColor="@color/white" />
        </TableRow>

        <TableRow android:background="@drawable/bottom_border">
            <TextView
                android:padding="3dip"
                android:text="×Export..."
                android:textColor="@color/white" />
            <TextView
                android:gravity="right"
                android:padding="3dip"
                android:text="Ctr-E"
                android:textColor="@color/white" />
        </TableRow>

        <TableRow>
            <TextView
                android:padding="3dip"
                android:text=" Quit"
                android:textColor="@color/white" />

            <TextView
                android:gravity="right"
                android:padding="3dip"
                android:text=""
                android:textColor="@color/white" />
        </TableRow>
    </TableLayout>
```
### (2)结果截图：
**1、主界面（主活动）：按下按钮跳转相应布局：**
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190319101616162.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZpdmljNw==,size_16,color_FFFFFF,t_70)

**2、跳转线性布局：**
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190319101627726.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZpdmljNw==,size_16,color_FFFFFF,t_70)

**3、跳转相对布局：**
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190319101636960.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZpdmljNw==,size_16,color_FFFFFF,t_70)

**4、跳转表格布局：**
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190319101644905.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3ZpdmljNw==,size_16,color_FFFFFF,t_70)

## 三、总结
共创建4个活动，活动要在manifest清单里声明，在活动相应的xml文件编写界面样式，以及关于一些其他的效果，值，也要写在相应的xml文件，比如colors.xml声明一些颜色，添加边框效果新建个border.xml编写所想要的效果，然后去调用这个xml文件。
