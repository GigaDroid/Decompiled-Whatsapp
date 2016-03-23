package com.whatsapp.gdrive;

import com.whatsapp.vf;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

class cj implements HttpEntity {
    final ar a;
    final HttpEntity b;

    public Header getContentEncoding() {
        return this.b.getContentEncoding();
    }

    public void consumeContent() {
        this.b.consumeContent();
    }

    public InputStream getContent() {
        return new vf(this.b.getContent(), ar.a(this.a));
    }

    public boolean isRepeatable() {
        return this.b.isRepeatable();
    }

    public void writeTo(OutputStream outputStream) {
        boolean z = GoogleDriveService.c;
        InputStream content = getContent();
        byte[] bArr = new byte[4096];
        do {
            int read = content.read(bArr);
            if (read >= 0 || z) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        } while (!z);
    }

    public boolean isChunked() {
        return this.b.isChunked();
    }

    public boolean isStreaming() {
        return this.b.isStreaming();
    }

    cj(ar arVar, HttpEntity httpEntity) {
        this.a = arVar;
        this.b = httpEntity;
    }

    public Header getContentType() {
        return this.b.getContentType();
    }

    public long getContentLength() {
        return this.b.getContentLength();
    }
}
