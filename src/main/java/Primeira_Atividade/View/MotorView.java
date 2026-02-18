package Primeira_Atividade.View;

import Primeira_Atividade.Controller.MotorController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MotorView {
    public static void main(String[] args) {
        MotorController controller = new MotorController();
        Scanner sc = new Scanner(System.in);



        try {
            System.out.println("Digite os CVs do motor: ");
            double cavalosMotor = sc.nextDouble();
            double valor = controller.validarValor(cavalosMotor);

            System.out.println("O motor tem exatos: "+valor+ "kW");

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            sc.nextLine();
        }
    }
}
