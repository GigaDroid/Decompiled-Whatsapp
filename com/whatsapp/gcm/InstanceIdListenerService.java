package com.whatsapp.gcm;

import com.google.android.gms.iid.InstanceIDListenerService;

public class InstanceIdListenerService extends InstanceIDListenerService {
    public void onTokenRefresh() {
        RegistrationIntentService.b(this);
    }
}
