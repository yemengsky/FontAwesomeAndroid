FontAwesomeAndroid
==================

在Android上使用FontAwesome图标

## Demo
![](https://github.com/yemengsky/FontAwesomeAndroid/blob/master/demo.png)

- [demo代码请看戳这里](https://github.com/yemengsky/FontAwesomeAndroid/blob/master/app/src/main/res/layout/activity_main.xml)

##关于text字段
text字段可以参考以下链接获取：
```
   http://fontawesome.io/cheatsheet/
```
##使用方法
demo是用Module方式依赖，你也可以使用gradle 依赖:
```java
   compile 'com.yemeng.fontawesome:fontawesome:1.0.0'
```


##### Config in xml

```xml
    <com.yemeng.fontawesome.FontAwesome
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="10dp"
        android:text="&#xf0b2;"
        android:textColor="#f00"
        android:textSize="45sp" />
```
Done。
