/* doesn't work with source level 1.8:
module com.mycompany.p1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.p1 to javafx.fxml;
    exports com.mycompany.p1;
}
*/
