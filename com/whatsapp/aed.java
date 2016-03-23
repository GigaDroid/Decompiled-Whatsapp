package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.whatsapp.protocol.co;
import org.v;
import org.whispersystems.at;

class aed implements OnItemClickListener {
    private static final String z;
    final Broadcasts a;

    static {
        char[] toCharArray = "14".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 88;
                    break;
                case at.g /*1*/:
                    i2 = 80;
                    break;
                case at.i /*2*/:
                    i2 = 80;
                    break;
                case at.o /*3*/:
                    i2 = 123;
                    break;
                default:
                    i2 = 121;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        co coVar = (co) view.getTag();
        Intent intent = new Intent(this.a, BroadcastDetails.class);
        intent.putExtra(z, coVar.k.b);
        this.a.startActivity(intent);
    }

    aed(Broadcasts broadcasts) {
        this.a = broadcasts;
    }
}
