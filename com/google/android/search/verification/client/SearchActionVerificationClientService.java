package com.google.android.search.verification.client;

import android.app.IntentService;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Base64;
import android.util.Log;
import com.google.android.search.verification.api.ISearchActionVerificationService;
import com.google.android.search.verification.api.ISearchActionVerificationService.Stub;

public abstract class SearchActionVerificationClientService extends IntentService {
    public static int a;
    private final boolean DBG;
    private final long mConnectionTimeout;
    private ISearchActionVerificationService mIRemoteService;
    private SearchActionVerificationServiceConnection mSearchActionVerificationServiceConnection;
    private final Intent mServiceIntent;

    class SearchActionVerificationServiceConnection implements ServiceConnection {
        final SearchActionVerificationClientService this$0;

        SearchActionVerificationServiceConnection(SearchActionVerificationClientService searchActionVerificationClientService) {
            this.this$0 = searchActionVerificationClientService;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (SearchActionVerificationClientService.access$000(this.this$0)) {
                Log.d("SAVerificationClientS", "onServiceConnected");
            }
            SearchActionVerificationClientService.access$102(this.this$0, Stub.asInterface(iBinder));
        }

        public void onServiceDisconnected(ComponentName componentName) {
            SearchActionVerificationClientService.access$102(this.this$0, null);
            if (SearchActionVerificationClientService.access$000(this.this$0)) {
                Log.d("SAVerificationClientS", "onServiceDisconnected");
            }
        }
    }

    public abstract boolean performAction(Intent intent, boolean z, Bundle bundle);

    private static void logIntentWithExtras(Intent intent) {
        int i = SearchActionVerificationClientActivity.a;
        Log.d("SAVerificationClientS", "Intent:");
        String valueOf = String.valueOf(intent);
        Log.d("SAVerificationClientS", new StringBuilder(String.valueOf(valueOf).length() + 1).append("\t").append(valueOf).toString());
        Bundle extras = intent.getExtras();
        if (extras != null) {
            Log.d("SAVerificationClientS", "Extras:");
            for (String str : extras.keySet()) {
                Log.d("SAVerificationClientS", String.format("\t%s: %s", new Object[]{str, extras.get(str)}));
                if (i != 0) {
                    return;
                }
            }
        }
    }

    private boolean isDebugMode() {
        return isTestingMode() || !"user".equals(Build.TYPE);
    }

    public long getConnectionTimeout() {
        return 1000;
    }

    public final void onDestroy() {
        if (this.DBG) {
            Log.d("SAVerificationClientS", "onDestroy");
        }
        super.onDestroy();
        unbindService(this.mSearchActionVerificationServiceConnection);
    }

    public boolean isTestingMode() {
        return false;
    }

