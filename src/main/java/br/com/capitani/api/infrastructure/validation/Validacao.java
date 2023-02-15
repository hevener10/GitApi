package br.com.capitani.api.infrastructure.validation;

import org.apache.commons.lang3.Validate;

public class Validacao {

    private Validacao() {
    }

    public static void notNull(Object obj) {
        Validate.notNull(obj, "o objeto não pode ser nulo");
    }
}
