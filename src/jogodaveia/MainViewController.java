/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodaveia;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 *
 * @author vitor
 */
public class MainViewController implements Initializable {

    ToPuto toPuto;
    Botao vetor[];
    int jogador;
    int turno = 1;
    @FXML
    private Label vez;
    @FXML
    private ImageView X;

    @FXML
    private ImageView O;

    @FXML
    private Button button9;

    @FXML
    private Button button4;

    @FXML
    private Button button8;

    @FXML
    private Button button2;

    @FXML
    private Button button7;

    @FXML
    private Button button6;

    @FXML
    private Button button5;

    @FXML
    private Button button3;

    @FXML
    private Button button1;

    public void faz2() {
        if (vetor[5].valor == 2) {
            jogue(5);
        } else if (vetor[2].valor == 2) {
            jogue(2);
        } else if (vetor[4].valor == 2) {
            jogue(4);
        } else if (vetor[6].valor == 2) {
            jogue(6);
        } else if (vetor[8].valor == 2) {
            jogue(8);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (vetor[i].valor == 2) {
                    jogue(i);
                }
            }
        }
    }

    public int ganha(int p) {
        int n;
        if (p == 1) {
            n = 18;
        } else {
            n = 50;
        }
        for (int i = 1; i <= 9; i++) {
            if (vetor[i].valor == 2) {
                if (i == 1) {
                    if (vetor[1].valor * vetor[2].valor * vetor[3].valor == n) { //Linhas
                        return 1;
                    } else if (vetor[1].valor * vetor[4].valor * vetor[7].valor == n) { //Colunas
                        return 1;
                    } else if (vetor[1].valor * vetor[5].valor * vetor[9].valor == n) { //Colunas
                        return 1;
                    }
                } else if (i == 2) {
                    if (vetor[1].valor * vetor[2].valor * vetor[3].valor == n) { //Linhas
                        return 2;
                    } else if (vetor[2].valor * vetor[5].valor * vetor[8].valor == n) { //Colunas
                        return 2;
                    }
                } else if (i == 3) {
                    if (vetor[1].valor * vetor[2].valor * vetor[3].valor == n) { //Linhas
                        return 3;
                    } else if (vetor[3].valor * vetor[6].valor * vetor[9].valor == n) { //Colunas
                        return 3;
                    } else if (vetor[3].valor * vetor[5].valor * vetor[7].valor == n) { //Colunas
                        return 3;
                    }
                } else if (i == 4) {
                    if (vetor[4].valor * vetor[5].valor * vetor[6].valor == n) { //Linhas
                        return 4;
                    } else if (vetor[1].valor * vetor[4].valor * vetor[7].valor == n) { //Colunas
                        return 4;
                    }
                } else if (i == 5) {
                    if (vetor[4].valor * vetor[5].valor * vetor[6].valor == n) { //Linhas
                        return 5;
                    } else if (vetor[2].valor * vetor[5].valor * vetor[8].valor == n) { //Colunas
                        return 5;
                    } else if (vetor[1].valor * vetor[5].valor * vetor[9].valor == n) { //Colunas
                        return 5;
                    } else if (vetor[3].valor * vetor[5].valor * vetor[7].valor == n) { //Colunas
                        return 5;
                    }
                } else if (i == 6) {
                    if (vetor[4].valor * vetor[5].valor * vetor[6].valor == n) { //Linhas
                        return 6;
                    } else if (vetor[3].valor * vetor[6].valor * vetor[9].valor == n) { //Colunas
                        return 6;
                    }
                } else if (i == 7) {
                    if (vetor[7].valor * vetor[8].valor * vetor[9].valor == n) { //Linhas
                        return 7;
                    } else if (vetor[1].valor * vetor[4].valor * vetor[7].valor == n) { //Colunas
                        return 7;
                    } else if (vetor[3].valor * vetor[5].valor * vetor[7].valor == n) { //Colunas
                        return 7;
                    }
                } else if (i == 8) {
                    if (vetor[7].valor * vetor[8].valor * vetor[9].valor == n) { //Linhas
                        return 8;
                    } else if (vetor[2].valor * vetor[5].valor * vetor[8].valor == n) { //Colunas
                        return 8;
                    }
                } else if (i == 9) {
                    if (vetor[7].valor * vetor[8].valor * vetor[9].valor == n) { //Linhas
                        return 9;
                    } else if (vetor[3].valor * vetor[6].valor * vetor[9].valor == n) { //Colunas
                        return 9;
                    } else if (vetor[1].valor * vetor[5].valor * vetor[9].valor == n) { //Colunas
                        return 9;
                    }
                }
            }
        }
        return 0;
    }

    public void trocaTurno() {
        if (turno % 2 == 0) {
            O.setOpacity(1);
            X.setOpacity(0.25);
            if (jogador == 2) {
                vez.setText("Vez do Jogador");
            } else {
                vez.setText("Vez da Veia");
            }

        } else {
            X.setOpacity(1);
            O.setOpacity(0.25);
            if (jogador == 1) {
                vez.setText("Vez do Jogador");
            } else {
                vez.setText("Vez da Veia");
            }
        }
    }

    @FXML
    public void joga1() {
        jogue(1);
        jogo();
    }

    @FXML
    public void joga2() {
        jogue(2);
        jogo();
    }

    @FXML
    public void joga3() {
        jogue(3);
        jogo();
    }

    @FXML
    public void joga4() {
        jogue(4);
        jogo();
    }

    @FXML
    public void joga5() {
        jogue(5);
        jogo();
    }

    @FXML
    public void joga6() {
        jogue(6);
        jogo();
    }

    @FXML
    public void joga7() {
        jogue(7);
        jogo();
    }

    @FXML
    public void joga8() {
        jogue(8);
        jogo();
    }

    @FXML
    public void joga9() {
        jogue(9);
        jogo();
    }

    public void jogue(int n) {
        if (turno % 2 == 0) {
            vetor[n].button.setText("O");
            vetor[n].valor = 5;
        } else {
            vetor[n].button.setText("X");
            vetor[n].valor = 3;
        }
        vetor[n].button.setDisable(true);
        turno++;
        trocaTurno();
    }

    @FXML
    public void jogoX() {

        turno = 1;
        for (int n = 1; n <= 9; n++) {
            vetor[n].button.setDisable(false);
            vetor[n].button.setText("");
            vetor[n].valor = 2;
        }
        jogador = 1;
        trocaTurno();
        jogo();
    }

    @FXML
    public void jogoO() {
        turno = 1;
        for (int n = 1; n <= 9; n++) {
            vetor[n].button.setDisable(false);
            vetor[n].button.setText("");
            vetor[n].valor = 2;
        }
        jogador = 2;
        trocaTurno();
        jogo();
    }

    public void jogo() {
        ganhou();
        if (jogador == 1) {
            if (turno == 2) {
                if (vetor[5].valor == 2) {
                    jogue(5);
                } else {
                    jogue(1);
                }
            } else if (turno == 4) {
                if (ganha(1) != 0) {
                    jogue(ganha(1));
                } else {
                    faz2();
                }
            } else if (turno == 6) {
                if (ganha(2) != 0) {
                    jogue(ganha(2));
                } else if (ganha(1) != 0) {
                    jogue(ganha(1));
                } else {
                    faz2();
                }
            } else if (turno == 8) {
                if (ganha(2) != 0) {
                    jogue(ganha(2));
                } else if (ganha(1) != 0) {
                    jogue(ganha(1));
                } else {
                    faz2();
                }
            }
        } else {
            if (turno == 1) {
                jogue(1);
            } else if (turno == 3) {
                if (vetor[9].valor == 2) {
                    jogue(9);
                } else {
                    jogue(3);
                }
            } else if (turno == 5) {
                if (ganha(1) != 0) {
                    jogue(ganha(1));
                } else if (ganha(2) != 0) {
                    jogue(ganha(2));
                } else if (vetor[7].valor == 2) {
                    jogue(7);
                } else {
                    jogue(3);
                }
            } else if (turno == 7) {
                if (ganha(1) != 0) {
                    jogue(ganha(1));
                } else if (ganha(2) != 0) {
                    jogue(ganha(2));
                } else {
                    faz2();
                }
            } else if (turno == 9) {
                if (ganha(1) != 0) {
                    jogue(ganha(1));
                } else if (ganha(2) != 0) {
                    jogue(ganha(2));
                } else {
                    faz2();
                }
            }
        }
        ganhou();
    }

    public void ganhou() {
        String ganha = toPuto.ganhouOuPerdeu(vetor);
        if (ganha != "ninguem") {
            toPuto.createAlert(ganha);
            disableButtons();
        }
    }


    public void inicizalizaBotoes() {

        vetor[1].button = button1;
        vetor[2].button = button2;
        vetor[3].button = button3;
        vetor[4].button = button4;
        vetor[5].button = button5;
        vetor[6].button = button6;
        vetor[7].button = button7;
        vetor[8].button = button8;
        vetor[9].button = button9;

        disableButtons();
    }
    
    public void disableButtons(){
        for (int i = 0; i < 9; i++){
            vetor[i+1].button.setDisable(true);
        }
    }

    public void startNewGame() {
        vetor = new Botao[10];
        toPuto = new ToPuto();
        for (int i = 1; i < 10; i++) {
            vetor[i] = new Botao();
        }
        inicizalizaBotoes();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        startNewGame();
        trocaTurno();
    }

}
