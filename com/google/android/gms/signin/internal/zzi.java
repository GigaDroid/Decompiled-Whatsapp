package com.google.android.gms.signin.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.ServerAuthCodeCallbacks.CheckResult;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.signin.zzd;
import com.google.android.gms.signin.zze;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public class zzi extends zzj implements zzd {
    private final zzf zzZH;
    private final boolean zzaOn;
    private final ExecutorService zzaOo;
    private final zze zzade;
    private Integer zzadf;

    class zza extends com.google.android.gms.signin.internal.zzd.zza {
        private final ExecutorService zzaOo;
        private final zze zzade;

        class 1 implements Runnable {
            final List zzaOp;
            final String zzaOq;
            final zzf zzaOr;
            final zza zzaOs;

            1(zza com_google_android_gms_signin_internal_zzi_zza, List list, String str, zzf com_google_android_gms_signin_internal_zzf) {
                this.zzaOs = com_google_android_gms_signin_internal_zzi_zza;
                this.zzaOp = list;
                this.zzaOq = str;
                this.zzaOr = com_google_android_gms_signin_internal_zzf;
            }

            public void run() {
                try {
                    CheckResult onCheckServerAuthorization = zza.zza(this.zzaOs).onCheckServerAuthorization(this.zzaOq, Collections.unmodifiableSet(new HashSet(this.zzaOp)));
                    this.zzaOr.zza(new CheckServerAuthResult(onCheckServerAuthorization.zznl(), onCheckServerAuthorization.zznm()));
                } catch (Throwable e) {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing checkServerAuthorization callback", e);
                }
            }
        }

        class 2 implements Runnable {
            final String zzaOq;
            final zzf zzaOr;
            final zza zzaOs;
            final String zzaOt;

            2(zza com_google_android_gms_signin_internal_zzi_zza, String str, String str2, zzf com_google_android_gms_signin_internal_zzf) {
                this.zzaOs = com_google_android_gms_signin_internal_zzi_zza;
                this.zzaOq = str;
                this.zzaOt = str2;
                this.zzaOr = com_google_android_gms_signin_internal_zzf;
            }

            public void run() {
                try {
                    this.zzaOr.zzaq(zza.zza(this.zzaOs).onUploadServerAuthCode(this.zzaOq, this.zzaOt));
                } catch (Throwable e) {
                    Log.e("SignInClientImpl", "RemoteException thrown when processing uploadServerAuthCode callback", e);
                }
            }
        }

        public zza(zze com_google_android_gms_signin_zze, ExecutorService executorService) {
            this.zzade = com_google_android_gms_signin_zze;
            this.zzaOo = executorService;
        }

        static ServerAuthCodeCallbacks zza(zza com_google_android_gms_signin_internal_zzi_zza) {
            return com_google_android_gms_signin_internal_zzi_zza.zzzq();
        }

        private ServerAuthCodeCallbacks zzzq() {
            return this.zzade.zzzq();
        }

        public void zza(String str, String str2, zzf com_google_android_gms_signin_internal_zzf) {
            this.zzaOo.submit(new 2(this, str, str2, com_google_android_gms_signin_internal_zzf));
        }

        public void zza(String str, List list, zzf com_google_android_gms_signin_internal_zzf) {
            this.zzaOo.submit(new 1(this, list, str, com_google_android_gms_signin_internal_zzf));
        }
    }

    public zzi(Context context, Looper looper, boolean z, zzf com_google_android_gms_common_internal_zzf, zze com_google_android_gms_signin_zze, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, ExecutorService executorService) {
        super(context, looper, 44, com_google_android_gms_common_internal_zzf, connectionCallbacks, onConnectionFailedListener);
        this.zzaOn = z;
        this.zzZH = com_google_android_gms_common_internal_zzf;
        this.zzade = com_google_android_gms_common_internal_zzf.zzoo();
        this.zzadf = com_google_android_gms_common_internal_zzf.zzop();
        this.zzaOo = executorService;
    }

    public static Bundle zza(zze com_google_android_gms_signin_zze, Integer num, ExecutorService executorService) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", com_google_android_gms_signin_zze.zzzo());
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", com_google_android_gms_signin_zze.zzzp());
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", com_google_android_gms_signin_zze.zzlG());
        if (com_google_android_gms_signin_zze.zzzq() != null) {
            bundle.putParcelable("com.google.android.gms.signin.internal.signInCallbacks", new BinderWrapper(new zza(com_google_android_gms_signin_zze, executorService).asBinder()));
        }
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        return bundle;
    }

    public void connect() {
        zza(new zzj.zzf(this));
    }

    protected IInterface zzV(IBinder iBinder) {
        return zzdI(iBinder);
    }

    public void zza(zzp com_google_android_gms_common_internal_zzp, Set set, zze com_google_android_gms_signin_internal_zze) {
        zzx.zzb((Object) com_google_android_gms_signin_internal_zze, (Object) "Expecting a valid ISignInCallbacks");
        try {
            ((zzf) zzoA()).zza(new AuthAccountRequest(com_google_android_gms_common_internal_zzp, set), com_google_android_gms_signin_internal_zze);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when authAccount is called");
            try {
                com_google_android_gms_signin_internal_zze.zza(new ConnectionResult(8, null), new AuthAccountResult());
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onAuthAccount should be executed from the same process, unexpected RemoteException.");
            }
        }
    }

    public void zza(zzp com_google_android_gms_common_internal_zzp, boolean z) {
        try {
            ((zzf) zzoA()).zza(com_google_android_gms_common_internal_zzp, this.zzadf.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public void zza(zzt com_google_android_gms_common_internal_zzt) {
        zzx.zzb((Object) com_google_android_gms_common_internal_zzt, (Object) "Expecting a valid IResolveAccountCallbacks");
        try {
            ((zzf) zzoA()).zza(new ResolveAccountRequest(this.zzZH.zzog(), this.zzadf.intValue()), com_google_android_gms_common_internal_zzt);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when resolveAccount is called");
            try {
                com_google_android_gms_common_internal_zzt.zzb(new ResolveAccountResponse(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "IResolveAccountCallbacks#onAccountResolutionComplete should be executed from the same process, unexpected RemoteException.");
            }
        }
    }

    protected zzf zzdI(IBinder iBinder) {
        return com.google.android.gms.signin.internal.zzf.zza.zzdH(iBinder);
    }

    protected String zzfA() {
        return "com.google.android.gms.signin.service.START";
    }

    protected String zzfB() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    protected Bundle zzli() {
        Bundle zza = zza(this.zzade, this.zzZH.zzop(), this.zzaOo);
        if (!getContext().getPackageName().equals(this.zzZH.zzol())) {
            zza.putString("com.google.android.gms.signin.internal.realClientPackageName", this.zzZH.zzol());
        }
        return zza;
    }

    public boolean zzlm() {
        return this.zzaOn;
    }

    public void zzzn() {
        try {
            ((zzf) zzoA()).zzja(this.zzadf.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }
}
