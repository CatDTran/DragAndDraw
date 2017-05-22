package com.starkindustry.tonystark.draganddraw;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by Tony Stark on 5/21/2017.
 */

public class BoxDrawingView extends View {

    private static final String TAG = "BoxDrawingView";

    //Constructor to create View from XML
    public BoxDrawingView(Context context, AttributeSet attrs){
        super(context, attrs);
    }
    //Constructor to create View in code
    public BoxDrawingView(Context context){
        this(context, null);
    }

    //Implementing touch events listener
    @Override
    public boolean onTouchEvent(MotionEvent event){
        PointF current = new PointF(event.getX(), event.getY());
        String action = "";
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                action = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_MOVE:
                action = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                action = "ACTION_UP";
                break;
            case MotionEvent.ACTION_CANCEL:
                action = "ACTION_CANCEL";
                break;
        }
        Log.i(TAG, action + " at x=" + current.x + " y =" + current.y);
        return true;
    }
}
