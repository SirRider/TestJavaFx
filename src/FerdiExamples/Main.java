package FerdiExamples;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {
    Scene scene;
    GridPane grid;
    Font font = new Font("Lucida",25);

    public void kontoExample (){
        // erstellt ein Konto
        final Konto konto = new Konto();
        konto.setStand(0);

        // Button zum erhöhen des Kontostandes
        Button incrementKonto = new Button("+1");
        incrementKonto.setMinSize(100,100);
        incrementKonto.setFont(font);
        incrementKonto.setOnAction(e->konto.setStand(konto.getStand()+1));

        // erstellt ein Label für den Kontostand
        final Label label = new Label(Double.toString(konto.getStand()));
        label.setFont(font);
        label.setAlignment(Pos.CENTER);
        // setzt die pass
        label.setMinSize(incrementKonto.getMinWidth()+50,incrementKonto.getMinHeight()+50);

        // Gibt dem Label ein Listener für den Kontostand
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

    public void setup(Stage stage) {
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);grid.setHgap(10);
        scene = new Scene(grid, 500,250);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void start(Stage stage) throws Exception {
        setup(stage);

        kontoExample();

    }
}
