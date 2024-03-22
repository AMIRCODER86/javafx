package org.example.javafx;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXListView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class MainController {

    @FXML
    private AnchorPane apane_main;

    @FXML
    private AnchorPane apane_tab_classes;

    @FXML
    private AnchorPane apane_teb_teachers;

    @FXML
    private Button bt_finish_lesson;

    @FXML
    private Button bt_finish_teachers;

    @FXML
    private Button bt_next_teachers;

    @FXML
    private Button bt_ok_lesson;

    @FXML
    private ComboBox<?> cbox_selection_lesson;

    @FXML
    private JFXCheckBox chb_four_bell_monday;

    @FXML
    private JFXCheckBox chb_four_bell_saturday;

    @FXML
    private JFXCheckBox chb_four_bell_sunday;

    @FXML
    private JFXCheckBox chb_four_bell_tuesday;

    @FXML
    private JFXCheckBox chb_four_bell_wednesday;

    @FXML
    private JFXCheckBox chb_monday;

    @FXML
    private JFXCheckBox chb_one_bell_monday;

    @FXML
    private JFXCheckBox chb_one_bell_saturday;

    @FXML
    private JFXCheckBox chb_one_bell_sunday;

    @FXML
    private JFXCheckBox chb_one_bell_tuesday;

    @FXML
    private JFXCheckBox chb_one_bell_wednesday;

    @FXML
    private JFXCheckBox chb_saturday;

    @FXML
    private JFXCheckBox chb_sunday;

    @FXML
    private JFXCheckBox chb_three_bell_monday;

    @FXML
    private JFXCheckBox chb_three_bell_saturday;

    @FXML
    private JFXCheckBox chb_three_bell_sunday;

    @FXML
    private JFXCheckBox chb_three_bell_tuesday;

    @FXML
    private JFXCheckBox chb_three_bell_wednesday;

    @FXML
    private JFXCheckBox chb_tow_bell_monday;

    @FXML
    private JFXCheckBox chb_tow_bell_saturday;

    @FXML
    private JFXCheckBox chb_tow_bell_sunday;

    @FXML
    private JFXCheckBox chb_tow_bell_tuesday;

    @FXML
    private JFXCheckBox chb_tow_bell_wednesday;

    @FXML
    private JFXCheckBox chb_tuesday;

    @FXML
    private JFXCheckBox chb_wednesday;

    @FXML
    private ImageView img_books;

    @FXML
    private Label lb_guide;

    @FXML
    private Label lb_guide_hour;

    @FXML
    private Label lb_guide_lesson;

    @FXML
    private Label lb_guide_niaz_lesson;

    @FXML
    private Label lb_guide_teachers;

    @FXML
    private Label lb_lesson_teacher;

    @FXML
    private Label lb_name_class;

    @FXML
    private Label lb_name_teacher;

    @FXML
    private Label lb_selection_hour_niaz;

    @FXML
    private Label lb_selection_lesson;

    @FXML
    private Label lb_text;

    @FXML
    private JFXListView<?> list_lesson;

    @FXML
    private JFXListView<?> list_teachers;

    @FXML
    private Spinner<?> spn_selection_hour_niaz;

    @FXML
    private TabPane tab_Information;

    @FXML
    private Tab tab_classes;

    @FXML
    private Tab tab_teachers;

    @FXML
    private TextField txf_name_class;

    @FXML
    private TextField txf_name_lesson;

    @FXML
    private TextField txf_name_teacher;

    @FXML
    void pressFinisTeacher(ActionEvent event) {

    }

    @FXML
    void pressFinishLesson(ActionEvent event) {

    }

    @FXML
    void pressNextTeachers(ActionEvent event) {

    }

    @FXML
    void pressOkLesson(ActionEvent event) {

    }

    @FXML
    void select_chb_monday(ActionEvent event) {

    }

    @FXML
    void select_chb_saturday(ActionEvent event) {

    }

    @FXML
    void select_chb_sunday(ActionEvent event) {

    }

    @FXML
    void select_chb_tuesday(ActionEvent event) {

    }

    @FXML
    void select_chb_wednesday(ActionEvent event) {

    }

}
