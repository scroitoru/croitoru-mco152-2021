package croitoru.physics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.*;

public class RocketController {
    @FXML
    TextField velocityField;
    @FXML
    TextField angleField;
    @FXML
    TextField secondsField;
    @FXML
    private Text actionTarget;


    public void calculateRocket(ActionEvent actionEvent) {
        double velocity = Double.parseDouble(velocityField.getText());
        double angle = Double.parseDouble(angleField.getText());
        double seconds = Double.parseDouble(secondsField.getText());

        Rocket rocket = new Rocket(velocity, angle);
        double xResult = rocket.getX(seconds);
        double yResult = rocket.getY(seconds);
        double flightTimeResult = rocket.getFlightTime();
        actionTarget.setText("X = " + xResult + "\nY= " + yResult +
                "\nFlight Time = " + flightTimeResult);
    }
}
