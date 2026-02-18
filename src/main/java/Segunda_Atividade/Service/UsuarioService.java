package Segunda_Atividade.Service;

import Segunda_Atividade.Dao.UsuarioDao;
import Segunda_Atividade.Model.UsuarioModel;

public class UsuarioService {

    static UsuarioDao ud = new UsuarioDao();

    public void validarRegraNegocio(String email, String nome){
        if (!email.contains("@weg.net")){
            throw new IllegalArgumentException("ERRO - EMAIL DEVE CONTER @weg.net !");
        }
        UsuarioModel model = new UsuarioModel(nome,email);
        ud.adicionarUsuario(model);
    }
}
