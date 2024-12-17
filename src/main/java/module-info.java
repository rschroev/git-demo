module com.rowin.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.rowin.gitdemo to javafx.fxml;
    exports com.rowin.gitdemo;
}