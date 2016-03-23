package com.whatsapp;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.whatsapp.protocol.co;
import java.util.ArrayList;
import java.util.List;

class mu extends ArrayAdapter {
    protected List a;
    final CallLogActivity b;

    public Object getItem(int i) {
        return a(i);
    }

    public mu(CallLogActivity callLogActivity, Context context) {
        this.b = callLogActivity;
        super(context, 2130903088, (List) null);
        this.a = new ArrayList();
    }

    public co a(int i) {
        return (co) this.a.get(i);
    }

    public int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r13, android.view.View r14, android.view.ViewGroup r15) {
        /*
        r12 = this;
        r11 = 8;
        r10 = 0;
        r5 = com.whatsapp.DialogToastActivity.f;
        if (r14 != 0) goto L_0x0016;
    L_0x0007:
        r0 = r12.b;
        r0 = r0.getLayoutInflater();
        r1 = 2130903088; // 0x7f030030 float:1.7412984E38 double:1.0528060104E-314;
        r0 = com.whatsapp.aam.a(r0, r1, r15, r10);
        if (r5 == 0) goto L_0x00d0;
    L_0x0016:
        r0 = 2131755376; // 0x7f100170 float:1.914163E38 double:1.0532270966E-314;
        r0 = r14.findViewById(r0);
        r1 = r12.getCount();
        r1 = r1 + -1;
        if (r13 != r1) goto L_0x0030;
    L_0x0025:
        r1 = 2130839690; // 0x7f02088a float:1.7284398E38 double:1.0527746876E-314;
        r14.setBackgroundResource(r1);
        r0.setVisibility(r11);
        if (r5 == 0) goto L_0x0039;
    L_0x0030:
        r1 = 2130839694; // 0x7f02088e float:1.7284406E38 double:1.0527746896E-314;
        r14.setBackgroundResource(r1);
        r0.setVisibility(r10);
    L_0x0039:
        r6 = r12.a(r13);
        r0 = 2131755371; // 0x7f10016b float:1.914162E38 double:1.053227094E-314;
        r0 = r14.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = 2131755372; // 0x7f10016c float:1.9141621E38 double:1.0532270946E-314;
        r1 = r14.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131755374; // 0x7f10016e float:1.9141625E38 double:1.0532270956E-314;
        r2 = r14.findViewById(r2);
        r2 = (android.widget.TextView) r2;
        r3 = 2131755373; // 0x7f10016d float:1.9141623E38 double:1.053227095E-314;
        r3 = r14.findViewById(r3);
        r3 = (android.widget.TextView) r3;
        r4 = 2131755375; // 0x7f10016f float:1.9141628E38 double:1.053227096E-314;
        r4 = r14.findViewById(r4);
        r4 = (android.widget.TextView) r4;
        r7 = com.whatsapp.CallLogActivity.a(r6);
        r0.setImageResource(r7);
        r0 = com.whatsapp.CallLogActivity.b(r6);
        r1.setText(r0);
        r0 = r12.b;
        r0 = r0.getBaseContext();
        r8 = com.whatsapp.App.o(r6);
        r1 = 1;
        r0 = android.text.format.DateUtils.formatDateTime(r0, r8, r1);
        r2.setText(r0);
        r0 = r6.H;
        if (r0 <= 0) goto L_0x00b8;
    L_0x008e:
        r0 = r6.H;
        r0 = (long) r0;
        r0 = android.text.format.DateUtils.formatElapsedTime(r0);
        r3.setText(r0);
        r3.setVisibility(r10);
        r0 = com.whatsapp.Voip.a(r6);
        r8 = 0;
        r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1));
        if (r2 <= 0) goto L_0x00b3;
    L_0x00a5:
        r2 = r12.b;
        r0 = com.whatsapp.CallLogActivity.a(r0, r2);
        r4.setText(r0);
        r4.setVisibility(r10);
        if (r5 == 0) goto L_0x00b6;
    L_0x00b3:
        r4.setVisibility(r11);
    L_0x00b6:
        if (r5 == 0) goto L_0x00cf;
    L_0x00b8:
        r0 = r6.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x00c9;
    L_0x00be:
        r0 = 2131230864; // 0x7f080090 float:1.8077793E38 double:1.0529679533E-314;
        r3.setText(r0);
        r3.setVisibility(r10);
        if (r5 == 0) goto L_0x00cc;
    L_0x00c9:
        r3.setVisibility(r11);
    L_0x00cc:
        r4.setVisibility(r11);
    L_0x00cf:
        return r14;
    L_0x00d0:
        r14 = r0;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mu.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getCount() {
        return this.a == null ? 0 : this.a.size();
    }

    public void a(List list) {
        this.a = list;
        notifyDataSetChanged();
    }
}
