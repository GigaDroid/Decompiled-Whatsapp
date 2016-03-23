package com.google.android.gms.location;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface FusedLocationProviderApi {
    Location getLastLocation(GoogleApiClient googleApiClient);

    PendingResult removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener);

    PendingResult requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener);
}
