package com.whatsapp;

import java.util.Vector;

class a3n extends a3i {
    final awu j;

    a3n(awu com_whatsapp_awu, String str, String str2, Vector vector, int i) {
        this.j = com_whatsapp_awu;
        super(str, str2, vector, i);
    }

    public void a(String str) {
        if (NewGroup.a(this.j.d).x().exists()) {
            this.j.d.runOnUiThread(new axq(this, str));
        }
        super.a(str);
    }
}
