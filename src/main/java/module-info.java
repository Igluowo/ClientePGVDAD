module proyecto.clienteproyectopgv {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.github.oshi;
    requires java.base;

    opens proyecto.clienteproyectopgv to javafx.fxml;
    exports proyecto.clienteproyectopgv;
}
