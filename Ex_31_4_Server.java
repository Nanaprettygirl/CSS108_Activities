package Activity_14;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Ex_31_4_Server extends Application {
    int clients = 0;
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        TextArea text;
        BorderPane pane = new BorderPane();
        text = new TextArea("Exercise31_04Sever started at " + new Date() + '\n');
        pane.setTop(text);
        primaryStage.setScene(new Scene(pane, 500, 500));
        primaryStage.setTitle("Exercise 31.4 Server");
        primaryStage.show();
        new Thread(() -> {
            try {
                ServerSocket serverSocket = new ServerSocket(5557);
            for (; ;) {
                Socket socket = serverSocket.accept();
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                Platform.runLater(() -> {
                    text.appendText("Starting thread " + ++clients + "\n");
                    try {
                        dataOutputStream.writeInt(clients);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    InetAddress inetAddress = socket.getInetAddress();
                    text.appendText("Client IP /" + inetAddress.getHostAddress() + '\n');
                });
            }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
