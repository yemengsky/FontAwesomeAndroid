package com.yemeng.fontawesome;


import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;

public class FontAwesome extends TextView {
    public FontAwesome(Context context) {
        this(context, null);
    }

    public FontAwesome(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FontAwesome(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr, 0);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public FontAwesome(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(), "android-iconify-fontawesome.ttf"));
    }

}
