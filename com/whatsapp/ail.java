package com.whatsapp;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

class ail implements a5r {
    final VoipActivity a;

    public void b() {
        VoipActivity.g(this.a);
    }

    ail(VoipActivity voipActivity) {
        this.a = voipActivity;
    }

    public void a(boolean z) {
        TextView textView = (TextView) this.a.findViewById(2131755975);
        textView.clearAnimation();
        textView.setText(z ? 2131232029 : 2131232030);
        textView.setVisibility(0);
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200);
        textView.setAnimation(alphaAnimation);
        textView.removeCallbacks(VoipActivity.j(this.a));
        textView.postDelayed(VoipActivity.j(this.a), 3000);
    }

    public void a() {
        VoipActivity.i(this.a);
    }
}
