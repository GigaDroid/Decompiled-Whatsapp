package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzx;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zzp extends Fragment implements OnCancelListener {
    private boolean mStarted;
    private boolean zzaaJ;
    private int zzaaK;
    private ConnectionResult zzaaL;
    private final Handler zzaaM;
    private final SparseArray zzaaN;

    class zza implements OnConnectionFailedListener {
        public final int zzaaO;
        public final GoogleApiClient zzaaP;
        public final OnConnectionFailedListener zzaaQ;
        final zzp zzaaR;

        public zza(zzp com_google_android_gms_common_api_zzp, int i, GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
            this.zzaaR = com_google_android_gms_common_api_zzp;
            this.zzaaO = i;
            this.zzaaP = googleApiClient;
            this.zzaaQ = onConnectionFailedListener;
            googleApiClient.registerConnectionFailedListener(this);
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.append(str).append("GoogleApiClient #").print(this.zzaaO);
            printWriter.println(":");
            this.zzaaP.dump(str + "  ", fileDescriptor, printWriter, strArr);
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            zzp.zzd(this.zzaaR).post(new zzb(this.zzaaR, this.zzaaO, connectionResult));
        }

        public void zznK() {
            this.zzaaP.unregisterConnectionFailedListener(this);
            this.zzaaP.disconnect();
        }
    }

    class zzb implements Runnable {
        final zzp zzaaR;
        private final int zzaaS;
        private final ConnectionResult zzaaT;

        public zzb(zzp com_google_android_gms_common_api_zzp, int i, ConnectionResult connectionResult) {
            this.zzaaR = com_google_android_gms_common_api_zzp;
            this.zzaaS = i;
            this.zzaaT = connectionResult;
        }

        public void run() {
            boolean z = Api.a;
            try {
                if (zzp.zza(this.zzaaR) && !zzp.zzb(this.zzaaR)) {
                    zzp.zza(this.zzaaR, true);
                    zzp.zza(this.zzaaR, this.zzaaS);
                    zzp.zza(this.zzaaR, this.zzaaT);
                    if (this.zzaaT.hasResolution()) {
                        try {
                            this.zzaaT.startResolutionForResult(this.zzaaR.getActivity(), ((this.zzaaR.getActivity().getSupportFragmentManager().getFragments().indexOf(this.zzaaR) + 1) << 16) + 1);
                            return;
                        } catch (SendIntentException e) {
                            try {
                                zzp.zzc(this.zzaaR);
                                if (!z) {
                                    return;
                                }
                            } catch (SendIntentException e2) {
                                throw e2;
                            } catch (SendIntentException e22) {
                                throw e22;
                            }
                        }
                    }
                    if (GooglePlayServicesUtil.isUserRecoverableError(this.zzaaT.getErrorCode())) {
                        try {
                            GooglePlayServicesUtil.showErrorDialogFragment(this.zzaaT.getErrorCode(), this.zzaaR.getActivity(), this.zzaaR, 2, this.zzaaR);
                            if (!z) {
                                return;
                            }
                        } catch (SendIntentException e222) {
                            throw e222;
                        }
                    }
                    zzp.zza(this.zzaaR, this.zzaaS, this.zzaaT);
                }
            } catch (SendIntentException e2222) {
                throw e2222;
            } catch (SendIntentException e22222) {
                throw e22222;
            }
        }
    }

    public zzp() {
        this.zzaaK = -1;
        this.zzaaM = new Handler(Looper.getMainLooper());
        this.zzaaN = new SparseArray();
    }

    static int zza(zzp com_google_android_gms_common_api_zzp, int i) {
        com_google_android_gms_common_api_zzp.zzaaK = i;
        return i;
    }

    static ConnectionResult zza(zzp com_google_android_gms_common_api_zzp, ConnectionResult connectionResult) {
        com_google_android_gms_common_api_zzp.zzaaL = connectionResult;
        return connectionResult;
    }

    public static zzp zza(FragmentActivity fragmentActivity) {
        zzx.zzch("Must be called from main thread of process");
        try {
            zzp com_google_android_gms_common_api_zzp = (zzp) fragmentActivity.getSupportFragmentManager().findFragmentByTag("GmsSupportLifecycleFragment");
            if (com_google_android_gms_common_api_zzp != null) {
                try {
                    if (!com_google_android_gms_common_api_zzp.isRemoving()) {
                        return com_google_android_gms_common_api_zzp;
                    }
                } catch (ClassCastException e) {
                    throw e;
                }
            }
            return null;
        } catch (Throwable e2) {
            throw new IllegalStateException("Fragment with tag GmsSupportLifecycleFragment is not a SupportLifecycleFragment", e2);
        }
    }

    private void zza(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        zza com_google_android_gms_common_api_zzp_zza = (zza) this.zzaaN.get(i);
        if (com_google_android_gms_common_api_zzp_zza != null) {
            zzbi(i);
            OnConnectionFailedListener onConnectionFailedListener = com_google_android_gms_common_api_zzp_zza.zzaaQ;
            if (onConnectionFailedListener != null) {
                try {
                    onConnectionFailedListener.onConnectionFailed(connectionResult);
                } catch (ClassCastException e) {
                    throw e;
                }
            }
        }
        zznJ();
    }

    static void zza(zzp com_google_android_gms_common_api_zzp, int i, ConnectionResult connectionResult) {
        com_google_android_gms_common_api_zzp.zza(i, connectionResult);
    }

    static boolean zza(zzp com_google_android_gms_common_api_zzp) {
        return com_google_android_gms_common_api_zzp.mStarted;
    }

    static boolean zza(zzp com_google_android_gms_common_api_zzp, boolean z) {
        com_google_android_gms_common_api_zzp.zzaaJ = z;
        return z;
    }

    public static zzp zzb(FragmentActivity fragmentActivity) {
        zzp zza = zza(fragmentActivity);
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        if (zza != null) {
            return zza;
        }
        Fragment com_google_android_gms_common_api_zzp = new zzp();
        supportFragmentManager.beginTransaction().add(com_google_android_gms_common_api_zzp, "GmsSupportLifecycleFragment").commitAllowingStateLoss();
        supportFragmentManager.executePendingTransactions();
        return com_google_android_gms_common_api_zzp;
    }

    static boolean zzb(zzp com_google_android_gms_common_api_zzp) {
        return com_google_android_gms_common_api_zzp.zzaaJ;
    }

    static void zzc(zzp com_google_android_gms_common_api_zzp) {
        com_google_android_gms_common_api_zzp.zznJ();
    }

    static Handler zzd(zzp com_google_android_gms_common_api_zzp) {
        return com_google_android_gms_common_api_zzp.zzaaM;
    }

    private void zznJ() {
        boolean z = Api.a;
        this.zzaaJ = false;
        this.zzaaK = -1;
        this.zzaaL = null;
        int i = 0;
        while (i < this.zzaaN.size()) {
            ((zza) this.zzaaN.valueAt(i)).zzaaP.connect();
            int i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z = Api.a;
        super.dump(str, fileDescriptor, printWriter, strArr);
        int i = 0;
        while (i < this.zzaaN.size()) {
            ((zza) this.zzaaN.valueAt(i)).dump(str, fileDescriptor, printWriter, strArr);
            int i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
        r4 = this;
        r0 = 1;
        r2 = com.google.android.gms.common.api.Api.a;
        r1 = 0;
        switch(r5) {
            case 1: goto L_0x0024;
            case 2: goto L_0x0017;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = r1;
    L_0x0008:
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        r4.zznJ();	 Catch:{ ClassCastException -> 0x002a }
        if (r2 == 0) goto L_0x0016;
    L_0x000f:
        r0 = r4.zzaaK;	 Catch:{ ClassCastException -> 0x002a }
        r1 = r4.zzaaL;	 Catch:{ ClassCastException -> 0x002a }
        r4.zza(r0, r1);	 Catch:{ ClassCastException -> 0x002a }
    L_0x0016:
        return;
    L_0x0017:
        r3 = r4.getActivity();	 Catch:{ ClassCastException -> 0x0028 }
        r3 = com.google.android.gms.common.GooglePlayServicesUtil.isGooglePlayServicesAvailable(r3);	 Catch:{ ClassCastException -> 0x0028 }
        if (r3 != 0) goto L_0x0007;
    L_0x0021:
        if (r2 == 0) goto L_0x0008;
    L_0x0023:
        r1 = r0;
    L_0x0024:
        r3 = -1;
        if (r6 != r3) goto L_0x0007;
    L_0x0027:
        goto L_0x0008;
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzp.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCancel(DialogInterface dialogInterface) {
        zza(this.zzaaK, new ConnectionResult(13, null));
    }

    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            if (bundle != null) {
                this.zzaaJ = bundle.getBoolean("resolving_error", false);
                this.zzaaK = bundle.getInt("failed_client_id", -1);
                if (this.zzaaK >= 0) {
                    this.zzaaL = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution"));
                }
            }
        } catch (ClassCastException e) {
            throw e;
        } catch (ClassCastException e2) {
            throw e2;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        try {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean("resolving_error", this.zzaaJ);
            if (this.zzaaK >= 0) {
                bundle.putInt("failed_client_id", this.zzaaK);
                bundle.putInt("failed_status", this.zzaaL.getErrorCode());
                bundle.putParcelable("failed_resolution", this.zzaaL.getResolution());
            }
        } catch (ClassCastException e) {
            throw e;
        }
    }

    public void onStart() {
        boolean z = Api.a;
        super.onStart();
        this.mStarted = true;
        if (!this.zzaaJ) {
            int i = 0;
            while (i < this.zzaaN.size()) {
                ((zza) this.zzaaN.valueAt(i)).zzaaP.connect();
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public void onStop() {
        boolean z = Api.a;
        super.onStop();
        this.mStarted = false;
        int i = 0;
        while (i < this.zzaaN.size()) {
            ((zza) this.zzaaN.valueAt(i)).zzaaP.disconnect();
            int i2 = i + 1;
            if (!z) {
                i = i2;
            } else {
                return;
            }
        }
    }

    public void zza(int i, GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
        try {
            zzx.zzb((Object) googleApiClient, (Object) "GoogleApiClient instance cannot be null");
            zzx.zza(this.zzaaN.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
            try {
                this.zzaaN.put(i, new zza(this, i, googleApiClient, onConnectionFailedListener));
                if (!this.mStarted) {
                    return;
                }
                if (!this.zzaaJ) {
                    googleApiClient.connect();
                }
            } catch (ClassCastException e) {
                throw e;
            } catch (ClassCastException e2) {
                throw e2;
            }
        } catch (ClassCastException e22) {
            throw e22;
        }
    }

    public void zzbi(int i) {
        zza com_google_android_gms_common_api_zzp_zza = (zza) this.zzaaN.get(i);
        try {
            this.zzaaN.remove(i);
            if (com_google_android_gms_common_api_zzp_zza != null) {
                com_google_android_gms_common_api_zzp_zza.zznK();
            }
        } catch (ClassCastException e) {
            throw e;
        }
    }
}
