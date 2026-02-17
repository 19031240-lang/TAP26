package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Usuario> usuarios;

    public Banco() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario autenticar(String pin) {
        for (Usuario u : usuarios) {
            if (u.getPin().equals(pin)) {
                return u;
            }
        }
        return null;
    }
}
