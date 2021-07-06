/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 RAYME PERSAD
 */


package ucf.assignments;

import java.io.IOException;

public class todoList  extends Application{

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource(name:"Todo.fxml"));

                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.setTitle("Todo");
                primaryStage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
}
