package org.whispersystems.jobqueue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

public class l implements t {
    public String a(v vVar) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(vVar);
        return r.c(byteArrayOutputStream.toByteArray(), 2);
    }

    public v a(j jVar, boolean z, String str) {
        try {
            return (v) new ObjectInputStream(new ByteArrayInputStream(r.a(str, 2))).readObject();
        } catch (ClassNotFoundException e) {
            Writer stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            throw new IOException(e.getMessage() + "\n" + stringWriter.toString());
        }
    }
}
