package com.whatsapp.gdrive;

import com.whatsapp.util.ao;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.FileEntity;

class ep extends FileEntity {
    final bs a;
    final FileInputStream b;
    final AtomicLong c;
    final long d;
    final HttpPut e;
    final er f;
    final long g;
    final bc h;

    public long getContentLength() {
        return (this.d - this.g) + 1;
    }

    public void writeTo(OutputStream outputStream) {
        boolean z = GoogleDriveService.c;
        Closeable content = getContent();
        try {
            byte[] bArr = new byte[16384];
            while (this.a.a()) {
                int read = content.read(bArr, 0, bArr.length);
                if (read > 0) {
                    this.c.addAndGet((long) read);
                    if (this.f != null) {
                        this.f.a((long) read);
                    }
                    outputStream.write(bArr, 0, read);
                    if (z) {
                    }
                }
                outputStream.flush();
                return;
            }
            this.e.abort();
            ao.a(content);
        } finally {
            ao.a(content);
        }
    }

    ep(bc bcVar, File file, String str, long j, long j2, HttpPut httpPut, FileInputStream fileInputStream, bs bsVar, AtomicLong atomicLong, er erVar) {
        this.h = bcVar;
        this.d = j;
        this.g = j2;
        this.e = httpPut;
        this.b = fileInputStream;
        this.a = bsVar;
        this.c = atomicLong;
        this.f = erVar;
        super(file, str);
    }

    public InputStream getContent() {
        return new bt(this);
    }
}
