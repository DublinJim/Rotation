package com.example.rotation;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Pane pane1;

    @FXML
    private PieChart piChart;

    @FXML
    void hidePanel() {
      (pane1).setVisible (false);

    }

    @FXML
    void showPanel() {
        (pane1).setVisible (true);

    }





    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<PieChart.Data> piChartData = FXCollections.observableArrayList (
                new PieChart.Data ("Zx81", 20),
                new PieChart.Data ("Zx Spectrum", 14),
                new PieChart.Data ("C64", 40),
                new PieChart.Data ("Oric 1", 40)

        );


       piChartData.forEach (data ->

                data.nameProperty ().bind (Bindings.concat (data
                        .getName (), " Value: ", data.pieValueProperty ()))

        );
        piChart.setData (piChartData);
    }

    @FXML
    void closeApp() {
       Platform.exit ();

    }





}
