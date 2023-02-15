package br.com.capitani.api.infrastructure.feign.Exeption;

public class RestApiServerException extends RuntimeException {
    private final int status;
    private final String reason;

    public RestApiServerException(int status, String reason) {
        super("Stash server error: " + status + " " + reason);
        this.status = status;
        this.reason = reason;
    }

    public int getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }
}
