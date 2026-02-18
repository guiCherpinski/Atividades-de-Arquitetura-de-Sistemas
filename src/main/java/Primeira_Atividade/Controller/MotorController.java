package Primeira_Atividade.Controller;

import Primeira_Atividade.Model.ModelMotor;

public class MotorController {

    public double validarValor(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("ERRO - VALOR NÃO PODE SER NEGATIVO !");
        }

        double resultado = valor * 0.735;

        ModelMotor motor = new ModelMotor(resultado);
        return motor.getPotencia();
    }
}
