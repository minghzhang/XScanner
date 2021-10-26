package com.louis.xscanner;

import com.louis.xscanner.util.TesseractAPI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.File;

public class HelloController {

    private Stage primaryStage;

    @FXML
    private Button settingButton;

    @FXML
    private ImageView imageView;

    @FXML
    private Button cropButton;

    @FXML
    private Button colorButton;

    @FXML
    private Button ocrButton;

    @FXML
    private Button fileChooserButton;

    @FXML
    private TextArea contentTextArea;

    @FXML
    private Button copyButton;

    @FXML
    private Button exportButton;

    @FXML
    private Button translateButton;

    @FXML
    private Button proofreadButton;

    @FXML
    void clickColorButton(ActionEvent event) {

    }

    @FXML
    void clickCopyButton(ActionEvent event) {
        String content = contentTextArea.getText();
        //复制内容到剪切板
        StringSelection stringSelection = new StringSelection(content);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, stringSelection);
    }

    @FXML
    void clickCropButton(ActionEvent event) {

    }

    @FXML
    void clickExportButton(ActionEvent event) {

    }

    @FXML
    void clickFileChooseButton(ActionEvent event) {

        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("image file (*.jpg)", "*.jpg");
        fileChooser.getExtensionFilters().add(extFilter);

        File file = fileChooser.showOpenDialog(primaryStage);

        imageView.setImage(new Image("file:" + file.getAbsolutePath()));
        System.out.println(file);
    }

    @FXML
    void clickOCR(ActionEvent event) {
        String imageUrl = imageView.getImage().getUrl();
        //String imageUrl = imageView.getImage().impl_getUrl();
        String fileUrl = imageUrl.substring(5);
        //String content = TesseractAPI.FindOCR(fileUrl, true);
        //contentTextArea.setText(content);
    }

    public static void main(String[] args) {
        String ss = "file:xxx/xx";
        System.out.println(ss.substring(5));
    }

    @FXML
    void clickProofreadButton(ActionEvent event) {

    }

    @FXML
    void clickSetting(ActionEvent event) {

    }

    @FXML
    void clickTranslateButton(ActionEvent event) {

    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Button getFileChooserButton() {
        return fileChooserButton;
    }
}
