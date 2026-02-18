package Segunda_Atividade.View;

import Segunda_Atividade.Controller.UsuarioController;
import Segunda_Atividade.Dao.UsuarioDao;
import Segunda_Atividade.Service.UsuarioService;

import java.util.Scanner;

public class UsuarioView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioController uc = new UsuarioController();
        System.out.println("Digite os dados para cadastro!");

        try {
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.println("Digite o email: ");
            String email = sc.nextLine();

            uc.validarDados(nome,email);

            System.out.println("Cadastrado com sucesso!");



        }catch (IllegalArgumentException e){

            System.out.println(e.getMessage());
            sc.nextLine();
        }


    }
}
