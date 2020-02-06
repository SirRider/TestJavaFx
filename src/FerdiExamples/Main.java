package FerdiExamples;

import javafx.application.Application;
import javafx.beans.binding.NumberBinding;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.text.NumberFormat;


public class Main extends Application {
    Scene scene;GridPane grid;
    Font font = new Font("Lucida",50);
    int WINDOW_WIDTH = 1000;int WINDOW_HEIGHT = 750;
    public void setup(Stage stage) {
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);grid.setHgap(10);
        scene = new Scene(grid, WINDOW_WIDTH,WINDOW_HEIGHT);
        stage.setScene(scene);
        stage.setTitle("JavaFX");
        stage.show();

    }

    // Label hört auf die Zustandsveränderung des Kontos
    public void propertyExample(){
        // erstellt ein Konto
        final Konto konto = new Konto(0);

        // Button zum erhöhen des Kontostandes
        Button incrementKonto = new Button("+1");
        incrementKonto.autosize();
        incrementKonto.setFont(font);
        incrementKonto.setOnAction(e->konto.setStand(konto.getStand()+1));

        // erstellt ein Label für den Kontostand
        final Label label = new Label(Double.toString(konto.getStand()));
        label.setFont(font);
        label.setAlignment(Pos.CENTER);
        // setzt die pass
        label.setMinSize(incrementKonto.getMinWidth()+50,incrementKonto.getMinHeight()+50);

        // Ändert das Label bei einer Kontoänderung
        // (o, oldValue, newValue) -> label.setText(Double.toString(konto.getStand()))

        konto.standProperty().addListener(
                new ChangeListener<Number>() {
                    @Override
                    public void changed(ObservableValue<? extends Number> o, Number oldValue, Number newValue) {
                        label.setText(Double.toString(konto.getStand()));
                    }
                }
        );
        // fügt das Label und den Button dem GridPanel hinzu
        grid.add(label,0,0);
        grid.add(incrementKonto,1,0);

    }

    // Summe von zwei Konten (Unidirectional Binding)
    public void bindingExample_1(){
        // erstelle zwei verschiedene Konten
        Konto konto1 = new Konto(100);
        Konto konto2 = new Konto(500);
        // Binding der beiden Konten
        NumberBinding sum = konto1.standProperty().add(konto2.standProperty());

        // erstelle die Increment Buttons für die Konten
        Button inc1 = new Button("K1: +1");
        Button inc2 = new Button("K2: +1");
        // Darstellung der Buttons
        inc1.setFont(font);inc2.setFont(font);
        inc1.autosize();inc2.autosize();
        // Klick-Events der Buttons
        inc1.setOnAction(e->konto1.setStand(konto1.getStand()+1));
        inc2.setOnAction(e->konto2.setStand(konto2.getStand()+1));

        // Label für Konto 1, Konto 2 und Konto 1+2
        Label label_1 = new Label(Double.toString(konto1.getStand()));
        Label label_2 = new Label(Double.toString(konto2.getStand()));
        Label label_1_2 = new Label(sum.getValue().toString());
        // Fonts der Labels
        label_1.setFont(font); label_2.setFont(font); label_1_2.setFont(font);

        // Fügt die Listener für die Labels hinzu
        konto1.standProperty().addListener(((o, oldValue, newValue) -> label_1.setText(Double.toString(konto1.getStand()))));
        konto2.standProperty().addListener(((o, oldValue, newValue) -> label_2.setText(Double.toString(konto2.getStand()))));
        sum.addListener((o, oldValue, newValue) -> { label_1_2.setText(sum.getValue().toString());});

        grid.add(label_1,0,0);
        grid.add(label_2,1,0);
        grid.add(label_1_2, 2,0);
        grid.add(inc1,0,1);
        grid.add(inc2,1,1);
    }

    // gegenseitige Abhängigkeit -- Slider mit Feld
    public void bidirectionalBinding(){
        // erstellt den Slider
        Slider slider = new Slider();
        slider.setValue(0.3);
        slider.setMinSize(50,50);
        // erstellt das Feld
        TextField field = new TextField(Double.toString(0.3));
        field.setFont(font);
        // stellt die Abhängigkeit zwischen dem Slider und dem Feld her
        field.textProperty().bindBidirectional(slider.valueProperty(), NumberFormat.getNumberInstance());

        grid.add(slider,0,0);
        grid.add(field,0,1);


    }

    @Override
    public void start(Stage stage) throws Exception {
        setup(stage);
        //propertyExample();
        //bindingExample_1();
        bidirectionalBinding();
    }

}
