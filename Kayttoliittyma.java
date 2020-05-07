/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikko
 */
import javafx.application.Application;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;

public class Kayttoliittyma extends Application {

    private String vuoro;
    private int num;
    private boolean paalla;

    public Kayttoliittyma() {
        this.vuoro = "X";
        this.num = 1;
        this.paalla = true;

    }

    @Override
    public void start(Stage ikkuna) {
        Label viesti = new Label();
        Siirrot peli = new Siirrot();
        viesti.setFont(Font.font("Monospaced", 20));
        viesti.setText("Vuoro: " + vuoro);
        GridPane ruudukko = new GridPane();
        ruudukko.setHgap(10);
        ruudukko.setVgap(10);
        Button B1 = new Button(" ");
        Button B2 = new Button(" ");
        Button B3 = new Button(" ");
        Button B4 = new Button(" ");
        Button B5 = new Button(" ");
        Button B6 = new Button(" ");
        Button B7 = new Button(" ");
        Button B8 = new Button(" ");
        Button B9 = new Button(" ");
        B1.setFont(Font.font("Monospaced", 40));
        B2.setFont(Font.font("Monospaced", 40));
        B3.setFont(Font.font("Monospaced", 40));
        B4.setFont(Font.font("Monospaced", 40));
        B5.setFont(Font.font("Monospaced", 40));
        B6.setFont(Font.font("Monospaced", 40));
        B7.setFont(Font.font("Monospaced", 40));
        B8.setFont(Font.font("Monospaced", 40));
        B9.setFont(Font.font("Monospaced", 40));

        ruudukko.add(B1, 1, 1);
        ruudukko.add(B2, 2, 1);
        ruudukko.add(B3, 3, 1);
        ruudukko.add(B4, 1, 2);
        ruudukko.add(B5, 2, 2);
        ruudukko.add(B6, 3, 2);
        ruudukko.add(B7, 1, 3);
        ruudukko.add(B8, 2, 3);
        ruudukko.add(B9, 3, 3);

        BorderPane asettelu = new BorderPane();
        
        asettelu.setTop(viesti);
        asettelu.setCenter(ruudukko);
        
        
        Scene nakyma = new Scene(asettelu);
        
        ikkuna.setScene(nakyma);
        ikkuna.setHeight(350);
        ikkuna.setWidth(300);
        ikkuna.setResizable(false);
        ikkuna.show();
        
        

        B1.setOnAction((event) -> {

            tarkista(B1);
            System.out.println(peli.siirto(1, 0, 0, num));
            if (peli.siirto(1, 0, 0, num) == false) {
                viesti.setText("Peli loppui!");
                lopeta();
            } else {
                viesti.setText("Vuoro: " + vuoro);
            }
        });

        B2.setOnAction((event) -> {
            tarkista(B2);
            if (peli.siirto(2, 0, 0, num) == false) {
                viesti.setText("Peli loppui!");
                lopeta();
            } else {
                viesti.setText("Vuoro: " + vuoro);
            }
        });

        B3.setOnAction((event) -> {
            tarkista(B3);
            if (peli.siirto(3, 0, 0, num) == false) {
                viesti.setText("Peli loppui!");
                lopeta();
            } else {
                viesti.setText("Vuoro: " + vuoro);
            }
        });

        B4.setOnAction((event) -> {
            tarkista(B4);
            if (peli.siirto(0, 1, 0, num) == false) {
                viesti.setText("Peli loppui!");
                lopeta();
            } else {
                viesti.setText("Vuoro: " + vuoro);
            }
        });

        B5.setOnAction((event) -> {
            tarkista(B5);
            if (peli.siirto(0, 2, 0, num) == false) {
                viesti.setText("Peli loppui!");
                lopeta();
            } else {
                viesti.setText("Vuoro: " + vuoro);
            }
        });

        B6.setOnAction((event) -> {
            tarkista(B6);
            if (peli.siirto(0, 3, 0, num) == false) {
                viesti.setText("Peli loppui!");
                lopeta();
            } else {
                viesti.setText("Vuoro: " + vuoro);
            }
        });

        B7.setOnAction((event) -> {
            tarkista(B7);
            if (peli.siirto(0, 0, 1, num) == false) {
                viesti.setText("Peli loppui!");
                lopeta();
            } else {
                viesti.setText("Vuoro: " + vuoro);
            }
        });

        B8.setOnAction((event) -> {
            tarkista(B8);
            if (peli.siirto(0, 0, 2, num) == false) {
                viesti.setText("Peli loppui!");
                lopeta();
            } else {
                viesti.setText("Vuoro: " + vuoro);
            }
        });

        B9.setOnAction((event) -> {
            tarkista(B9);
            if (peli.siirto(0, 0, 3, num) == false) {
                viesti.setText("Peli loppui!");
                lopeta();
            } else {
                viesti.setText("Vuoro: " + vuoro);
            }
        });
    }

    public void tarkista(Button nappi) {
        if (paalla == true) {

            if (!(nappi.getText().equals("X") || nappi.getText().equals("O"))) {
                nappi.setText(vuoro);
                vaihda();

            }
        }
    }

    public void lopeta() {
        paalla = false;

    }

    public void vaihda() {
        num = num * -1;

        if (this.vuoro.equals("X")) {
            this.vuoro = "O";

        } else {
            this.vuoro = "X";
        }

    }

}
