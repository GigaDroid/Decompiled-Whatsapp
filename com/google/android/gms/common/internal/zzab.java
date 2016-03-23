package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import org.v;
import org.whispersystems.at;

public final class zzab extends Button {
    public zzab(Context context) {
        this(context, null);
    }

    public zzab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842824);
    }

    private void zza(Resources resources) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        float f = resources.getDisplayMetrics().density;
        setMinHeight((int) ((f * 48.0f) + 0.5f));
        setMinWidth((int) ((f * 48.0f) + 0.5f));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zzb(android.content.res.Resources r4, int r5, int r6) {
        /*
        r3 = this;
        r1 = com.google.android.gms.common.internal.zzx.a;
        switch(r5) {
            case 0: goto L_0x0021;
            case 1: goto L_0x0021;
            case 2: goto L_0x002b;
            default: goto L_0x0005;
        };
    L_0x0005:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x001f }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x001f }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x001f }
        r2 = "Unknown button size: ";
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x001f }
        r1 = r1.append(r5);	 Catch:{ IllegalStateException -> 0x001f }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x001f }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x001f }
        throw r0;	 Catch:{ IllegalStateException -> 0x001f }
    L_0x001f:
        r0 = move-exception;
        throw r0;
    L_0x0021:
        r0 = com.google.android.gms.e.common_signin_btn_text_dark;
        r2 = com.google.android.gms.e.common_signin_btn_text_light;
        r0 = r3.zzd(r6, r0, r2);
        if (r1 == 0) goto L_0x0035;
    L_0x002b:
        r0 = com.google.android.gms.e.common_signin_btn_icon_dark;
        r2 = com.google.android.gms.e.common_signin_btn_icon_light;
        r0 = r3.zzd(r6, r0, r2);
        if (r1 != 0) goto L_0x0005;
    L_0x0035:
        r1 = -1;
        if (r0 != r1) goto L_0x0043;
    L_0x0038:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0041 }
        r1 = "Could not find background resource!";
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0041 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0041 }
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = r4.getDrawable(r0);
        r3.setBackgroundDrawable(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzab.zzb(android.content.res.Resources, int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zzc(android.content.res.Resources r4, int r5, int r6) {
        /*
        r3 = this;
        r0 = com.google.android.gms.common.internal.zzx.a;
        r1 = com.google.android.gms.a.common_signin_btn_text_dark;
        r2 = com.google.android.gms.a.common_signin_btn_text_light;
        r1 = r3.zzd(r6, r1, r2);
        r1 = r4.getColorStateList(r1);	 Catch:{ IllegalStateException -> 0x004d }
        r3.setTextColor(r1);	 Catch:{ IllegalStateException -> 0x004d }
        switch(r5) {
            case 0: goto L_0x0030;
            case 1: goto L_0x003b;
            case 2: goto L_0x0046;
            default: goto L_0x0014;
        };
    L_0x0014:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x002e }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x002e }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x002e }
        r2 = "Unknown button size: ";
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x002e }
        r1 = r1.append(r5);	 Catch:{ IllegalStateException -> 0x002e }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x002e }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x002e }
        throw r0;	 Catch:{ IllegalStateException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;
    L_0x0030:
        r1 = com.google.android.gms.d.common_signin_button_text;	 Catch:{ IllegalStateException -> 0x004f }
        r1 = r4.getString(r1);	 Catch:{ IllegalStateException -> 0x004f }
        r3.setText(r1);	 Catch:{ IllegalStateException -> 0x004f }
        if (r0 == 0) goto L_0x004c;
    L_0x003b:
        r1 = com.google.android.gms.d.common_signin_button_text_long;	 Catch:{ IllegalStateException -> 0x0051 }
        r1 = r4.getString(r1);	 Catch:{ IllegalStateException -> 0x0051 }
        r3.setText(r1);	 Catch:{ IllegalStateException -> 0x0051 }
        if (r0 == 0) goto L_0x004c;
    L_0x0046:
        r1 = 0;
        r3.setText(r1);	 Catch:{ IllegalStateException -> 0x002e }
        if (r0 != 0) goto L_0x0014;
    L_0x004c:
        return;
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002e }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzab.zzc(android.content.res.Resources, int, int):void");
    }

    private int zzd(int i, int i2, int i3) {
        switch (i) {
            case v.m /*0*/:
                return i2;
            case at.g /*1*/:
                return i3;
            default:
                throw new IllegalStateException("Unknown color scheme: " + i);
        }
    }

    public void zza(Resources resources, int i, int i2) {
        boolean z = i >= 0 && i < 3;
        try {
            zzx.zza(z, "Unknown button size %d", new Object[]{Integer.valueOf(i)});
            z = i2 >= 0 && i2 < 2;
            zzx.zza(z, "Unknown color scheme %s", new Object[]{Integer.valueOf(i2)});
            zza(resources);
            zzb(resources, i, i2);
            zzc(resources, i, i2);
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }
}
