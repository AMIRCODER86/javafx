package org.example.javafx;

import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private Button bt_next;

    @FXML
    private Button finish;

    @FXML
    private ImageView img_books;

    @FXML
    private Label lb_guide;

    @FXML
    private Label lb_guide_hour;

    @FXML
    private Label lb_guide_teachers;

    @FXML
    private Label lb_lesson_teacher;

    @FXML
    private Label lb_name_teacher;

    @FXML
    private Label lb_text;

    @FXML
    private JFXListView<?> list_teachers;

    @FXML
    private JFXRadioButton rb_Monday;

    @FXML
    private JFXRadioButton rb_Tuesday;

    @FXML
    private JFXRadioButton rb_Wednesday;

    @FXML
    private JFXRadioButton rb_four_bell_monday;

    @FXML
    private JFXRadioButton rb_four_bell_saturday;

    @FXML
    private JFXRadioButton rb_four_bell_sunday;

    @FXML
    private JFXRadioButton rb_four_bell_tuesday;

    @FXML
    private JFXRadioButton rb_four_bell_wednesday;

    @FXML
    private JFXRadioButton rb_one_bell_monday;

    @FXML
    private JFXRadioButton rb_one_bell_saturday;

    @FXML
    private JFXRadioButton rb_one_bell_sunday;

    @FXML
    private JFXRadioButton rb_one_bell_tuesday;

    @FXML
    private JFXRadioButton rb_one_bell_wednesday;

    @FXML
    private JFXRadioButton rb_saturday;

    @FXML
    private JFXRadioButton rb_sunday;

    @FXML
    private JFXRadioButton rb_three_bell_monday;

    @FXML
    private JFXRadioButton rb_three_bell_sunday;

    @FXML
    private JFXRadioButton rb_three_bell_tuesday;

    @FXML
    private JFXRadioButton rb_three_bell_wednesday;

    @FXML
    private JFXRadioButton rb_tow_bell_monday;

    @FXML
    private JFXRadioButton rb_tow_bell_saturday;

    @FXML
    private JFXRadioButton rb_tow_bell_sunday;

    @FXML
    private JFXRadioButton rb_tow_bell_tuesday;

    @FXML
    private JFXRadioButton rb_tow_bell_wednesday;

    @FXML
    private TabPane tab_Information;

    @FXML
    private Tab tab_classes;

    @FXML
    private Tab tab_teachers;

    @FXML
    private TextField txf_name_lesson;

    @FXML
    private TextField txf_name_teacher;

    @FXML
    void pressFinish(ActionEvent event) {

    }

    @FXML
    void pressNext(ActionEvent event) {

    }

}
