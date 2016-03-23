package com.whatsapp.notification;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.whatsapp.App;

class i implements Runnable {
    final PopupNotification a;

    public void run() {
        View childAt = PopupNotification.f(this.a).getChildAt(PopupNotification.a(this.a, 0));
        Animation translateAnimation = new TranslateAnimation((float) (((App.a1() ? 1 : -1) * (-childAt.getWidth())) / 2), 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration((long) PopupNotification.h());
        translateAnimation.setFillAfter(true);
        childAt.startAnimation(translateAnimation);
    }

    i(PopupNotification popupNotification) {
        this.a = popupNotification;
    }
}
