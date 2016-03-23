package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import java.util.List;

public interface NodeApi {

    public interface GetConnectedNodesResult extends Result {
        List getNodes();
    }

    public interface NodeListener {
        void onPeerConnected(Node node);

        void onPeerDisconnected(Node node);
    }

    public interface zza {
        void onConnectedNodes(List list);
    }

    PendingResult getConnectedNodes(GoogleApiClient googleApiClient);
}
