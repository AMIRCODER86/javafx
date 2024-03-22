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

import java.util.ArrayList;
import java.util.List;

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
        if (chb_monday.isSelected()){
            chb_one_bell_monday.setSelected(true);
            chb_one_bell_monday.setDisable(false);

            chb_tow_bell_monday.setSelected(true);
            chb_tow_bell_monday.setDisable(false);

            chb_three_bell_monday.setSelected(true);
            chb_three_bell_monday.setDisable(false);

            chb_four_bell_monday.setSelected(true);
            chb_four_bell_monday.setDisable(false);

        }
        else {
            chb_one_bell_monday.setSelected(false);
            chb_one_bell_monday.setDisable(true);

            chb_tow_bell_monday.setSelected(false);
            chb_tow_bell_monday.setDisable(true);

            chb_three_bell_monday.setSelected(false);
            chb_three_bell_monday.setDisable(true);

            chb_four_bell_monday.setSelected(false);
            chb_four_bell_monday.setDisable(true);
        }
    }

    @FXML
    void select_chb_saturday(ActionEvent event) {
        if (chb_saturday.isSelected()){
            chb_one_bell_saturday.setSelected(true);
            chb_one_bell_saturday.setDisable(false);

            chb_tow_bell_saturday.setSelected(true);
            chb_tow_bell_saturday.setDisable(false);

            chb_three_bell_saturday.setSelected(true);
            chb_three_bell_saturday.setDisable(false);

            chb_four_bell_saturday.setSelected(true);
            chb_four_bell_saturday.setDisable(false);

        }
        else {
            chb_one_bell_saturday.setSelected(false);
            chb_one_bell_saturday.setDisable(true);

            chb_tow_bell_saturday.setSelected(false);
            chb_tow_bell_saturday.setDisable(true);

            chb_three_bell_saturday.setSelected(false);
            chb_three_bell_saturday.setDisable(true);

            chb_four_bell_saturday.setSelected(false);
            chb_four_bell_saturday.setDisable(true);
        }
    }

    @FXML
    void select_chb_sunday(ActionEvent event) {
        if (chb_sunday.isSelected()){
            chb_one_bell_sunday.setSelected(true);
            chb_one_bell_sunday.setDisable(false);

            chb_tow_bell_sunday.setSelected(true);
            chb_tow_bell_sunday.setDisable(false);

            chb_three_bell_sunday.setSelected(true);
            chb_three_bell_sunday.setDisable(false);

            chb_four_bell_sunday.setSelected(true);
            chb_four_bell_sunday.setDisable(false);

        }
        else {
            chb_one_bell_sunday.setSelected(false);
            chb_one_bell_sunday.setDisable(true);

            chb_tow_bell_sunday.setSelected(false);
            chb_tow_bell_sunday.setDisable(true);

            chb_three_bell_sunday.setSelected(false);
            chb_three_bell_sunday.setDisable(true);

            chb_four_bell_sunday.setSelected(false);
            chb_four_bell_sunday.setDisable(true);
        }
    }

    @FXML
    void select_chb_tuesday(ActionEvent event) {
        if (chb_tuesday.isSelected()){
            chb_one_bell_tuesday.setSelected(true);
            chb_one_bell_tuesday.setDisable(false);

            chb_tow_bell_tuesday.setSelected(true);
            chb_tow_bell_tuesday.setDisable(false);

            chb_three_bell_tuesday.setSelected(true);
            chb_three_bell_tuesday.setDisable(false);

            chb_four_bell_tuesday.setSelected(true);
            chb_four_bell_tuesday.setDisable(false);

        }
        else {
            chb_one_bell_tuesday.setSelected(false);
            chb_one_bell_tuesday.setDisable(true);

            chb_tow_bell_tuesday.setSelected(false);
            chb_tow_bell_tuesday.setDisable(true);

            chb_three_bell_tuesday.setSelected(false);
            chb_three_bell_tuesday.setDisable(true);

            chb_four_bell_tuesday.setSelected(false);
            chb_four_bell_tuesday.setDisable(true);
        }
    }

    @FXML
    void select_chb_wednesday(ActionEvent event) {
        if (chb_wednesday.isSelected()){
            chb_one_bell_wednesday.setSelected(true);
            chb_one_bell_wednesday.setDisable(false);

            chb_tow_bell_wednesday.setSelected(true);
            chb_tow_bell_wednesday.setDisable(false);

            chb_three_bell_wednesday.setSelected(true);
            chb_three_bell_wednesday.setDisable(false);

            chb_four_bell_wednesday.setSelected(true);
            chb_four_bell_wednesday.setDisable(false);

        }
        else {
            chb_one_bell_wednesday.setSelected(false);
            chb_one_bell_wednesday.setDisable(true);

            chb_tow_bell_wednesday.setSelected(false);
            chb_tow_bell_wednesday.setDisable(true);

            chb_three_bell_wednesday.setSelected(false);
            chb_three_bell_wednesday.setDisable(true);

            chb_four_bell_wednesday.setSelected(false);
            chb_four_bell_wednesday.setDisable(true);
        }
    }
    public Boolean[][] getListCheckBox(Boolean[][] list){
       list[0][0] = chb_one_bell_saturday.isSelected();
       list[0][1] = chb_tow_bell_saturday.isSelected();
       list[0][2] = chb_three_bell_saturday.isSelected();
       list[0][3] = chb_four_bell_saturday.isSelected();

       list[1][0] = chb_one_bell_sunday.isSelected();
       list[1][1] = chb_tow_bell_sunday.isSelected();
       list[1][2] = chb_three_bell_sunday.isSelected();
       list[1][3] = chb_four_bell_sunday.isSelected();

       list[2][0] = chb_one_bell_monday.isSelected();
       list[2][1] = chb_tow_bell_monday.isSelected();
       list[2][2] = chb_three_bell_monday.isSelected();
       list[2][3] = chb_four_bell_monday.isSelected();

       list[3][0] = chb_one_bell_tuesday.isSelected();
       list[3][1] = chb_tow_bell_tuesday.isSelected();
       list[3][2] = chb_three_bell_tuesday.isSelected();
       list[3][3] = chb_four_bell_tuesday.isSelected();

       list[4][0] = chb_one_bell_wednesday.isSelected();
       list[4][1] = chb_tow_bell_wednesday.isSelected();
       list[4][2] = chb_three_bell_wednesday.isSelected();
       list[4][3] = chb_four_bell_wednesday.isSelected();
        return list;
    }

}
