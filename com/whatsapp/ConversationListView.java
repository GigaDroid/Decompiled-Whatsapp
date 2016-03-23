package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.observablelistview.c;
import com.whatsapp.observablelistview.g;
import com.whatsapp.observablelistview.j;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

public class ConversationListView extends ListView implements j {
    private static final String[] z;
    private g a;

    static {
        String[] strArr = new String[2];
        String str = "9\u0000=S,mY";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 25;
                        break;
                    case at.g /*1*/:
                        i3 = 99;
                        break;
                    case at.i /*2*/:
                        i3 = 82;
                        break;
                    case at.o /*3*/:
                        i3 = 38;
                        break;
                    default:
                        i3 = 66;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "z\f<P'k\u00103R+v\r$O1m\u0015;C56\f<o,p\u0017;G.p\u00197g!z\u0006!U+{\n>O6`-=B'P\r4I\u0004v\u0011\u001bR'tC\"I1#";
                    obj = null;
            }
        }
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }

    private void a() {
        this.a = new g();
    }

    public ConversationListView(Context context) {
        super(context);
        a();
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public ConversationListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.a.a();
        super.onLayout(z, i, i2, i3, i4);
        this.a.b();
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, int i, AccessibilityNodeInfo accessibilityNodeInfo) {
        ListAdapter adapter = getAdapter();
        if (i != -1 && adapter != null) {
            if (i >= adapter.getCount()) {
                Log.w(z[1] + i + z[0] + adapter.getCount());
            } else {
                super.onInitializeAccessibilityNodeInfoForItem(view, i, accessibilityNodeInfo);
            }
        }
    }

    public void a(c cVar) {
        this.a.a(cVar);
    }
}
