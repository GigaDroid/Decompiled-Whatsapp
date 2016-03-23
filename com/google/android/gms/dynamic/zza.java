package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.zzg;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class zza {
    private LifecycleDelegate zzamN;
    private Bundle zzamO;
    private LinkedList zzamP;
    private final zzf zzamQ;

    class 1 implements zzf {
        final zza zzamR;

        1(zza com_google_android_gms_dynamic_zza) {
            this.zzamR = com_google_android_gms_dynamic_zza;
        }

        public void zza(LifecycleDelegate lifecycleDelegate) {
            boolean z = com.google.android.gms.dynamic.zzd.zza.a;
            zza.zza(this.zzamR, lifecycleDelegate);
            Iterator it = zza.zza(this.zzamR).iterator();
            while (it.hasNext()) {
                ((zza) it.next()).zzb(zza.zzb(this.zzamR));
                if (z) {
                    break;
                }
            }
            zza.zza(this.zzamR).clear();
            zza.zza(this.zzamR, null);
        }
    }

    interface zza {
        int getState();

        void zzb(LifecycleDelegate lifecycleDelegate);
    }

    class 2 implements zza {
        final zza zzamR;
        final Activity zzamS;
        final Bundle zzamT;
        final Bundle zzamU;

        2(zza com_google_android_gms_dynamic_zza, Activity activity, Bundle bundle, Bundle bundle2) {
            this.zzamR = com_google_android_gms_dynamic_zza;
            this.zzamS = activity;
            this.zzamT = bundle;
            this.zzamU = bundle2;
        }

        public int getState() {
            return 0;
        }

        public void zzb(LifecycleDelegate lifecycleDelegate) {
            zza.zzb(this.zzamR).onInflate(this.zzamS, this.zzamT, this.zzamU);
        }
    }

    class 3 implements zza {
        final zza zzamR;
        final Bundle zzamU;

        3(zza com_google_android_gms_dynamic_zza, Bundle bundle) {
            this.zzamR = com_google_android_gms_dynamic_zza;
            this.zzamU = bundle;
        }

        public int getState() {
            return 1;
        }

        public void zzb(LifecycleDelegate lifecycleDelegate) {
            zza.zzb(this.zzamR).onCreate(this.zzamU);
        }
    }

    class 4 implements zza {
        final zza zzamR;
        final Bundle zzamU;
        final FrameLayout zzamV;
        final LayoutInflater zzamW;
        final ViewGroup zzamX;

        4(zza com_google_android_gms_dynamic_zza, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.zzamR = com_google_android_gms_dynamic_zza;
            this.zzamV = frameLayout;
            this.zzamW = layoutInflater;
            this.zzamX = viewGroup;
            this.zzamU = bundle;
        }

        public int getState() {
            return 2;
        }

        public void zzb(LifecycleDelegate lifecycleDelegate) {
            this.zzamV.removeAllViews();
            this.zzamV.addView(zza.zzb(this.zzamR).onCreateView(this.zzamW, this.zzamX, this.zzamU));
        }
    }

    final class 5 implements OnClickListener {
        final int zzamY;
        final Context zzrn;

        5(Context context, int i) {
            this.zzrn = context;
            this.zzamY = i;
        }

        public void onClick(View view) {
            this.zzrn.startActivity(GooglePlayServicesUtil.zzbc(this.zzamY));
        }
    }

    class 7 implements zza {
        final zza zzamR;

        7(zza com_google_android_gms_dynamic_zza) {
            this.zzamR = com_google_android_gms_dynamic_zza;
        }

        public int getState() {
            return 5;
        }

        public void zzb(LifecycleDelegate lifecycleDelegate) {
            zza.zzb(this.zzamR).onResume();
        }
    }

    public zza() {
        this.zzamQ = new 1(this);
    }

    static Bundle zza(zza com_google_android_gms_dynamic_zza, Bundle bundle) {
        com_google_android_gms_dynamic_zza.zzamO = bundle;
        return bundle;
    }

    static LifecycleDelegate zza(zza com_google_android_gms_dynamic_zza, LifecycleDelegate lifecycleDelegate) {
        com_google_android_gms_dynamic_zza.zzamN = lifecycleDelegate;
        return lifecycleDelegate;
    }

    static LinkedList zza(zza com_google_android_gms_dynamic_zza) {
        return com_google_android_gms_dynamic_zza.zzamP;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void zza(android.os.Bundle r2, com.google.android.gms.dynamic.zza.zza r3) {
        /*
        r1 = this;
        r0 = r1.zzamN;	 Catch:{ zza -> 0x000a }
        if (r0 == 0) goto L_0x000c;
    L_0x0004:
        r0 = r1.zzamN;	 Catch:{ zza -> 0x000a }
        r3.zzb(r0);	 Catch:{ zza -> 0x000a }
    L_0x0009:
        return;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r0 = r1.zzamP;	 Catch:{ zza -> 0x0039 }
        if (r0 != 0) goto L_0x0017;
    L_0x0010:
        r0 = new java.util.LinkedList;	 Catch:{ zza -> 0x0039 }
        r0.<init>();	 Catch:{ zza -> 0x0039 }
        r1.zzamP = r0;	 Catch:{ zza -> 0x0039 }
    L_0x0017:
        r0 = r1.zzamP;	 Catch:{ zza -> 0x003b }
        r0.add(r3);	 Catch:{ zza -> 0x003b }
        if (r2 == 0) goto L_0x0033;
    L_0x001e:
        r0 = r1.zzamO;	 Catch:{ zza -> 0x003d }
        if (r0 != 0) goto L_0x002e;
    L_0x0022:
        r0 = r2.clone();	 Catch:{ zza -> 0x003f }
        r0 = (android.os.Bundle) r0;	 Catch:{ zza -> 0x003f }
        r1.zzamO = r0;	 Catch:{ zza -> 0x003f }
        r0 = com.google.android.gms.dynamic.zzd.zza.a;	 Catch:{ zza -> 0x003f }
        if (r0 == 0) goto L_0x0033;
    L_0x002e:
        r0 = r1.zzamO;	 Catch:{ zza -> 0x003f }
        r0.putAll(r2);	 Catch:{ zza -> 0x003f }
    L_0x0033:
        r0 = r1.zzamQ;
        r1.zza(r0);
        goto L_0x0009;
    L_0x0039:
        r0 = move-exception;
        throw r0;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ zza -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ zza -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.zza.zza(android.os.Bundle, com.google.android.gms.dynamic.zza$zza):void");
    }

    static LifecycleDelegate zzb(zza com_google_android_gms_dynamic_zza) {
        return com_google_android_gms_dynamic_zza.zzamN;
    }

    public static void zzb(FrameLayout frameLayout) {
        boolean z = com.google.android.gms.dynamic.zzd.zza.a;
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        CharSequence zzb = zzg.zzb(context, isGooglePlayServicesAvailable, GooglePlayServicesUtil.zzaf(context));
        CharSequence zzh = zzg.zzh(context, isGooglePlayServicesAvailable);
        View linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        View textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(zzb);
        linearLayout.addView(textView);
        if (zzh != null) {
            View button = new Button(context);
            button.setLayoutParams(new LayoutParams(-2, -2));
            button.setText(zzh);
            linearLayout.addView(button);
            button.setOnClickListener(new 5(context, isGooglePlayServicesAvailable));
        }
        if (z) {
            com.google.android.gms.common.internal.safeparcel.zza.zza.a++;
        }
    }

    private void zzei(int i) {
        boolean z = com.google.android.gms.dynamic.zzd.zza.a;
        while (!this.zzamP.isEmpty()) {
            try {
                if (((zza) this.zzamP.getLast()).getState() >= i) {
                    this.zzamP.removeLast();
                    if (z) {
                        return;
                    }
                }
                return;
            } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
                throw e;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        zza(bundle, new 3(this, bundle));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = com.google.android.gms.dynamic.zzd.zza.a;
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        try {
            zza(bundle, new 4(this, frameLayout, layoutInflater, viewGroup, bundle));
            if (this.zzamN == null) {
                zza(frameLayout);
            }
            try {
                if (com.google.android.gms.common.internal.safeparcel.zza.zza.a != 0) {
                    com.google.android.gms.dynamic.zzd.zza.a = !z;
                }
                return frameLayout;
            } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
                throw e;
            } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2) {
                throw e2;
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e22) {
            throw e22;
        }
    }

    public void onDestroy() {
        try {
            if (this.zzamN != null) {
                this.zzamN.onDestroy();
                if (!com.google.android.gms.dynamic.zzd.zza.a) {
                    return;
                }
            }
            zzei(1);
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2) {
            throw e2;
        }
    }

    public void onDestroyView() {
        try {
            if (this.zzamN != null) {
                this.zzamN.onDestroyView();
                if (!com.google.android.gms.dynamic.zzd.zza.a) {
                    return;
                }
            }
            zzei(2);
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2) {
            throw e2;
        }
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        zza(bundle2, new 2(this, activity, bundle, bundle2));
    }

    public void onLowMemory() {
        try {
            if (this.zzamN != null) {
                this.zzamN.onLowMemory();
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        }
    }

    public void onPause() {
        try {
            if (this.zzamN != null) {
                this.zzamN.onPause();
                if (!com.google.android.gms.dynamic.zzd.zza.a) {
                    return;
                }
            }
            zzei(5);
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
            throw e;
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2) {
            throw e2;
        }
    }

    public void onResume() {
        zza(null, new 7(this));
    }

    public void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.zzamN != null) {
                this.zzamN.onSaveInstanceState(bundle);
                if (!com.google.android.gms.dynamic.zzd.zza.a) {
                    return;
                }
            }
            try {
                if (this.zzamO != null) {
                    bundle.putAll(this.zzamO);
                }
            } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e) {
                throw e;
            }
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e2) {
            throw e2;
        } catch (com.google.android.gms.common.internal.safeparcel.zza.zza e22) {
            throw e22;
        }
    }

    protected void zza(FrameLayout frameLayout) {
        zzb(frameLayout);
    }

    protected abstract void zza(zzf com_google_android_gms_dynamic_zzf);

    public LifecycleDelegate zzrn() {
        return this.zzamN;
    }
}
