package org.aguzman.springcloud.msvc.usuarios.utils;

import java.security.SecureRandom;

public class CrearIdentificador {
    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String generarIdentificador() {
        SecureRandom random = new SecureRandom();
        StringBuilder identificador = new StringBuilder();

        // Generar 10 caracteres aleatorios
        for (int i = 0; i < 10; i++) {
            int indice = random.nextInt(CARACTERES.length());
            identificador.append(CARACTERES.charAt(indice));
        }

        return identificador.toString();
    }
}
