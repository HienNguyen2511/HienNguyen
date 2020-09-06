import Model.DTO.Book;
import View.AuthorView;
import View.BookView;
import com.sun.jdi.connect.Connector;
import helper.DatabaseUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        BookView view = new BookView();
        view.renderView();
        AuthorView view1 = new AuthorView();
        view1.renderView();

    }
}