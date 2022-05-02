package Activity_14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Ex_31_4_Client extends Application {
    Label label;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        label = new Label();
        try {
            Socket socket = new Socket("localhost", 5557);
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            label.setText("You're visitor " + dataInputStream.readInt());
            StackPane pane = new StackPane();
            pane.getChildren().add(label);
            Scene scene = new Scene(pane, 300, 75);
            primaryStage.setTitle("Exercise31_04Client");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
