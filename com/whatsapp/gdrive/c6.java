package com.whatsapp.gdrive;

import com.whatsapp.at2;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

class c6 implements HttpEntity {
    final d2 a;
    final HttpEntity b;

    c6(d2 d2Var, HttpEntity httpEntity) {
        this.a = d2Var;
        this.b = httpEntity;
    }

    public InputStream getContent() {
        return new dr(this, this.b.getContent());
    }

    public boolean isRepeatable() {
        return this.b.isRepeatable();
    }

    public void writeTo(OutputStream outputStream) {
        this.b.writeTo(new at2(outputStream, d2.a(this.a)));
    }

    public Header getContentEncoding() {
        return this.b.getContentEncoding();
    }

    public boolean isChunked() {
        return this.b.isChunked();
    }

    public boolean isStreaming() {
        return this.b.isStreaming();
    }

    public Header getContentType() {
        return this.b.getContentType();
    }

    public long getContentLength() {
        return this.b.getContentLength();
    }

    public void consumeContent() {
        this.b.consumeContent();
    }
}
