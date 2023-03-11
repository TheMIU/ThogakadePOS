package lk.ijse.thogakadepos.controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import lk.ijse.thogakadepos.model.OrderModel;
import lk.ijse.thogakadepos.util.Navigation;
import lk.ijse.thogakadepos.util.Routes;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

public class PlaceOrderFormController {
    @FXML
    private AnchorPane pane;

    @FXML
    private Label lblOrderId;

    @FXML
    private Label lblOrderDate;

    @FXML
    private JFXComboBox<?> cmbCustomerId;

    @FXML
    private Label lblCustomerName;

    @FXML
    private JFXComboBox<?> cmbItemCode;

    @FXML
    private Label lblDescription;

    @FXML
    private Label lblUnitPrice;

    @FXML
    private Label lblQtyOnHand;

    @FXML
    private TextField txtQty;

    @FXML
    private TableView<?> tblOrderCart;

    @FXML
    private TableColumn<?, ?> colItemCode;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colUnitPrice;

    @FXML
    private TableColumn<?, ?> colTotal;

    @FXML
    private TableColumn<?, ?> colAction;

    public void initialize(){
        lblOrderDate.setText(LocalDate.now().toString());
        lblOrderId.setText(getNextOrderID());
    }

    private String getNextOrderID() {
        try {
            String orderId = String.valueOf(OrderModel.generateNextOrderId());
            return orderId;
        } catch (SQLException | ClassNotFoundException e) {
            new Alert(Alert.AlertType.ERROR,e.toString()).show();
            return null;
        }
    }

    @FXML
    void btnAddToCartOnAction(ActionEvent event) {

    }

    @FXML
    void btnPlaceOrderOnAction(ActionEvent event) {

    }

    @FXML
    void cmbItemOnAction(ActionEvent event) {

    }

    @FXML
    void txtQtyOnAction(ActionEvent event) {

    }

    @FXML
    void btnBackOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.DASHBOARD, pane);
    }

    @FXML
    void btnNewCustomerOnAction(ActionEvent event) throws IOException {
        Navigation.navigate(Routes.CUSTOMER, pane);
    }

}
