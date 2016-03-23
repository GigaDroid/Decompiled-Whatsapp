package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.hu;

class az extends hu {
    final Uri f;
    final q g;

    az(q qVar, EditText editText, TextView textView, int i, int i2, Uri uri) {
        this.g = qVar;
        this.f = uri;
        super(editText, textView, i, i2);
    }

    public void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        Object obj = editable.toString();
        if (TextUtils.isEmpty(obj)) {
            ImagePreview.g(this.g.a).remove(this.f);
            if (MediaGalleryFragmentBase.e == 0) {
                return;
            }
        }
        ImagePreview.g(this.g.a).put(this.f, obj.toString());
    }
}
