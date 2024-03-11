package org.example.LabsTP.LabN3.chain;

import java.util.HashMap;
import java.util.Map;

public class Request {

    private String inputStream;

    private final Map<String, String> headers = new HashMap<>();

    private String method;

    private String session;

    private String path;

    public String getInputStream() {
        return inputStream;
    }

    public Request setInputStream(String inputStream) {
        this.inputStream = inputStream;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public Request setMethod(String method) {
        this.method = method;
        return this;
    }

    public String getSession() {
        return session;
    }

    public Request setSession(String session) {
        this.session = session;
        return this;
    }

    public String getPath() {
        return path;
    }

    public Request setPath(String path) {
        this.path = path;
        return this;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

}
