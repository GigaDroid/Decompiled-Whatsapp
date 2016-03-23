package com.whatsapp.qrcode;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

class p implements OnClickListener {
    final QrCodeActivity a;

    public void onClick(View view) {
        this.a.findViewById(2131755868).setVisibility(8);
        this.a.findViewById(2131755867).setVisibility(8);
        Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration((long) this.a.getResources().getInteger(17694721));
        this.a.findViewById(2131755868).startAnimation(alphaAnimation);
        this.a.findViewById(2131755867).startAnimation(alphaAnimation);
        this.a.findViewById(2131755703).setVisibility(0);
        QrCodeActivity.b(this.a, false);
        if (QrCodeActivity.e(this.a)) {
            QrCodeActivity.g(this.a).b().setOneShotPreviewCallback(QrCodeActivity.c(this.a));
        }
        QrCodeActivity.b(this.a);
    }

    p(QrCodeActivity qrCodeActivity) {
        this.a = qrCodeActivity;
    }
}
