package com.whatsapp;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.whatsapp.observablelistview.ObservableListView;

final class q5 implements OnGlobalLayoutListener {
    final ObservableListView a;
    final int b;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
        r2 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 >= r1) goto L_0x0013;
    L_0x0006:
        r0 = r2.a;
        r0 = r0.getViewTreeObserver();
        r0.removeGlobalOnLayoutListener(r2);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x001c;
    L_0x0013:
        r0 = r2.a;
        r0 = r0.getViewTreeObserver();
        r0.removeOnGlobalLayoutListener(r2);
    L_0x001c:
        r0 = r2.a;
        r1 = r2.b;
        r0.setSelection(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.q5.onGlobalLayout():void");
    }

    q5(ObservableListView observableListView, int i) {
        this.a = observableListView;
        this.b = i;
    }
}
