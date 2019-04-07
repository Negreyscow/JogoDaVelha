/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodaveia;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author leo
 */
public class ToPuto {
    
        
    
    public String ganhouOuPerdeu(Botao vetor[]){
        if (checkLinhas(vetor, 27)
                || checkColunas(vetor, 27)
                || checkDiagonais(vetor, 27)){
            return "Ganha X";
        }
        
        if (checkLinhas(vetor, 125) 
                || checkColunas(vetor, 125)
                || checkDiagonais(vetor, 125)){
            return "Ganha O";
        }

        return "ninguem";
    }
    
    public boolean checkLinhas(Botao vet[], int valor){
        if (multiplicaValores(vet[1].valor, vet[2].valor, vet[3].valor) ==  valor){
            return true; 
        } else if (multiplicaValores(vet[4].valor, vet[5].valor, vet[6].valor) ==  valor){
            return true;
        } else if (multiplicaValores(vet[7].valor, vet[8].valor, vet[9].valor) ==  valor){
            return true;
        }
        
        return false;
    }
    
    public boolean checkDiagonais(Botao vet[], int valor){
        if (multiplicaValores(vet[1].valor, vet[5].valor, vet[9].valor) ==  valor){
            return true; 
        } else if (multiplicaValores(vet[3].valor, vet[5].valor, vet[7].valor) ==  valor){
            return true;
        }
        return false;
    }
    
    public boolean checkColunas(Botao vet[], int valor){
        if (multiplicaValores(vet[1].valor, vet[4].valor, vet[7].valor) ==  valor){
            return true; 
        } else if (multiplicaValores(vet[2].valor, vet[5].valor, vet[8].valor) ==  valor){
            return true;
        } else if (multiplicaValores(vet[3].valor, vet[6].valor, vet[9].valor) ==  valor){
            return true;
        }
        
        return false;
    }
    
    public int multiplicaValores(int pos1, int pos2, int pos3){
        return pos1 * pos2 * pos3;
    }
    
    public void createAlert(String mensagem) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("GANHO, PERDEU, GANHOU! PERDEU");
        alert.setHeaderText("ACABOOOOU! " + mensagem);
        alert.setContentText("Se você não for burro nem nada, você ganhou!");
        alert.showAndWait();
    }
    
    

}
