import db.DBConnection;
import view.ItemView;
import view.OrderView;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBConnection.getInstance().getConnection();
        new ItemView().setVisible(true);
        new OrderView().setVisible(true);
    }
}
