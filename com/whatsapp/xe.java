package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.Iterator;

class xe implements OnClickListener {
    final WebImagePicker a;

    public void onClick(View view) {
        boolean z = DialogToastActivity.f;
        String str = (String) view.getTag();
        if (str != null && WebImagePicker.k(this.a) != null) {
            Iterator it = WebImagePicker.f(this.a).iterator();
            while (it.hasNext()) {
                anw com_whatsapp_anw = (anw) it.next();
                if (str.equals(com_whatsapp_anw.d)) {
                    WebImagePicker.a(this.a, com_whatsapp_anw);
                    if (!z) {
                        return;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    xe(WebImagePicker webImagePicker) {
        this.a = webImagePicker;
    }
}
