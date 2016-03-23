package com.google.android.gms.maps;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;

public class StreetViewPanorama {
    private final IStreetViewPanoramaDelegate zzaGj;

    protected StreetViewPanorama(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
        this.zzaGj = (IStreetViewPanoramaDelegate) zzx.zzv(iStreetViewPanoramaDelegate);
    }
}
