package com.okugbe.exception;

import com.okugbe.InstagramApiError;

public class InstagramApiException extends RuntimeException {
    private final static long serialVersionUID = -4298738252483677889L;
    private InstagramApiError error;

    public InstagramApiException(InstagramApiError error) {
        this.error = error;
    }

    public InstagramApiException(Throwable cause) {
        super(cause);
    }

    public InstagramApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public InstagramApiError getError() {
        return error;
    }

    @Override
    public String getMessage() {
        if (error != null) {
            return error.toString();
        }
        return super.getMessage();
    }
}
