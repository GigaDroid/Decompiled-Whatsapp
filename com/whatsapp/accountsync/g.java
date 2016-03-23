package com.whatsapp.accountsync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.content.SyncResult;
import android.os.Bundle;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class g extends AbstractThreadedSyncAdapter {
    private static final String z;
    final ContactsSyncAdapterService a;

    static {
        char[] toCharArray = "\r-}K,\u0006#d\u0016:\u001e2>\u00048\r-e\u000b/\u001d;~\u0006u\u0007,d\u00005\u001al@ \t(\rB(\u0004=\u001b^&".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 110;
                    break;
                case at.g /*1*/:
                    i2 = 66;
                    break;
                case at.i /*2*/:
                    i2 = 16;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        getContext().sendBroadcast(new Intent(z));
    }

    g(ContactsSyncAdapterService contactsSyncAdapterService, Context context, boolean z) {
        this.a = contactsSyncAdapterService;
        super(context, z);
    }
}
