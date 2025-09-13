package com.example.apprata;

import java.util.ArrayList;

public class DataHolder {
    public static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static Usuario buscarPorRut(String rut) {
        for (Usuario u : usuarios) {
            if (u.getRut().equals(rut)) {
                return u;
            }
        }
        return null;
    }
}
