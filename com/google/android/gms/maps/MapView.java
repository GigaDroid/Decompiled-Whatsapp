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
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class MapView extends FrameLayout {
    public static int a;
    private GoogleMap zzaFV;
    private final zzb zzaGb;

    class zza implements MapLifecycleDelegate {
        private final ViewGroup zzaGc;
        private final IMapViewDelegate zzaGd;
        private View zzaGe;

        class 1 extends com.google.android.gms.maps.internal.zzl.zza {
            final OnMapReadyCallback zzaFX;
            final zza zzaGf;

            1(zza com_google_android_gms_maps_MapView_zza, OnMapReadyCallback onMapReadyCallback) {
                this.zzaGf = com_google_android_gms_maps_MapView_zza;
                this.zzaFX = onMapReadyCallback;
            }

            public void zza(IGoogleMapDelegate iGoogleMapDelegate) {
                this.zzaFX.onMapReady(new GoogleMap(iGoogleMapDelegate));
            }
        }

        public zza(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
            this.zzaGd = (IMapViewDelegate) zzx.zzv(iMapViewDelegate);
            this.zzaGc = (ViewGroup) zzx.zzv(viewGroup);
        }

        public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            try {
                this.zzaGd.getMapAsync(new 1(this, onMapReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onCreate(Bundle bundle) {
            try {
                this.zzaGd.onCreate(bundle);
                this.zzaGe = (View) zze.zzp(this.zzaGd.getView());
                this.zzaGc.removeAllViews();
                this.zzaGc.addView(this.zzaGe);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public void onDestroy() {
            try {
                this.zzaGd.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public void onLowMemory() {
            try {
                this.zzaGd.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.zzaGd.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.zzaGd.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.zzaGd.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public IMapViewDelegate zzwQ() {
            return this.zzaGd;
        }
    }

    class zzb extends com.google.android.gms.dynamic.zza {
        private final Context mContext;
        protected zzf zzaFZ;
        private final List zzaGa;
        private final ViewGroup zzaGg;
        private final GoogleMapOptions zzaGh;

        zzb(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.zzaGa = new ArrayList();
            this.zzaGg = viewGroup;
            this.mContext = context;
            this.zzaGh = googleMapOptions;
        }

        public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            try {
                if (zzrn() != null) {
                    ((zza) zzrn()).getMapAsync(onMapReadyCallback);
                    if (MapView.a == 0) {
                        return;
                    }
                }
                this.zzaGa.add(onMapReadyCallback);
            } catch (RuntimeRemoteException e) {
                throw e;
            } catch (RuntimeRemoteException e2) {
                throw e2;
            }
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
                        MapsInitializer.initialize(this.mContext);
                        IMapViewDelegate zza = zzy.zzaF(this.mContext).zza(zze.zzx(this.mContext), this.zzaGh);
                        if (zza != null) {
                            this.zzaFZ.zza(new zza(this.zzaGg, zza));
                            for (OnMapReadyCallback mapAsync : this.zzaGa) {
                                ((zza) zzrn()).getMapAsync(mapAsync);
                                if (i != 0) {
                                    break;
                                }
                            }
                            this.zzaGa.clear();
                        }
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

    public MapView(Context context) {
        super(context);
        this.zzaGb = new zzb(this, context, null);
        init();
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzaGb = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        init();
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzaGb = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        init();
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.zzaGb = new zzb(this, context, googleMapOptions);
        init();
    }

    private void init() {
        setClickable(true);
    }

    @Deprecated
    public final GoogleMap getMap() {
        try {
            if (this.zzaFV != null) {
                return this.zzaFV;
            }
            try {
                this.zzaGb.zzwP();
                if (this.zzaGb.zzrn() == null) {
                    return null;
                }
                try {
                    this.zzaFV = new GoogleMap(((zza) this.zzaGb.zzrn()).zzwQ().getMap());
                    return this.zzaFV;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (RemoteException e2) {
                throw e2;
            }
        } catch (RemoteException e22) {
            throw e22;
        }
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        zzx.zzch("getMapAsync() must be called on the main thread");
        this.zzaGb.getMapAsync(onMapReadyCallback);
    }

    public final void onCreate(Bundle bundle) {
        try {
            this.zzaGb.onCreate(bundle);
            if (this.zzaGb.zzrn() == null) {
                com.google.android.gms.dynamic.zza.zzb((FrameLayout) this);
            }
        } catch (RuntimeRemoteException e) {
            throw e;
        }
    }

    public final void onDestroy() {
        this.zzaGb.onDestroy();
    }

    public final void onLowMemory() {
        this.zzaGb.onLowMemory();
    }

    public final void onPause() {
        this.zzaGb.onPause();
    }

    public final void onResume() {
        this.zzaGb.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.zzaGb.onSaveInstanceState(bundle);
    }
}
