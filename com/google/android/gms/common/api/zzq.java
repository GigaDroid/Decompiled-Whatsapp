package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzx;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zzq extends Fragment implements OnCancelListener, LoaderCallbacks {
    private boolean zzaaJ;
    private int zzaaK;
    private ConnectionResult zzaaL;
    private final Handler zzaaM;
    private final SparseArray zzaaN;

    class zza extends Loader implements ConnectionCallbacks, OnConnectionFailedListener {
        public final GoogleApiClient zzaaP;
        private boolean zzaaU;
        private ConnectionResult zzaaV;

        public zza(Context context, GoogleApiClient googleApiClient) {
            super(context);
            this.zzaaP = googleApiClient;
        }

        private void zzh(ConnectionResult connectionResult) {
            this.zzaaV = connectionResult;
            if (isStarted() && !isAbandoned()) {
                deliverResult(connectionResult);
            }
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            super.dump(str, fileDescriptor, printWriter, strArr);
            this.zzaaP.dump(str, fileDescriptor, printWriter, strArr);
        }

        public void onConnected(Bundle bundle) {
            this.zzaaU = false;
            zzh(ConnectionResult.zzYi);
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            this.zzaaU = true;
            zzh(connectionResult);
        }

        public void onConnectionSuspended(int i) {
        }

        protected void onReset() {
            this.zzaaV = null;
            this.zzaaU = false;
            this.zzaaP.unregisterConnectionCallbacks(this);
            this.zzaaP.unregisterConnectionFailedListener(this);
            this.zzaaP.disconnect();
        }

        protected void onStartLoading() {
            super.onStartLoading();
            this.zzaaP.registerConnectionCallbacks(this);
            this.zzaaP.registerConnectionFailedListener(this);
            if (this.zzaaV != null) {
                deliverResult(this.zzaaV);
            }
            if (!this.zzaaP.isConnected() && !this.zzaaP.isConnecting() && !this.zzaaU) {
                this.zzaaP.connect();
            }
        }

        protected void onStopLoading() {
            this.zzaaP.disconnect();
        }

        public boolean zznL() {
            return this.zzaaU;
        }
    }

    class zzb {
        public final GoogleApiClient zzaaP;
        public final OnConnectionFailedListener zzaaQ;

        private zzb(GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
            this.zzaaP = googleApiClient;
            this.zzaaQ = onConnectionFailedListener;
        }

        zzb(GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener, 1 1) {
            this(googleApiClient, onConnectionFailedListener);
        }
    }

    class zzc implements Runnable {
        private final int zzaaS;
        private final ConnectionResult zzaaT;
        final zzq zzaaW;

        public zzc(zzq com_google_android_gms_common_api_zzq, int i, ConnectionResult connectionResult) {
            this.zzaaW = com_google_android_gms_common_api_zzq;
            this.zzaaS = i;
            this.zzaaT = connectionResult;
        }

        public void run() {
            boolean z = Api.a;
            if (this.zzaaT.hasResolution()) {
                try {
                    this.zzaaT.startResolutionForResult(this.zzaaW.getActivity(), ((this.zzaaW.getActivity().getSupportFragmentManager().getFragments().indexOf(this.zzaaW) + 1) << 16) + 1);
                    return;
                } catch (SendIntentException e) {
                    try {
                        zzq.zza(this.zzaaW);
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
                    GooglePlayServicesUtil.showErrorDialogFragment(this.zzaaT.getErrorCode(), this.zzaaW.getActivity(), this.zzaaW, 2, this.zzaaW);
                    if (!z) {
                        return;
                    }
                } catch (SendIntentException e222) {
                    throw e222;
                }
            }
            zzq.zza(this.zzaaW, this.zzaaS, this.zzaaT);
        }
    }

    public zzq() {
        this.zzaaK = -1;
        this.zzaaM = new Handler(Looper.getMainLooper());
        this.zzaaN = new SparseArray();
    }

    private void zza(int i, ConnectionResult connectionResult) {
        Log.w("GmsSupportLoaderLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        zzb com_google_android_gms_common_api_zzq_zzb = (zzb) this.zzaaN.get(i);
        if (com_google_android_gms_common_api_zzq_zzb != null) {
            zzbi(i);
            OnConnectionFailedListener onConnectionFailedListener = com_google_android_gms_common_api_zzq_zzb.zzaaQ;
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

    static void zza(zzq com_google_android_gms_common_api_zzq) {
        com_google_android_gms_common_api_zzq.zznJ();
    }

    static void zza(zzq com_google_android_gms_common_api_zzq, int i, ConnectionResult connectionResult) {
        com_google_android_gms_common_api_zzq.zza(i, connectionResult);
    }

    private void zzb(int i, ConnectionResult connectionResult) {
        try {
            if (!this.zzaaJ) {
                this.zzaaJ = true;
                this.zzaaK = i;
                this.zzaaL = connectionResult;
                this.zzaaM.post(new zzc(this, i, connectionResult));
            }
        } catch (ClassCastException e) {
            throw e;
        }
    }

    public static zzq zzc(FragmentActivity fragmentActivity) {
        zzx.zzch("Must be called from main thread of process");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        try {
            zzq com_google_android_gms_common_api_zzq = (zzq) supportFragmentManager.findFragmentByTag("GmsSupportLoaderLifecycleFragment");
            if (com_google_android_gms_common_api_zzq != null) {
                try {
                    if (!com_google_android_gms_common_api_zzq.isRemoving()) {
                        return com_google_android_gms_common_api_zzq;
                    }
                } catch (ClassCastException e) {
                    throw e;
                }
            }
            Fragment com_google_android_gms_common_api_zzq2 = new zzq();
            supportFragmentManager.beginTransaction().add(com_google_android_gms_common_api_zzq2, "GmsSupportLoaderLifecycleFragment").commit();
            supportFragmentManager.executePendingTransactions();
            return com_google_android_gms_common_api_zzq2;
        } catch (Throwable e2) {
            throw new IllegalStateException("Fragment with tag GmsSupportLoaderLifecycleFragment is not a SupportLoaderLifecycleFragment", e2);
        }
    }

    private void zznJ() {
        int i = 0;
        boolean z = Api.a;
        this.zzaaJ = false;
        this.zzaaK = -1;
        this.zzaaL = null;
        LoaderManager loaderManager = getLoaderManager();
        while (i < this.zzaaN.size()) {
            int keyAt = this.zzaaN.keyAt(i);
            zza zzbk = zzbk(keyAt);
            if (zzbk != null) {
                try {
                    if (zzbk.zznL()) {
                        loaderManager.destroyLoader(keyAt);
                        loaderManager.initLoader(keyAt, null, this);
                    }
                } catch (ClassCastException e) {
                    throw e;
                }
            }
            i++;
            if (z) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzq.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttach(android.app.Activity r6) {
        /*
        r5 = this;
        r2 = com.google.android.gms.common.api.Api.a;
        super.onAttach(r6);
        r0 = 0;
        r1 = r0;
    L_0x0007:
        r0 = r5.zzaaN;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x003f;
    L_0x000f:
        r0 = r5.zzaaN;
        r3 = r0.keyAt(r1);
        r4 = r5.zzbk(r3);
        if (r4 == 0) goto L_0x0033;
    L_0x001b:
        r0 = r5.zzaaN;
        r0 = r0.valueAt(r1);
        r0 = (com.google.android.gms.common.api.zzq.zzb) r0;
        r0 = r0.zzaaP;	 Catch:{ ClassCastException -> 0x0040 }
        r4 = r4.zzaaP;	 Catch:{ ClassCastException -> 0x0040 }
        if (r0 == r4) goto L_0x0033;
    L_0x0029:
        r0 = r5.getLoaderManager();	 Catch:{ ClassCastException -> 0x0042 }
        r4 = 0;
        r0.restartLoader(r3, r4, r5);	 Catch:{ ClassCastException -> 0x0042 }
        if (r2 == 0) goto L_0x003b;
    L_0x0033:
        r0 = r5.getLoaderManager();	 Catch:{ ClassCastException -> 0x0042 }
        r4 = 0;
        r0.initLoader(r3, r4, r5);	 Catch:{ ClassCastException -> 0x0042 }
    L_0x003b:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x0044;
    L_0x003f:
        return;
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ ClassCastException -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r1 = r0;
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.zzq.onAttach(android.app.Activity):void");
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

    public Loader onCreateLoader(int i, Bundle bundle) {
        return new zza(getActivity(), ((zzb) this.zzaaN.get(i)).zzaaP);
    }

    public void onLoadFinished(Loader loader, Object obj) {
        zza(loader, (ConnectionResult) obj);
    }

    public void onLoaderReset(Loader loader) {
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
        if (!this.zzaaJ) {
            int i = 0;
            while (i < this.zzaaN.size()) {
                getLoaderManager().initLoader(this.zzaaN.keyAt(i), null, this);
                i++;
                if (z) {
                    return;
                }
            }
        }
    }

    public void zza(int i, GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
        boolean z = false;
        try {
            zzx.zzb((Object) googleApiClient, (Object) "GoogleApiClient instance cannot be null");
            if (this.zzaaN.indexOfKey(i) < 0) {
                z = true;
            }
            zzx.zza(z, "Already managing a GoogleApiClient with id " + i);
            try {
                this.zzaaN.put(i, new zzb(googleApiClient, onConnectionFailedListener, null));
                if (getActivity() != null) {
                    LoaderManager.enableDebugLogging(false);
                    getLoaderManager().initLoader(i, null, this);
                }
            } catch (ClassCastException e) {
                throw e;
            }
        } catch (ClassCastException e2) {
            throw e2;
        }
    }

    public void zza(Loader loader, ConnectionResult connectionResult) {
        try {
            if (!connectionResult.isSuccess()) {
                zzb(loader.getId(), connectionResult);
            }
        } catch (ClassCastException e) {
            throw e;
        }
    }

    public void zzbi(int i) {
        this.zzaaN.remove(i);
        getLoaderManager().destroyLoader(i);
    }

    public GoogleApiClient zzbj(int i) {
        if (getActivity() != null) {
            zza zzbk = zzbk(i);
            if (zzbk != null) {
                try {
                    return zzbk.zzaaP;
                } catch (ClassCastException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    zza zzbk(int i) {
        try {
            return (zza) getLoaderManager().getLoader(i);
        } catch (Throwable e) {
            throw new IllegalStateException("Unknown loader in SupportLoaderLifecycleFragment", e);
        }
    }
}
