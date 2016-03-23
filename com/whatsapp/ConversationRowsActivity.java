package com.whatsapp;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.support.v7.view.ActionMode;
import android.view.View;
import com.whatsapp.protocol.co;
import java.util.ArrayList;
import java.util.HashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public abstract class ConversationRowsActivity extends DialogToastListActivity implements b2 {
    private HashMap t;
    HashMap u;
    ActionMode v;

    public abstract boolean c();

    public abstract ArrayList d();

    abstract boolean g();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(com.whatsapp.protocol.co r4) {
        /*
        r3 = this;
        r0 = 0;
        r1 = r3.u;
        if (r1 == 0) goto L_0x0025;
    L_0x0005:
        r1 = r3.u;
        r2 = r4.k;
        r1 = r1.containsKey(r2);
        if (r1 == 0) goto L_0x001a;
    L_0x000f:
        r1 = r3.u;
        r2 = r4.k;
        r1.remove(r2);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0022;
    L_0x001a:
        r0 = r3.u;
        r1 = r4.k;
        r0.put(r1, r4);
        r0 = 1;
    L_0x0022:
        r3.i();
    L_0x0025:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowsActivity.c(com.whatsapp.protocol.co):boolean");
    }

    static int b(co coVar) {
        switch (coVar.c) {
            case v.m /*0*/:
                if (coVar.d != 6) {
                    return coVar.k.a ? 0 : 10;
                } else {
                    if (coVar.k.a) {
                        return 6;
                    }
                    return 16;
                }
            case at.g /*1*/:
                return coVar.k.a ? 1 : 11;
            case at.i /*2*/:
                return coVar.r == 1 ? coVar.k.a ? 7 : 17 : coVar.k.a ? 2 : 12;
            case at.o /*3*/:
                return coVar.k.a ? 3 : 13;
            case at.p /*4*/:
                return coVar.k.a ? 5 : 15;
            case at.m /*5*/:
                return coVar.k.a ? 4 : 14;
            case aF.u /*8*/:
                return coVar.k.a ? 8 : 18;
            case Y.l /*9*/:
                return coVar.k.a ? 9 : 19;
            default:
                if (coVar.d != -1 || coVar.c != (byte) -1) {
                    return -1;
                }
                if (coVar.k.a) {
                    return 6;
                }
                return 16;
        }
    }

    public boolean a() {
        return this.u != null;
    }

    public void onSupportActionModeStarted(ActionMode actionMode) {
        super.onSupportActionModeStarted(actionMode);
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this, 2131623947));
        }
    }

    void i() {
        if (this.v != null) {
            if (this.u.size() == 0) {
                b();
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            this.v.invalidate();
        }
    }

    static ConversationRow a(Context context, co coVar) {
        switch (coVar.c) {
            case v.m /*0*/:
                if (coVar.d == 6) {
                    return new ConversationRowDivider(context, coVar);
                }
                return new ConversationRowText(context, coVar);
            case at.g /*1*/:
                return new ConversationRowImage(context, coVar);
            case at.i /*2*/:
                if (coVar.r == 1) {
                    return new ConversationRowVoiceNote(context, coVar);
                }
                return new ConversationRowAudio(context, coVar);
            case at.o /*3*/:
                return new ConversationRowVideo(context, coVar);
            case at.p /*4*/:
                return new ConversationRowContact(context, coVar);
            case at.m /*5*/:
                return new ConversationRowLocation(context, coVar);
            case aF.u /*8*/:
                return new ConversationRowCall(context, coVar);
            case Y.l /*9*/:
                return new ConversationRowDocument(context, coVar);
            default:
                if (coVar.d == -1 && coVar.c == (byte) -1) {
                    return new ConversationRowDivider(context, coVar);
                }
                return null;
        }
    }

    public void d(co coVar) {
        this.u = new HashMap();
        this.u.put(coVar.k, coVar);
        g();
        i();
    }

    public boolean m464b(co coVar) {
        return this.u != null && this.u.containsKey(coVar.k);
    }

    void b() {
        if (this.v != null) {
            this.v.finish();
        }
    }

    public void a(View view) {
    }

    public void onSupportActionModeFinished(ActionMode actionMode) {
        super.onSupportActionModeFinished(actionMode);
        if (VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(ContextCompat.getColor(this, 2131624054));
        }
    }

    public int a(co coVar) {
        if (this.t == null) {
            return 0;
        }
        Integer num = (Integer) this.t.get(coVar.k);
        return num == null ? 0 : num.intValue();
    }

    public void a(co coVar, int i) {
        if (this.t == null) {
            this.t = new HashMap();
        }
        this.t.put(coVar.k, Integer.valueOf(i));
    }
}
