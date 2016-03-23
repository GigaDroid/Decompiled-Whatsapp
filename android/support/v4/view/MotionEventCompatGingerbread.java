package android.support.v4.view;

import android.view.MotionEvent;

class MotionEventCompatGingerbread {
    public static int getSource(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }
}
