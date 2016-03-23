package com.whatsapp;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class atp implements OnGlobalLayoutListener {
    final View a;
    final TosUpdateActivity b;

    public void onGlobalLayout() {
        boolean z = DialogToastActivity.f;
        this.a.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int measuredHeight = this.a.getMeasuredHeight();
        int measuredHeight2 = this.b.findViewById(2131755914).getMeasuredHeight();
        int measuredHeight3 = this.b.findViewById(2131755481).getMeasuredHeight();
        int measuredHeight4 = this.b.findViewById(2131755912).getMeasuredHeight();
        View findViewById = this.b.findViewById(2131755913);
        int measuredHeight5 = findViewById.getMeasuredHeight();
        measuredHeight = ((measuredHeight - measuredHeight2) - measuredHeight3) - measuredHeight4;
        if (((float) measuredHeight) < this.b.getResources().getDisplayMetrics().density * 64.0f) {
            findViewById.setVisibility(8);
            if (!z) {
                return;
            }
        }
        if (measuredHeight < measuredHeight5) {
            LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = measuredHeight;
                layoutParams.height = measuredHeight;
            }
            findViewById.setVisibility(0);
            findViewById.requestLayout();
            if (!z) {
                return;
            }
        }
        findViewById.setVisibility(0);
    }

    atp(TosUpdateActivity tosUpdateActivity, View view) {
        this.b = tosUpdateActivity;
        this.a = view;
    }
}
