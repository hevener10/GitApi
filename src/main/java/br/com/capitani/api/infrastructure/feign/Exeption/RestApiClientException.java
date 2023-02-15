package br.com.capitani.api.infrastructure.feign.Exeption;

/**
 * This exception is a base class for all other exceptions thrown by the client.
 */

    public class RestApiClientException extends RuntimeException {
        private final int status;
        private final String reason;

        public RestApiClientException(int status, String reason) {
            this.status = status;
            this.reason = reason;
        }

        public int getStatus() {
            return status;
        }

        public String getReason() {
            return reason;
        }

        @Override
        public String getMessage() {
            return String.format("Stash client exception: %d %s", status, reason);
        }
    }

