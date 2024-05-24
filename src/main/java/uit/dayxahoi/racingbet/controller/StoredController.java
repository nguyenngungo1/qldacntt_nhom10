package uit.dayxahoi.racingbet.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import uit.dayxahoi.racingbet.MyApplication;
import uit.dayxahoi.racingbet.model.ItemStore;
import uit.dayxahoi.racingbet.model.User;
import uit.dayxahoi.racingbet.util.Toast;
import uit.dayxahoi.racingbet.view.MenuViewManager;

import java.net.URL;
import java.util.ResourceBundle;

public class StoredController implements Initializable {

    @FXML
    private Label HienThiTienLabel;

    @FXML
    private Label MapCoDienPane;

    @FXML
    private Button MuaMapCityButton;

    @FXML
    private Button MuaMapBeachButton;

    @FXML
    private Button MuaSkinFriendButton;

    @FXML
    private Button MuaSkinShipButton;

    @FXML
    private Button QuayLaiButton;

    @FXML
    private Label SkinDXHPane;

    String userName = MyApplication.getInstance().getStorage().userName;

    @FXML
    void muaMapCity(MouseEvent event) {
        // MuaMapCoDienButton.setStyle("-fx-background-color: rgba(143,131,121,0.5);");
        Stage stage = (Stage) MuaMapCityButton.getScene().getWindow();
        if (user.getGold() >= itemStore.getItemMap1Price()) {
            user.getItemStore().setItemMap1(true);
            user.setGold(user.getGold() - itemStore.getItemMap1Price());
            itemStore = user.getItemStore();
            CommonController.getInstance().writeObjectToFile(user, userName);
            HienThiTienLabel.setText("$" + user.getGold());
            MuaMapCityButton.setDisable(true);
        } else {
            String toastMsg = "Hổng đủ tiền rồi bạn ơi :(( !";
            int toastMsgTime = 2000; // 2 seconds
            int fadeInTime = 500; // 0.5 seconds
            int fadeOutTime = 500; // 0.5 seconds
            Toast.makeText(stage, toastMsg, toastMsgTime, fadeInTime, fadeOutTime);
        }
    }

    @FXML
    void muaMapBeach(MouseEvent event) {
        Stage stage = (Stage) MuaMapBeachButton.getScene().getWindow();
        if (user.getGold() >= itemStore.getItemMap2Price()) {
            user.getItemStore().setItemMap2(true);
            user.setGold(user.getGold() - itemStore.getItemMap2Price());
            itemStore = user.getItemStore();
            CommonController.getInstance().writeObjectToFile(user, userName);
            HienThiTienLabel.setText("$" + user.getGold());
            MuaMapBeachButton.setDisable(true);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Thông báo");
            alert.setHeaderText("Mua hàng thành công");
            alert.setContentText("Cám ơn bạn đã mua hàng");
            alert.showAndWait();
        } else {
            String toastMsg = "Hổng đủ tiền rồi bạn ơi :(( !";
            int toastMsgTime = 2000; // 2 seconds
            int fadeInTime = 500; // 0.5 seconds
            int fadeOutTime = 500; // 0.5 seconds
            Toast.makeText(stage, toastMsg, toastMsgTime, fadeInTime, fadeOutTime);
        }
    }

    @FXML
    void muaSkinFriend(MouseEvent event) {
        Stage stage = (Stage) MuaSkinFriendButton.getScene().getWindow();
        if (user.getGold() >= itemStore.getItemSkin2Price()) {
            user.getItemStore().setItemSkin2(true);
            user.setGold(user.getGold() - itemStore.getItemSkin2Price());
            itemStore = user.getItemStore();
            CommonController.getInstance().writeObjectToFile(user, userName);
            HienThiTienLabel.setText("$" + user.getGold());
            MuaSkinFriendButton.setDisable(true);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Thông báo");
            alert.setHeaderText("Mua hàng thành công");
            alert.setContentText("Cám ơn bạn đã mua hàng");
            alert.showAndWait();
        } else {
            String toastMsg = "Hổng đủ tiền rồi bạn ơi :(( !";
            int toastMsgTime = 2000; // 2 seconds
            int fadeInTime = 500; // 0.5 seconds
            int fadeOutTime = 500; // 0.5 seconds
            Toast.makeText(stage, toastMsg, toastMsgTime, fadeInTime, fadeOutTime);
        }

    }

    @FXML
    void muaSkinShip(MouseEvent event) {
        Stage stage = (Stage) MuaSkinShipButton.getScene().getWindow();
        if (user.getGold() >= itemStore.getItemSkin1Price()) {
            user.getItemStore().setItemSkin1(true);
            user.setGold(user.getGold() - itemStore.getItemSkin1Price());
            itemStore = user.getItemStore();
            CommonController.getInstance().writeObjectToFile(user, userName);
            HienThiTienLabel.setText("$" + user.getGold());
            MuaSkinShipButton.setDisable(true);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Thông báo");
            alert.setHeaderText("Mua hàng thành công");
            alert.setContentText("Cám ơn bạn đã mua hàng");
            alert.showAndWait();
        } else {
            String toastMsg = "Hổng đủ tiền rồi bạn ơi :(( !";
            int toastMsgTime = 2000; // 2 seconds
            int fadeInTime = 500; // 0.5 seconds
            int fadeOutTime = 500; // 0.5 seconds
            Toast.makeText(stage, toastMsg, toastMsgTime, fadeInTime, fadeOutTime);
        }
    }

    @FXML
    void quayLai(MouseEvent event) {
        Stage stage = (Stage) QuayLaiButton.getScene().getWindow();
        // stage.close();
        MenuViewManager manager = new MenuViewManager();
        manager.backMenu(stage);
    }

    @FXML
    private AnchorPane root;

    private User user;
    private ItemStore itemStore;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Lấy kích thước màn hình
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();

        // Thiết lập kích thước cho AnchorPane
        root.setPrefWidth(screenBounds.getWidth());
        root.setPrefHeight(screenBounds.getHeight());

        user = (User) CommonController.getInstance().readObjectFromFile(userName);
        itemStore = user.getItemStore();

        HienThiTienLabel.setText("$" + user.getGold());

        if (itemStore.isItemMap2()) {
            MuaMapBeachButton.setDisable(true);
        }
        if (itemStore.isItemMap1()) {
            MuaMapCityButton.setDisable(true);
        }

        if (itemStore.isItemSkin1()) {
            MuaSkinShipButton.setDisable(true);
        }
        if (itemStore.isItemSkin2()) {
            MuaSkinFriendButton.setDisable(true);
        }

    }
}
