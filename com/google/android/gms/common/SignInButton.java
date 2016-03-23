package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzab;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zzg.zza;

public final class SignInButton extends FrameLayout implements OnClickListener {
    private int mColor;
    private int mSize;
    private View zzYB;
    private OnClickListener zzYC;

    public SignInButton(Context context) {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzYC = null;
        setStyle(0, 0);
    }

    private static Button zza(Context context, int i, int i2) {
        Button com_google_android_gms_common_internal_zzab = new zzab(context);
        com_google_android_gms_common_internal_zzab.zza(context.getResources(), i, i2);
        return com_google_android_gms_common_internal_zzab;
    }

    private void zzah(Context context) {
        try {
            if (this.zzYB != null) {
                removeView(this.zzYB);
            }
            try {
                this.zzYB = zzaa.zzb(context, this.mSize, this.mColor);
            } catch (zza e) {
                Log.w("SignInButton", "Sign in button not found, using placeholder instead");
                this.zzYB = zza(context, this.mSize, this.mColor);
            }
            addView(this.zzYB);
            this.zzYB.setEnabled(isEnabled());
            this.zzYB.setOnClickListener(this);
        } catch (zza e2) {
            throw e2;
        }
    }

    public void onClick(View view) {
        try {
            if (this.zzYC == null) {
                return;
            }
            if (view == this.zzYB) {
                this.zzYC.onClick(this);
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2) {
            throw e2;
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.zzYB.setEnabled(z);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        try {
            this.zzYC = onClickListener;
            if (this.zzYB != null) {
                this.zzYB.setOnClickListener(this);
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        }
    }

    public void setStyle(int i, int i2) {
        boolean z = GooglePlayServicesUtil.a;
        boolean z2 = i >= 0 && i < 3;
        try {
            zzx.zza(z2, "Unknown button size %d", new Object[]{Integer.valueOf(i)});
            z2 = i2 >= 0 && i2 < 2;
            zzx.zza(z2, "Unknown color scheme %s", new Object[]{Integer.valueOf(i2)});
            this.mSize = i;
            this.mColor = i2;
            zzah(getContext());
            if (z) {
                com.google.android.gms.common.internal.safeparcel.zza.zza.a++;
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2) {
            throw e2;
        }
    }
}
