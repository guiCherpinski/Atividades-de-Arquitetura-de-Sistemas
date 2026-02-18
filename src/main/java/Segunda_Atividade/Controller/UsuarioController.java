package Segunda_Atividade.Controller;

import Segunda_Atividade.Model.UsuarioModel;
import Segunda_Atividade.Service.UsuarioService;

public class UsuarioController {


    public void validarDados(String nome, String email){
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("ERRO - NOME NÃO PODE SER VAZIO!");
        }

        if (email == null || email.isBlank()){
            throw new IllegalArgumentException("ERRO - EMAIL NÃO PODE SER NULO!");
        }

        UsuarioService us = new UsuarioService();

        us.validarRegraNegocio(email, nome);
    }


}
