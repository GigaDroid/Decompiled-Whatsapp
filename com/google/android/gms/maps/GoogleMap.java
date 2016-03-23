package com.google.android.gms.maps;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.zze;
import com.google.android.gms.maps.internal.zzg;
import com.google.android.gms.maps.internal.zzi;
import com.google.android.gms.maps.internal.zzm.zza;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.internal.zzf;

public final class GoogleMap {
    public static int a;
    private final IGoogleMapDelegate zzaFp;
    private UiSettings zzaFq;

    class 10 extends zza {
        final OnMarkerClickListener zzaFD;
        final GoogleMap zzaFs;

        10(GoogleMap googleMap, OnMarkerClickListener onMarkerClickListener) {
            this.zzaFs = googleMap;
            this.zzaFD = onMarkerClickListener;
        }

        public boolean zza(zzf com_google_android_gms_maps_model_internal_zzf) {
            return this.zzaFD.onMarkerClick(new Marker(com_google_android_gms_maps_model_internal_zzf));
        }
    }

    class 12 extends zzg.zza {
        final OnInfoWindowClickListener zzaFF;
        final GoogleMap zzaFs;

        12(GoogleMap googleMap, OnInfoWindowClickListener onInfoWindowClickListener) {
            this.zzaFs = googleMap;
            this.zzaFF = onInfoWindowClickListener;
        }

        public void zze(zzf com_google_android_gms_maps_model_internal_zzf) {
            this.zzaFF.onInfoWindowClick(new Marker(com_google_android_gms_maps_model_internal_zzf));
        }
    }

    class 7 extends zze.zza {
        final OnCameraChangeListener zzaFA;
        final GoogleMap zzaFs;

        7(GoogleMap googleMap, OnCameraChangeListener onCameraChangeListener) {
            this.zzaFs = googleMap;
            this.zzaFA = onCameraChangeListener;
        }

        public void onCameraChange(CameraPosition cameraPosition) {
            this.zzaFA.onCameraChange(cameraPosition);
        }
    }

    class 8 extends zzi.zza {
        final OnMapClickListener zzaFB;
        final GoogleMap zzaFs;

        8(GoogleMap googleMap, OnMapClickListener onMapClickListener) {
            this.zzaFs = googleMap;
            this.zzaFB = onMapClickListener;
        }

        public void onMapClick(LatLng latLng) {
            this.zzaFB.onMapClick(latLng);
        }
    }

    public interface OnCameraChangeListener {
        void onCameraChange(CameraPosition cameraPosition);
    }

    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(Marker marker);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    protected GoogleMap(IGoogleMapDelegate iGoogleMapDelegate) {
        this.zzaFp = (IGoogleMapDelegate) zzx.zzv(iGoogleMapDelegate);
    }

    public final Marker addMarker(MarkerOptions markerOptions) {
        try {
            zzf addMarker = this.zzaFp.addMarker(markerOptions);
            return addMarker != null ? new Marker(addMarker) : null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(CameraUpdate cameraUpdate) {
        try {
            this.zzaFp.animateCamera(cameraUpdate.zzwB());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void clear() {
        try {
            this.zzaFp.clear();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final CameraPosition getCameraPosition() {
        try {
            return this.zzaFp.getCameraPosition();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Deprecated
    public final Location getMyLocation() {
        try {
            return this.zzaFp.getMyLocation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final Projection getProjection() {
        try {
            return new Projection(this.zzaFp.getProjection());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final UiSettings getUiSettings() {
        try {
            if (this.zzaFq == null) {
                this.zzaFq = new UiSettings(this.zzaFp.getUiSettings());
            }
            return this.zzaFq;
        } catch (RemoteException e) {
            throw e;
        } catch (RemoteException e2) {
            throw new RuntimeRemoteException(e2);
        }
    }

    public final boolean isMyLocationEnabled() {
        try {
            return this.zzaFp.isMyLocationEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return this.zzaFp.isTrafficEnabled();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void moveCamera(CameraUpdate cameraUpdate) {
        try {
            this.zzaFp.moveCamera(cameraUpdate.zzwB());
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean setIndoorEnabled(boolean z) {
        try {
            return this.zzaFp.setIndoorEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMapType(int i) {
        try {
            this.zzaFp.setMapType(i);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationEnabled(boolean z) {
        try {
            this.zzaFp.setMyLocationEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraChangeListener(OnCameraChangeListener onCameraChangeListener) {
        if (onCameraChangeListener == null) {
            try {
                this.zzaFp.setOnCameraChangeListener(null);
                if (MapView.a == 0) {
                    return;
                }
            } catch (RemoteException e) {
                throw e;
            } catch (RemoteException e2) {
                try {
                    throw e2;
                } catch (RemoteException e22) {
                    throw new RuntimeRemoteException(e22);
                }
            }
        }
        this.zzaFp.setOnCameraChangeListener(new 7(this, onCameraChangeListener));
    }

    public final void setOnInfoWindowClickListener(OnInfoWindowClickListener onInfoWindowClickListener) {
        if (onInfoWindowClickListener == null) {
            try {
                this.zzaFp.setOnInfoWindowClickListener(null);
                if (MapView.a == 0) {
                    return;
                }
            } catch (RemoteException e) {
                throw e;
            } catch (RemoteException e2) {
                try {
                    throw e2;
                } catch (RemoteException e22) {
                    throw new RuntimeRemoteException(e22);
                }
            }
        }
        this.zzaFp.setOnInfoWindowClickListener(new 12(this, onInfoWindowClickListener));
    }

    public final void setOnMapClickListener(OnMapClickListener onMapClickListener) {
        if (onMapClickListener == null) {
            try {
                this.zzaFp.setOnMapClickListener(null);
                if (MapView.a == 0) {
                    return;
                }
            } catch (RemoteException e) {
                throw e;
            } catch (RemoteException e2) {
                try {
                    throw e2;
                } catch (RemoteException e22) {
                    throw new RuntimeRemoteException(e22);
                }
            }
        }
        this.zzaFp.setOnMapClickListener(new 8(this, onMapClickListener));
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        if (onMarkerClickListener == null) {
            try {
                this.zzaFp.setOnMarkerClickListener(null);
                if (MapView.a == 0) {
                    return;
                }
            } catch (RemoteException e) {
                throw e;
            } catch (RemoteException e2) {
                try {
                    throw e2;
                } catch (RemoteException e22) {
                    throw new RuntimeRemoteException(e22);
                }
            }
        }
        this.zzaFp.setOnMarkerClickListener(new 10(this, onMarkerClickListener));
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        try {
            this.zzaFp.setPadding(i, i2, i3, i4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void setTrafficEnabled(boolean z) {
        try {
            this.zzaFp.setTrafficEnabled(z);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void stopAnimation() {
        try {
            this.zzaFp.stopAnimation();
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
