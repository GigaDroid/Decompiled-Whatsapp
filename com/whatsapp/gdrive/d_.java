package com.whatsapp.gdrive;

import android.database.Observable;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Locale;
import org.v;
import org.whispersystems.at;

final class d_ extends Observable {
    private static final String[] z;
    private int a;
    private int b;
    private int c;

    static {
        String[] strArr = new String[7];
        String str = "\u0019\u0019H\ta\u001bPI\u0005e\b\u0014Y\u00058\u0010\u0012N\tq\u0007PW\u0005s\u0017\u001c\u0017\u0012r\r\tU\u0012rS\u001e[\u000et\u001b\u0011V\u0005s";
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
                        i3 = 126;
                        break;
                    case at.g /*1*/:
                        i3 = 125;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0019\u0019H\ta\u001bPI\u0005e\b\u0014Y\u00058\u001c\u001cY\u000bb\u000ePJ\u0012r\u000e\u001cH\u0001c\u0017\u0012TMg\f\u0012]\u0012r\r\u000e\u001a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0019\u0019H\ta\u001bPI\u0005e\b\u0014Y\u00058\u0013\u0018^\tvS\u000f_\u0013c\u0011\u000f_Mg\f\u0018J\u0001e\u001f\tS\u000fyS\rH\u000fp\f\u0018I\u00137[\u0019\u0015Es^U\u001f\u00042[T";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0019\u0019H\ta\u001bPI\u0005e\b\u0014Y\u00058\u001c\u001cY\u000bb\u000eP_\u000esQ\u000eO\u0003t\u001b\u000eIO";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0019\u0019H\ta\u001bPI\u0005e\b\u0014Y\u00058\u001c\u001cY\u000bb\u000ePY\u0001y\u001d\u0018V\fr\u001a";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0019\u0019H\ta\u001bPI\u0005e\b\u0014Y\u00058\r\u001eH\u0015uS\rH\u000fp\f\u0018I\u00138";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0019\u0019H\ta\u001bPI\u0005e\b\u0014Y\u00058\u001c\u001cY\u000bb\u000ePJ\u0012r\u000e\u001cH\u0001c\u0017\u0012TMg\f\u0012]\u0012r\r\u000e\u0015";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private d_() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    public void e() {
        boolean z = GoogleDriveService.c;
        this.a = 0;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).g();
                if (z) {
                    break;
                }
            }
        }
    }

    public void b() {
        boolean z = GoogleDriveService.c;
        this.b = 0;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).d();
                if (z) {
                    break;
                }
            }
        }
    }

    public void b(@fk int i) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).d(i);
                if (z) {
                    break;
                }
            }
        }
    }

    public void c(int i) {
        boolean z = GoogleDriveService.c;
        if (i >= 0 && i != this.b) {
            this.b = i;
            Log.i(z[6] + this.b + "%");
            synchronized (this.mObservers) {
                Iterator it = this.mObservers.iterator();
                while (it.hasNext()) {
                    ((bi) it.next()).c(i);
                    if (z) {
                        break;
                    }
                }
            }
        }
    }

    public void f() {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).e();
                if (z) {
                    break;
                }
            }
        }
    }

    public void h(long j, long j2) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).h(j, j2);
                if (z) {
                    break;
                }
            }
        }
    }

    public void i(long j, long j2) {
        int i;
        boolean z = GoogleDriveService.c;
        if (j2 > 0) {
            i = (int) ((100 * j) / j2);
        } else {
            i = -1;
        }
        if (j2 <= 0) {
            Log.i(z[2] + j + "/" + j2);
        }
        if (i != this.a) {
            this.a = i;
            Log.i(z[1] + i + "%");
            synchronized (this.mObservers) {
                Iterator it = this.mObservers.iterator();
                while (it.hasNext()) {
                    ((bi) it.next()).e(this.a);
                    if (z) {
                        break;
                    }
                }
            }
        }
    }

    public void a(long j, long j2, long j3) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).a(j, j2, j3);
                if (z) {
                    break;
                }
            }
        }
    }

    public void b(boolean z) {
        boolean z2 = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).a(z);
                if (z2) {
                    break;
                }
            }
        }
    }

    public void a(boolean z, long j, long j2) {
        boolean z2 = GoogleDriveService.c;
        this.c = -1;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).a(z, j, j2);
                if (z2) {
                    break;
                }
            }
        }
    }

    public void d(long j, long j2) {
        boolean z = GoogleDriveService.c;
        int i = this.c;
        if (j2 > 0) {
            i = (int) ((100 * j) / j2);
        }
        if (i != this.c) {
            Log.i(String.format(Locale.ENGLISH, z[3], new Object[]{Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)}));
            this.c = i;
            synchronized (this.mObservers) {
                Iterator it = this.mObservers.iterator();
                while (it.hasNext()) {
                    ((bi) it.next()).f(this.c);
                    if (z) {
                        break;
                    }
                }
            }
        }
    }

    public void f(long j, long j2) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).e(j, j2);
                if (z) {
                    break;
                }
            }
        }
    }

    public void e(long j, long j2) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).g(j, j2);
                if (z) {
                    break;
                }
            }
        }
    }

    public void d() {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).b();
                if (z) {
                    break;
                }
            }
        }
    }

    public void l(long j, long j2) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).i(j, j2);
                if (z) {
                    break;
                }
            }
        }
    }

    public void g(long j, long j2) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).a(j, j2);
                if (z) {
                    break;
                }
            }
        }
    }

    public void d(@fk int i) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).a(i);
                if (z) {
                    break;
                }
            }
        }
    }

    public void n(long j, long j2) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).f(j, j2);
                if (z) {
                    break;
                }
            }
        }
    }

    public void b(long j, long j2) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).l(j, j2);
                if (z) {
                    break;
                }
            }
        }
    }

    public void c(boolean z) {
        boolean z2 = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).b(z);
                if (z2) {
                    break;
                }
            }
        }
    }

    public void c() {
        boolean z = GoogleDriveService.c;
        this.c = 0;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).c();
                if (z) {
                    break;
                }
            }
        }
    }

    d_(bk bkVar) {
        this();
    }

    public void g() {
        boolean z = GoogleDriveService.c;
        Log.i(z[0]);
        this.c = -1;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).f();
                if (z) {
                    break;
                }
            }
        }
    }

    public void m(long j, long j2) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).j(j, j2);
                if (z) {
                    break;
                }
            }
        }
    }

    public void c(long j, long j2) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).k(j, j2);
                if (z) {
                    break;
                }
            }
        }
    }

    public void a() {
        boolean z = GoogleDriveService.c;
        Log.i(z[5]);
        this.a = 0;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).a();
                if (z) {
                    break;
                }
            }
        }
    }

    public void k(long j, long j2) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).d(j, j2);
                if (z) {
                    break;
                }
            }
        }
    }

    public void a(@fk int i) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).b(i);
                if (z) {
                    break;
                }
            }
        }
    }

    public void j(long j, long j2) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).c(j, j2);
                if (z) {
                    break;
                }
            }
        }
    }

    public void a(boolean z) {
        boolean z2 = GoogleDriveService.c;
        Log.i(z[4] + z);
        this.a = 0;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).c(z);
                if (z2) {
                    break;
                }
            }
        }
    }

    public void a(long j, long j2) {
        boolean z = GoogleDriveService.c;
        synchronized (this.mObservers) {
            Iterator it = this.mObservers.iterator();
            while (it.hasNext()) {
                ((bi) it.next()).b(j, j2);
                if (z) {
                    break;
                }
            }
        }
    }
}
