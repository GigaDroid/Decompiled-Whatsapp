package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class aa1 implements OnItemClickListener {
    final ContactInfo a;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = i - 1;
        if (i2 >= 0 && i2 < ContactInfo.b(this.a).getCount()) {
            this.a.startActivity(Conversation.a(ContactInfo.b(this.a).a(i2)));
        }
    }

    aa1(ContactInfo contactInfo) {
        this.a = contactInfo;
    }
}
