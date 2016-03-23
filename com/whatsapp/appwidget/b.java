package com.whatsapp.appwidget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService.RemoteViewsFactory;
import com.whatsapp.App;
import com.whatsapp.a28;
import com.whatsapp.l5;
import com.whatsapp.notification.d;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.cs;
import java.util.ArrayList;
import java.util.Iterator;
import org.v;
import org.whispersystems.at;

@TargetApi(11)
public class b implements RemoteViewsFactory {
    private static final String[] z;
    private ArrayList a;
    private final Context b;

    static {
        String[] strArr = new String[4];
        String str = "kr4?Yhm9=Ko}1;Hsi)wSrx\"=]h~";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 28;
                        break;
                    case at.g /*1*/:
                        i3 = 27;
                        break;
                    case at.i /*2*/:
                        i3 = 80;
                        break;
                    case at.o /*3*/:
                        i3 = 88;
                        break;
                    default:
                        i3 = 60;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "vr4";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "kr4?Yhm9=Ko}1;Hsi)wSr\u007f5+Hnt)";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "kr4?Yhm9=Ko}1;Hsi)wSr\u007f1,]o~$;T}u7=X";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onDataSetChanged() {
        boolean z = WidgetProvider.a;
        Log.i(z[1]);
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ArrayList b = WidgetProvider.b();
            this.a.clear();
            if (b != null) {
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    co coVar = (co) it.next();
                    e eVar = new e(null);
                    l5 b2 = App.as.b(coVar.k.c);
                    eVar.d = b2.p;
                    eVar.c = a28.b(b2.a(this.b));
                    eVar.b = a28.b(d.a(this.b, coVar, b2, false, false));
                    eVar.a = cs.j(this.b, App.o(coVar));
                    this.a.add(eVar);
                    if (z) {
                        break;
                    }
                }
            }
            Binder.restoreCallingIdentity(clearCallingIdentity);
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    public int getCount() {
        return this.a.size();
    }

    public RemoteViews getViewAt(int i) {
        if (i >= this.a.size()) {
            return null;
        }
        RemoteViews remoteViews = new RemoteViews(this.b.getPackageName(), 2130903302);
        e eVar = (e) this.a.get(i);
        remoteViews.setTextViewText(2131755994, eVar.c);
        remoteViews.setTextViewText(2131755310, eVar.b);
        remoteViews.setTextViewText(2131755530, eVar.a);
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString(z[2], eVar.d);
        intent.putExtras(bundle);
        remoteViews.setOnClickFillInIntent(2131755993, intent);
        return remoteViews;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void onCreate() {
        Log.i(z[0]);
        onDataSetChanged();
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public b(Context context) {
        this.a = new ArrayList();
        this.b = context;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public void onDestroy() {
        Log.i(z[3]);
    }
}
