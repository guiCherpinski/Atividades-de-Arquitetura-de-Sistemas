package Segunda_Atividade.Dao;

import Segunda_Atividade.Model.UsuarioModel;

import java.util.ArrayList;

public class UsuarioDao {

    private ArrayList<UsuarioModel> usuarios = new ArrayList<>();

    public void adicionarUsuario(UsuarioModel usuario){
        usuarios.add(usuario);
    }
}
