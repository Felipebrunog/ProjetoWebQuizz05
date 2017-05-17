package WEB

-INF.src;

import java.util.ArrayList;

public class DataBaseUsuario {
    private static ArrayList<Usuario> usuario;
    public static ArrayList<Usuario> getUsuarios(){
    if(usuario == null){
    usuario = new ArrayList<>();
    Usuario usu = new Usuario();
    usu.setNome(" ");
    usuario.add(usu);
    }
    return usuario;
    }
}
