import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
        public static void connect() throws SQLException{
            String url = "conexion";//Cambia dependiendo de la BD que usemos
            String user = "root";
            String password = "12345"; //Cambia dependiendo de la BD que usemos

            Connection connection = DriverManager.getConnection(url, user, password);

            System.out.println("Conexión exitosa a la BBDD");
            connection.close();
        }
}
