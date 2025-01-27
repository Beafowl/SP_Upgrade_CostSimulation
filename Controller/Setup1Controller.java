package Controller;

import code.Main;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.control.Button;

public class Setup1Controller {

    private final Main main;
    private Parent view;

    private Button jaegerButton;
    private Button schurkeButton;
    private Button zerstoererButton;
    private Button wildhueterButton;
    private Button feuerkanonierButton;
    private Button spaeherButton;
    private Button daemonjaegerButton;
    private Button racheengelButton;
    private Button kriegerButton;
    private Button ninjaButton;
    private Button kreuzritterButton;
    private Button berserkerButton;
    private Button gladiatorButton;
    private Button kampfmoenchButton;
    private Button todesbringerButton;
    private Button abtruennigerButton;
    private Button feuermagierButton;
    private Button heiligermagierButton;
    private Button eismagierButton;
    private Button schattenmagierButton;
    private Button vulkanoButton;
    private Button gezeitenbaendigerButton;
    private Button seherButton;
    private Button erzmagierButton;
    
    public Setup1Controller(Main main, Parent view) {
        this.main = main;
        this.view = view;
    }

    public void init() {
        // Load view references
        this.jaegerButton = (Button) this.view.lookup("#jaegerButton");
        this.schurkeButton = (Button) this.view.lookup("#schurkeButton");
        this.zerstoererButton = (Button) this.view.lookup("#zerstoererButton");
        this.wildhueterButton = (Button) this.view.lookup("#wildhueterButton");
        this.feuerkanonierButton = (Button) this.view.lookup("#feuerkanonierButton");
        this.spaeherButton = (Button) this.view.lookup("#spaeherButton");
        this.daemonjaegerButton = (Button) this.view.lookup("#daemonjaegerButton");
        this.racheengelButton = (Button) this.view.lookup("#racheengelButton");
        this.kriegerButton = (Button) this.view.lookup("#kriegerButton");
        this.ninjaButton = (Button) this.view.lookup("#ninjaButton");
        this.kreuzritterButton = (Button) this.view.lookup("#kreuzritterButton");
        this.berserkerButton = (Button) this.view.lookup("#berserkerButton");
        this.gladiatorButton = (Button) this.view.lookup("#gladiatorButton");
        this.kampfmoenchButton = (Button) this.view.lookup("#kampfmoenchButton");
        this.todesbringerButton = (Button) this.view.lookup("#todesbringerButton");
        this.abtruennigerButton = (Button) this.view.lookup("#abtruennigerButton");
        this.feuermagierButton = (Button) this.view.lookup("#feuermagierButton");
        this.heiligermagierButton = (Button) this.view.lookup("#heiligermagierButton ");
        this.eismagierButton = (Button) this.view.lookup("#eismagierButton");
        this.schattenmagierButton = (Button) this.view.lookup("#schattenmagierButton");
        this.vulkanoButton = (Button) this.view.lookup("#vulkanoButton");
        this.gezeitenbaendigerButton = (Button) this.view.lookup("#gezeitenbaendigerButton");
        this.seherButton = (Button) this.view.lookup("#seherButton");
        this.erzmagierButton = (Button) this.view.lookup("#erzmagierButton");


        // Add action listeners
        this.jaegerButton.setOnAction(this::jaeger);
    }

    // Action Listeners
    private void jaeger(ActionEvent event){

    }
}
