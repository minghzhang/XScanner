module XScanner {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires tess4j;
    //requires logback.core;
    //requires logback.classic;
    requires org.slf4j;
    opens com.louis.xscanner to javafx.fxml;
    exports com.louis.xscanner;
}
