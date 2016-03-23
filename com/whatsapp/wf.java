package com.whatsapp;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.CursorAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tonicartos.widget.stickygridheaders.r;
import com.whatsapp.gallerypicker.a7;
import com.whatsapp.protocol.co;

class wf extends CursorAdapter implements r {
    final DocumentsGalleryFragment b;

    public co m474a(int i) {
        Cursor cursor = getCursor();
        if (cursor == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return App.aK.a(cursor, DocumentsGalleryFragment.f(this.b));
    }

    public View a(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view != null) {
            view = (ViewGroup) view;
            TextView textView2 = (TextView) view.getChildAt(0);
            if (!DialogToastActivity.f) {
                textView = textView2;
                textView.setText(((a7) DocumentsGalleryFragment.d(this.b).get(i)).toString());
                return view;
            }
        }
        View view2 = (ViewGroup) this.b.getLayoutInflater(null).inflate(2130903219, viewGroup, false);
        view2.setClickable(false);
        view2.setBackgroundColor(ContextCompat.getColor(this.b.getContext(), 2131624018));
        textView = (TextView) view2.findViewById(2131755765);
        view = view2;
        textView.setText(((a7) DocumentsGalleryFragment.d(this.b).get(i)).toString());
        return view;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
        r11 = this;
        r10 = 0;
        r3 = 8;
        r2 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r5 = r11.a(r12);
        if (r13 == 0) goto L_0x0014;
    L_0x000c:
        r0 = r13.getTag();
        r0 = (com.whatsapp.a54) r0;
        if (r4 == 0) goto L_0x018a;
    L_0x0014:
        r0 = r11.b;
        r0 = r0.getLayoutInflater(r10);
        r1 = 2130903170; // 0x7f030082 float:1.741315E38 double:1.052806051E-314;
        r13 = com.whatsapp.aam.a(r0, r1, r10, r2);
        r1 = new com.whatsapp.a54;
        r1.<init>(r10);
        r0 = 2131755126; // 0x7f100076 float:1.9141122E38 double:1.053226973E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1.b = r0;
        r0 = 2131755127; // 0x7f100077 float:1.9141124E38 double:1.0532269736E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1.e = r0;
        r0 = 2131755530; // 0x7f10020a float:1.9141942E38 double:1.0532271727E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1.h = r0;
        r0 = 2131755620; // 0x7f100264 float:1.9142124E38 double:1.053227217E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1.f = r0;
        r0 = 2131755621; // 0x7f100265 float:1.9142126E38 double:1.0532272177E-314;
        r0 = r13.findViewById(r0);
        r1.g = r0;
        r0 = 2131755455; // 0x7f1001bf float:1.914179E38 double:1.0532271357E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1.c = r0;
        r0 = 2131755548; // 0x7f10021c float:1.9141978E38 double:1.0532271816E-314;
        r0 = r13.findViewById(r0);
        r1.i = r0;
        r0 = 2131755622; // 0x7f100266 float:1.9142128E38 double:1.053227218E-314;
        r0 = r13.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1.a = r0;
        r0 = 2131755619; // 0x7f100263 float:1.9142122E38 double:1.0532272167E-314;
        r0 = r13.findViewById(r0);
        r1.d = r0;
        r13.setTag(r1);
    L_0x0086:
        r0 = r1.b;
        r6 = r11.b;
        r6 = r6.getContext();
        r6 = com.whatsapp.util.cb.a(r6, r5);
        r0.setImageDrawable(r6);
        r0 = r5.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x00a7;
    L_0x009d:
        r0 = r1.e;
        r6 = 2131232185; // 0x7f0805b9 float:1.8080472E38 double:1.052968606E-314;
        r0.setText(r6);
        if (r4 == 0) goto L_0x00c2;
    L_0x00a7:
        r0 = r1.e;
        r6 = r11.b;
        r6 = r6.getContext();
        r7 = r5.a;
        r8 = r11.b;
        r8 = com.whatsapp.DocumentsGalleryFragment.b(r8);
        r8 = r8.d();
        r6 = com.whatsapp.util.bw.a(r6, r10, r7, r8);
        r0.setText(r6);
    L_0x00c2:
        r0 = r5.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r6 = r0.file;
        if (r6 == 0) goto L_0x00e9;
    L_0x00ca:
        r0 = r1.f;
        r7 = r11.b;
        r7 = r7.getContext();
        r8 = r6.length();
        r7 = com.whatsapp.util.l.a(r7, r8);
        r0.setText(r7);
        r0 = r1.f;
        r0.setVisibility(r2);
        r0 = r1.g;
        r0.setVisibility(r2);
        if (r4 == 0) goto L_0x00f3;
    L_0x00e9:
        r0 = r1.f;
        r0.setVisibility(r3);
        r0 = r1.g;
        r0.setVisibility(r3);
    L_0x00f3:
        r0 = r5.R;
        if (r0 == 0) goto L_0x010c;
    L_0x00f7:
        r0 = r1.c;
        r0.setVisibility(r2);
        r0 = r1.i;
        r0.setVisibility(r2);
        r0 = r1.c;
        r7 = com.whatsapp.util.cb.a(r5);
        r0.setText(r7);
        if (r4 == 0) goto L_0x0116;
    L_0x010c:
        r0 = r1.c;
        r0.setVisibility(r3);
        r0 = r1.i;
        r0.setVisibility(r3);
    L_0x0116:
        r0 = r5.n;
        r0 = com.whatsapp.util.ag.c(r0);
        r0 = r0.toUpperCase();
        r7 = android.text.TextUtils.isEmpty(r0);
        if (r7 == 0) goto L_0x0138;
    L_0x0126:
        r7 = r5.A;
        r7 = android.text.TextUtils.isEmpty(r7);
        if (r7 != 0) goto L_0x0138;
    L_0x012e:
        r0 = r5.A;
        r0 = com.whatsapp.util.a1.b(r0);
        r0 = r0.toUpperCase();
    L_0x0138:
        r7 = r1.a;
        r7.setText(r0);
        if (r6 == 0) goto L_0x0154;
    L_0x013f:
        r0 = r1.h;
        r7 = r11.b;
        r7 = r7.getContext();
        r8 = r6.lastModified();
        r6 = com.whatsapp.util.cs.j(r7, r8);
        r0.setText(r6);
        if (r4 == 0) goto L_0x015c;
    L_0x0154:
        r0 = r1.h;
        r6 = "";
        r0.setText(r6);
    L_0x015c:
        r1 = r1.d;
        r0 = r5.P;
        if (r0 == 0) goto L_0x0188;
    L_0x0162:
        r0 = r2;
    L_0x0163:
        r1.setVisibility(r0);
        r0 = r11.b;
        r0 = com.whatsapp.DocumentsGalleryFragment.b(r0);
        r0 = r0.b(r5);
        if (r0 == 0) goto L_0x0184;
    L_0x0172:
        r0 = r11.b;
        r0 = r0.getContext();
        r1 = 2131624048; // 0x7f0e0070 float:1.8875265E38 double:1.053162212E-314;
        r0 = android.support.v4.content.ContextCompat.getColor(r0, r1);
        r13.setBackgroundColor(r0);
        if (r4 == 0) goto L_0x0187;
    L_0x0184:
        r13.setBackgroundDrawable(r10);
    L_0x0187:
        return r13;
    L_0x0188:
        r0 = r3;
        goto L_0x0163;
    L_0x018a:
        r1 = r0;
        goto L_0x0086;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wf.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int a() {
        return DocumentsGalleryFragment.d(this.b).size();
    }

    public int a(int i) {
        return ((a7) DocumentsGalleryFragment.d(this.b).get(i)).b;
    }

    public wf(DocumentsGalleryFragment documentsGalleryFragment) {
        this.b = documentsGalleryFragment;
        super(documentsGalleryFragment.getContext(), null, 0);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw new AssertionError();
    }

    public Object getItem(int i) {
        return a(i);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        throw new AssertionError();
    }
}
