package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzf;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.zzy;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class SupportStreetViewPanoramaFragment extends Fragment {
    private final zzb zzaGJ;

    class zza implements StreetViewLifecycleDelegate {
        private final IStreetViewPanoramaFragmentDelegate zzaGr;
        private final Fragment zzadh;

        class 1 extends com.google.android.gms.maps.internal.zzv.zza {
            final zza zzaGK;
            final OnStreetViewPanoramaReadyCallback zzaGs;

            1(zza com_google_android_gms_maps_SupportStreetViewPanoramaFragment_zza, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
                this.zzaGK = com_google_android_gms_maps_SupportStreetViewPanoramaFragment_zza;
                this.zzaGs = onStreetViewPanoramaReadyCallback;
            }

            public void zza(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
                this.zzaGs.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
            }
        }

        public zza(Fragment fragment, IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate) {
            this.zzaGr = (IStreetViewPanoramaFragmentDelegate) zzx.zzv(iStreetViewPanoramaFragmentDelegate);
            this.zzadh = (Fragment) zzx.zzv(fragment);
        }

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.zzaGr.getStreetViewPanoramaAsync(new 1(this, onStreetViewPanoramaReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onCreate(Bundle bundle) {
            if (bundle == null) {
                try {
                    bundle = new Bundle();
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            }
            Bundle arguments = this.zzadh.getArguments();
            if (arguments != null) {
                try {
                    if (arguments.containsKey("StreetViewPanoramaOptions")) {
                        com.google.android.gms.maps.internal.zzx.zza(bundle, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                    }
                } catch (RemoteException e2) {
                    throw e2;
                } catch (RemoteException e22) {
                    throw e22;
                }
            }
            this.zzaGr.onCreate(bundle);
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) zze.zzp(this.zzaGr.onCreateView(zze.zzx(layoutInflater), zze.zzx(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroy() {
            try {
                this.zzaGr.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            try {
                this.zzaGr.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.zzaGr.onInflate(zze.zzx(activity), null, bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onLowMemory() {
            try {
                this.zzaGr.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.zzaGr.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.zzaGr.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.zzaGr.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    class zzb extends com.google.android.gms.dynamic.zza {
        private Activity mActivity;
        protected zzf zzaFZ;
        private final List zzaGu;
        private final Fragment zzadh;

        zzb(Fragment fragment) {
            this.zzaGu = new ArrayList();
            this.zzadh = fragment;
        }

        private void setActivity(Activity activity) {
            this.mActivity = activity;
            zzwP();
        }

        static void zza(zzb com_google_android_gms_maps_SupportStreetViewPanoramaFragment_zzb, Activity activity) {
            com_google_android_gms_maps_SupportStreetViewPanoramaFragment_zzb.setActivity(activity);
        }

        protected void zza(zzf com_google_android_gms_dynamic_zzf) {
            this.zzaFZ = com_google_android_gms_dynamic_zzf;
            zzwP();
        }

        public void zzwP() {
            int i = MapView.a;
            try {
                if (this.mActivity != null && this.zzaFZ != null) {
                    if (zzrn() == null) {
                        try {
                            MapsInitializer.initialize(this.mActivity);
                            this.zzaFZ.zza(new zza(this.zzadh, zzy.zzaF(this.mActivity).zzu(zze.zzx(this.mActivity))));
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
                }
            } catch (RemoteException e3) {
                throw e3;
            } catch (RemoteException e32) {
                throw e32;
            }
        }
    }

    public SupportStreetViewPanoramaFragment() {
        this.zzaGJ = new zzb(this);
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        zzb.zza(this.zzaGJ, activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.zzaGJ.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.zzaGJ.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.zzaGJ.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.zzaGJ.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        zzb.zza(this.zzaGJ, activity);
        this.zzaGJ.onInflate(activity, new Bundle(), bundle);
    }

    public void onLowMemory() {
        this.zzaGJ.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.zzaGJ.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.zzaGJ.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.zzaGJ.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
