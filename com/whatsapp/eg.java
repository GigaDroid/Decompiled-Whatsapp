package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.v;
import org.whispersystems.at;

class eg implements OnItemClickListener {
    private static final String[] z;
    final CallsFragment a;

    static {
        String[] strArr = new String[3];
        String str = "1SO";
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
                        i3 = 91;
                        break;
                    case at.g /*1*/:
                        i3 = 58;
                        break;
                    case at.i /*2*/:
                        i3 = 43;
                        break;
                    case at.o /*3*/:
                        i3 = 43;
                        break;
                    default:
                        i3 = 57;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "8[GGJtUEbM>WhGP8Q\u0004NT+NR";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "8[GGJ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z = DialogToastActivity.f;
        rd rdVar = (rd) view.getTag();
        if (rdVar == null || rdVar.b()) {
            Log.e(z[2]);
            return;
        }
        Intent intent = new Intent(App.z().getApplicationContext(), CallLogActivity.class);
        intent.putExtra(z[0], rdVar.f().p);
        Serializable arrayList = new ArrayList();
        Iterator it = rd.a(rdVar).iterator();
        while (it.hasNext()) {
            arrayList.add(new a4p(((co) it.next()).k));
            if (z) {
                break;
            }
        }
        intent.putExtra(z[1], arrayList);
        this.a.startActivity(intent);
    }

    eg(CallsFragment callsFragment) {
        this.a = callsFragment;
    }
}