    static boolean access$000(SearchActionVerificationClientService searchActionVerificationClientService) {
        return searchActionVerificationClientService.DBG;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void onHandleIntent(android.content.Intent r15) {
        /*
        r14 = this;
        r3 = 1;
        r2 = 0;
        r4 = com.google.android.search.verification.client.SearchActionVerificationClientActivity.a;
        if (r15 != 0) goto L_0x0018;
    L_0x0006:
        r0 = r14.DBG;	 Catch:{ InterruptedException -> 0x0014 }
        if (r0 == 0) goto L_0x0013;
    L_0x000a:
        r0 = "SAVerificationClientS";
        r1 = "Unable to verify null intent";
        android.util.Log.d(r0, r1);	 Catch:{ InterruptedException -> 0x0016 }
    L_0x0013:
        return;
    L_0x0014:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0016 }
    L_0x0016:
        r0 = move-exception;
        throw r0;
    L_0x0018:
        r0 = r14.isDebugMode();	 Catch:{ InterruptedException -> 0x0120 }
        if (r0 != 0) goto L_0x0024;
    L_0x001e:
        r0 = r14.isPackageGoogleSigned();	 Catch:{ InterruptedException -> 0x0120 }
        if (r0 == 0) goto L_0x0124;
    L_0x0024:
        r1 = r3;
    L_0x0025:
        r6 = java.lang.System.nanoTime();
    L_0x0029:
        r0 = r14.isConnected();	 Catch:{ InterruptedException -> 0x0127 }
        if (r0 != 0) goto L_0x0073;
    L_0x002f:
        r8 = java.lang.System.nanoTime();	 Catch:{ RemoteException -> 0x0129 }
        r8 = r8 - r6;
        r10 = r14.mConnectionTimeout;	 Catch:{ RemoteException -> 0x0129 }
        r12 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r10 = r10 * r12;
        r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r0 >= 0) goto L_0x0073;
    L_0x003e:
        r8 = 50;
        java.lang.Thread.sleep(r8);	 Catch:{ InterruptedException -> 0x0044 }
        goto L_0x0029;
    L_0x0044:
        r0 = move-exception;
        r5 = r14.DBG;
        if (r5 == 0) goto L_0x0071;
    L_0x0049:
        r5 = "SAVerificationClientS";
        r0 = java.lang.String.valueOf(r0);
        r8 = new java.lang.StringBuilder;
        r9 = java.lang.String.valueOf(r0);
        r9 = r9.length();
        r9 = r9 + 33;
        r8.<init>(r9);
        r9 = "Unexpected InterruptedException: ";
        r8 = r8.append(r9);
        r0 = r8.append(r0);
        r0 = r0.toString();
        android.util.Log.d(r5, r0);
    L_0x0071:
        if (r4 == 0) goto L_0x0029;
    L_0x0073:
        r0 = r14.isConnected();	 Catch:{ InterruptedException -> 0x012b }
        if (r0 == 0) goto L_0x00f6;
    L_0x0079:
        r0 = "SearchActionVerificationClientExtraIntent";
        r0 = r15.hasExtra(r0);	 Catch:{ InterruptedException -> 0x012b }
        if (r0 == 0) goto L_0x00c8;
    L_0x0082:
        r0 = "SearchActionVerificationClientExtraIntent";
        r0 = r15.getParcelableExtra(r0);
        r0 = (android.content.Intent) r0;
        r5 = r14.DBG;	 Catch:{ InterruptedException -> 0x012d }
        if (r5 == 0) goto L_0x0092;
    L_0x008f:
        logIntentWithExtras(r0);	 Catch:{ InterruptedException -> 0x012d }
    L_0x0092:
        r5 = "SAVerificationClientS";
        r6 = r14.mIRemoteService;	 Catch:{ RemoteException -> 0x0133 }
        r6 = r6.getVersion();	 Catch:{ RemoteException -> 0x0133 }
        r7 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x0133 }
        r8 = 24;
        r7.<init>(r8);	 Catch:{ RemoteException -> 0x0133 }
        r8 = "API version: ";
        r7 = r7.append(r8);	 Catch:{ RemoteException -> 0x0133 }
        r6 = r7.append(r6);	 Catch:{ RemoteException -> 0x0133 }
        r6 = r6.toString();	 Catch:{ RemoteException -> 0x0133 }
        android.util.Log.i(r5, r6);	 Catch:{ RemoteException -> 0x0133 }
        r5 = new android.os.Bundle;	 Catch:{ RemoteException -> 0x0133 }
        r5.<init>();	 Catch:{ RemoteException -> 0x0133 }
        if (r1 == 0) goto L_0x0151;
    L_0x00bb:
        r1 = r14.mIRemoteService;	 Catch:{ InterruptedException -> 0x012f }
        r1 = r1.isSearchAction(r0, r5);	 Catch:{ InterruptedException -> 0x012f }
        if (r1 == 0) goto L_0x0151;
    L_0x00c3:
        r14.performAction(r0, r3, r5);	 Catch:{ RemoteException -> 0x0133 }
    L_0x00c6:
        if (r4 == 0) goto L_0x0013;
    L_0x00c8:
        r0 = r14.DBG;	 Catch:{ InterruptedException -> 0x015c }
        if (r0 == 0) goto L_0x0013;
    L_0x00cc:
        r0 = "SAVerificationClientS";
        r1 = java.lang.String.valueOf(r15);
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r3 = r3 + 28;
        r2.<init>(r3);
        r3 = "No extra, nothing to check: ";
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        android.util.Log.d(r0, r1);
        if (r4 == 0) goto L_0x0013;
    L_0x00f6:
        r0 = "SAVerificationClientS";
        r1 = java.lang.String.valueOf(r15);
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r3 = r3 + 62;
        r2.<init>(r3);
        r3 = "VerificationService is not connected, unable to check intent: ";
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        android.util.Log.e(r0, r1);
        goto L_0x0013;
    L_0x0120:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0122 }
    L_0x0122:
        r0 = move-exception;
        throw r0;
    L_0x0124:
        r1 = r2;
        goto L_0x0025;
    L_0x0127:
        r0 = move-exception;
        throw r0;	 Catch:{  }
    L_0x0129:
        r0 = move-exception;
        throw r0;
    L_0x012b:
        r0 = move-exception;
        throw r0;
    L_0x012d:
        r0 = move-exception;
        throw r0;
    L_0x012f:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x0131 }
    L_0x0131:
        r0 = move-exception;
        throw r0;	 Catch:{ RemoteException -> 0x0133 }
    L_0x0133:
        r0 = move-exception;
        r1 = "SAVerificationClientS";
        r2 = "Remote exception: ";
        r0 = r0.getMessage();	 Catch:{ InterruptedException -> 0x0154 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ InterruptedException -> 0x0154 }
        r3 = r0.length();	 Catch:{ InterruptedException -> 0x0154 }
        if (r3 == 0) goto L_0x0156;
    L_0x0148:
        r0 = r2.concat(r0);	 Catch:{ InterruptedException -> 0x0154 }
    L_0x014c:
        android.util.Log.e(r1, r0);
        goto L_0x00c6;
    L_0x0151:
        r3 = r2;
        goto L_0x00c3;
    L_0x0154:
        r0 = move-exception;
        throw r0;
    L_0x0156:
        r0 = new java.lang.String;
        r0.<init>(r2);
        goto L_0x014c;
    L_0x015c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.search.verification.client.SearchActionVerificationClientService.onHandleIntent(android.content.Intent):void");
    }

    private boolean isConnected() {
        return this.mIRemoteService != null;
    }

    static ISearchActionVerificationService access$102(SearchActionVerificationClientService searchActionVerificationClientService, ISearchActionVerificationService iSearchActionVerificationService) {
        searchActionVerificationClientService.mIRemoteService = iSearchActionVerificationService;
        return iSearchActionVerificationService;
    }

    public final void onCreate() {
        if (this.DBG) {
            Log.d("SAVerificationClientS", "onCreate");
        }
        super.onCreate();
        this.mSearchActionVerificationServiceConnection = new SearchActionVerificationServiceConnection(this);
        bindService(this.mServiceIntent, this.mSearchActionVerificationServiceConnection, 1);
    }

    private boolean isPackageGoogleSigned() {
        boolean z = false;
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 64);
            try {
                if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                    if (this.DBG) {
                        try {
                            Log.d("SAVerificationClientS", "Wrong number of signatures returned");
                        } catch (NameNotFoundException e) {
                            throw e;
                        }
                    }
                    return z;
                }
                z = Base64.encodeToString(packageInfo.signatures[0].toByteArray(), 2).equals("MIIEQzCCAyugAwIBAgIJAMLgh0ZkSjCNMA0GCSqGSIb3DQEBBAUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDAeFw0wODA4MjEyMzEzMzRaFw0zNjAxMDcyMzEzMzRaMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBAKtWLgDYO6IIrgqWbxJOKdoR8qtW0I9Y4sypEwPpt1TTcvZApxsdyxMJZ2JORland2qSGT2y5b+3JKkedxiLDmpHpDsz2WCbdxgxRczfey5YZnTJ4VZbH0xqWVW/8lGmPav5xVwnIiJS6HXk+BVKZF+JcWjAsb/GEuq/eFdpuzSqeYTcfi6idkyugwfYwXFU1+5fZKUaRKYCwkkFQVfcAs1fXA5V+++FGfvjJ/CxURaSxaBvGdGDhfXE28LWuT9ozCl5xw4Yq5OGazvV24mZVSoOO0yZ31j7kYvtwYK6NeADwbSxDdJEqO4k//0zOHKrUiGYXtqw/A0LFFtqoZKFjnkCAQOjgdkwgdYwHQYDVR0OBBYEFMd9jMIhF1Ylmn/Tgt9r45jk14alMIGmBgNVHSMEgZ4wgZuAFMd9jMIhF1Ylmn/Tgt9r45jk14aloXikdjB0MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEUMBIGA1UEChMLR29vZ2xlIEluYy4xEDAOBgNVBAsTB0FuZHJvaWQxEDAOBgNVBAMTB0FuZHJvaWSCCQDC4IdGZEowjTAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBAUAA4IBAQBt0lLO74UwLDYKqs6Tm8/yzKkEu116FmH4rkaymUIE0P9KaMftGlMexFlaYjzmB2OxZyl6euNXEsQH8gjwyxCUKRJNexBiGcCEyj6z+a1fuHHvkiaai+KL8W1EyNmgjmyy8AW7P+LLlkR+ho5zEHatRbM/YAnqGcFh5iZBqpknHf1SKMXFh4dd239FJ1jWYfbMDMy3NS5CTMQ2XFI1MvcyUTdZPErjQfTbQe3aDQsQcafEQPD+nqActifKZ0Np0IS9L9kR/wbNvyz6ENwPiTrjV2KRkEjH78ZMcUQXg0L3BYHJ3lc69Vs5Ddf9uUGGMYldX3WfMBEmh/9iFBDAaTCK");
                return z;
            } catch (NameNotFoundException e2) {
                throw e2;
            } catch (NameNotFoundException e22) {
                throw e22;
            }
        } catch (NameNotFoundException e222) {
            if (this.DBG) {
                String valueOf = String.valueOf(e222);
                Log.d("SAVerificationClientS", new StringBuilder(String.valueOf(valueOf).length() + 34).append("Unexpected NameNotFoundException: ").append(valueOf).toString());
            }
        }
    }

    public SearchActionVerificationClientService() {
        int i = SearchActionVerificationClientActivity.a;
        super("SearchActionVerificationClientService");
        this.mServiceIntent = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
        this.mIRemoteService = null;
        this.DBG = isDebugMode();
        if (isTestingMode()) {
            this.mServiceIntent.setPackage("com.google.verificationdemo.fakeverification");
        }
        this.mConnectionTimeout = getConnectionTimeout();
        if (i != 0) {
            a++;
        }
    }
}
