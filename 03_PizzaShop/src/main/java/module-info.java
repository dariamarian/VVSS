module pizzashop {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.desktop;

    opens pizzashop.model to javafx.base;
    exports pizzashop.model;
    opens pizzashop to javafx.fxml;
    exports pizzashop.repository;
    opens pizzashop.controller to javafx.fxml;
    exports pizzashop.controller;
    exports pizzashop.service;
    opens pizzashop.service to junit;
    opens pizzashop.repository to junit;
}
