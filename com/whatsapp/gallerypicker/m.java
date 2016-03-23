package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.provider.MediaStore.Images.Thumbnails;
import android.provider.MediaStore.Video;
import java.io.FileDescriptor;
import java.util.WeakHashMap;

public class m {
    private static m a;
    private final WeakHashMap b;

    public Bitmap a(FileDescriptor fileDescriptor, Options options) {
        if (options.mCancel) {
            return null;
        }
        Thread currentThread = Thread.currentThread();
        if (!a(currentThread)) {
            return null;
        }
        a(currentThread, options);
        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        d(currentThread);
        return decodeFileDescriptor;
    }

    public synchronized void a(Thread thread, ContentResolver contentResolver) {
        al c = c(thread);
        c.c = a_.CANCEL;
        if (c.b != null) {
            c.b.requestCancelDecode();
        }
        notifyAll();
        synchronized (c) {
            if (c.a && VERSION.SDK_INT >= 8) {
                Thumbnails.cancelThumbnailRequest(contentResolver, -1, thread.getId());
                Video.Thumbnails.cancelThumbnailRequest(contentResolver, -1, thread.getId());
            }
        }
    }

    static {
        a = null;
    }

    private m() {
        this.b = new WeakHashMap();
    }

    public synchronized boolean a(Thread thread) {
        boolean z = true;
        synchronized (this) {
            al alVar = (al) this.b.get(thread);
            if (alVar != null) {
                z = alVar.c != a_.CANCEL;
            }
        }
        return z;
    }

    synchronized void d(Thread thread) {
        ((al) this.b.get(thread)).b = null;
    }

    public Bitmap a(ContentResolver contentResolver, long j, int i, Options options, boolean z) {
        Thread currentThread = Thread.currentThread();
        al c = c(currentThread);
        if (!a(currentThread)) {
            return null;
        }
        boolean z2;
        Bitmap thumbnail;
        try {
            synchronized (c) {
                c.a = true;
                if (z) {
                    if (VERSION.SDK_INT >= 8) {
                        z2 = contentResolver;
                        thumbnail = Video.Thumbnails.getThumbnail(z2, j, currentThread.getId(), i, options);
                        c.a = z2;
                        c.notifyAll();
                    } else {
                        thumbnail = Video.Thumbnails.getThumbnail(contentResolver, j, i, options);
                        synchronized (c) {
                            c.a = false;
                            c.notifyAll();
                        }
                        return thumbnail;
                    }
                } else if (VERSION.SDK_INT >= 8) {
                    thumbnail = Thumbnails.getThumbnail(contentResolver, j, currentThread.getId(), i, options);
                    synchronized (c) {
                        c.a = false;
                        c.notifyAll();
                    }
                    return thumbnail;
                } else {
                    thumbnail = Thumbnails.getThumbnail(contentResolver, j, i, options);
                    synchronized (c) {
                        c.a = false;
                        c.notifyAll();
                    }
                    return thumbnail;
                }
            }
            return thumbnail;
        } finally {
            synchronized (c) {
                z2 = false;
                c.a = false;
                c.notifyAll();
            }
            return thumbnail;
        }
    }

    private synchronized al c(Thread thread) {
        al alVar;
        alVar = (al) this.b.get(thread);
        if (alVar == null) {
            alVar = new al(null);
            this.b.put(thread, alVar);
        }
        return alVar;
    }

    private synchronized void a(Thread thread, Options options) {
        c(thread).b = options;
    }

    public synchronized void b(Thread thread) {
        c(thread).c = a_.ALLOW;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            if (a == null) {
                a = new m();
            }
            mVar = a;
        }
        return mVar;
    }
}
