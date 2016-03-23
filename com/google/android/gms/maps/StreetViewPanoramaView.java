package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaView extends FrameLayout {
    private final zzb zzaGC;

    class zza implements StreetViewLifecycleDelegate {
        private final IStreetViewPanoramaViewDelegate zzaGD;
        private View zzaGE;
        private final ViewGroup zzaGc;

        class 1 extends com.google.android.gms.maps.internal.zzv.zza {
            final zza zzaGF;
            final OnStreetViewPanoramaReadyCallback zzaGs;

            1(zza com_google_android_gms_maps_StreetViewPanoramaView_zza, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
                this.zzaGF = com_google_android_gms_maps_StreetViewPanoramaView_zza;
                this.zzaGs = onStreetViewPanoramaReadyCallback;
            }

            public void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
                this.zzaGs.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
            }
        }

        public zza(ViewGroup viewGroup, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
            this.zzaGD = (IStreetViewPanoramaViewDelegate) zzx.zzv(iStreetViewPanoramaViewDelegate);
            this.zzaGc = (ViewGroup) zzx.zzv(viewGroup);
        }

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.zzaGD.getStreetViewPanoramaAsync(new 1(this, onStreetViewPanoramaReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onCreate(Bundle bundle) {
            try {
                this.zzaGD.onCreate(bundle);
                this.zzaGE = (View) zze.zzp(this.zzaGD.getView());
                this.zzaGc.removeAllViews();
                this.zzaGc.addView(this.zzaGE);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onDestroy() {
            try {
                this.zzaGD.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onLowMemory() {
            try {
                this.zzaGD.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.zzaGD.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.zzaGD.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.zzaGD.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    class zzb extends com.google.android.gms.dynamic.zza {
        private final Context mContext;
        protected zzf zzaFZ;
        private final StreetViewPanoramaOptions zzaGG;
        private final ViewGroup zzaGg;
        private final List zzaGu;

        zzb(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.zzaGu = new ArrayList();
            this.zzaGg = viewGroup;
            this.mContext = context;
            this.zzaGG = streetViewPanoramaOptions;
        }

        protected void zza(zzf com_google_android_gms_dynamic_zzf) {
            this.zzaFZ = com_google_android_gms_dynamic_zzf;
            zzwP();
        }

        public void zzwP() {
            int i = MapView.a;
            try {
                if (this.zzaFZ != null && zzrn() == null) {
                    try {
                        this.zzaFZ.zza(new zza(this.zzaGg, zzy.zzaF(this.mContext).zza(zze.zzx(this.mContext), this.zzaGG)));
                        for (OnStreetViewPanoramaReadyCallback streetViewPanoramaAsync : this.zzaGu) {
                            ((zza) zzrn()).getStreetViewPanoramaAsync(streetViewPanoramaAsync);
                            if (i != 0) {
                                break;
                            }
                        }
                        this.zzaGu.clear();
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    } catch (GooglePlayServicesNotAvailableException e2) {
                    }
                }
            } catch (RemoteException e3) {
                throw e3;
            }
        }
    }

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.zzaGC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzaGC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzaGC = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.zzaGC = new zzb(this, context, streetViewPanoramaOptions);
    }
}
