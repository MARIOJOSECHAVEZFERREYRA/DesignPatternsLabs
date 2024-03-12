package org.example.LabsTP.LabN6;

import org.jetbrains.annotations.NotNull;

import java.sql.*;

public class DatabaseService {


    public void exec() {
        DBproperties properties = DBproperties.getProperties();
        try (Connection connection = DriverManager.getConnection(
                properties.getUrl(),
                properties.getUser(),
                properties.getPassword()
        )) {
            getStudents(connection);
            addStudent(connection);
            updateStudent(connection);
            transaction(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void getStudents(@NotNull Connection connection) throws SQLException {
        String query = "SELECT * FROM student";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            try (ResultSet result = statement.executeQuery()) {
                while (result.next()) {
                    System.out.println("id: " + result.getInt("id"));
                    System.out.println("name: " + (result.getString("name")));
                    System.out.println("surname: " + result.getString("surname"));
                    System.out.println("group_id: " + result.getString("group_id"));
                    System.out.println("-----");
                }
            }
        }
    }

    private void addStudent(@NotNull Connection connection) throws SQLException {
        String query = "INSERT INTO student (name, surname, group_id) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "Александр");
            statement.setString(2, "Петров");
            statement.setLong(3, 1);
            statement.executeUpdate();
        }
    }

    private void updateStudent(@NotNull Connection connection) throws SQLException {
        String query = "UPDATE student SET name = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "Александр Третий");
            statement.setLong(2, 5);
            statement.execute();
        }
    }

    private void transaction(@NotNull Connection connection) throws SQLException {
        String query = "UPDATE student SET name = ? WHERE id = ?";
        connection.setAutoCommit(false);
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, "Сергей непонятный");
            statement.setLong(2, 6);
            statement.execute();

            String example = null;
            example.toString();
            connection.commit();
        } catch (RuntimeException e) {
            connection.rollback();
        } finally {
            connection.setAutoCommit(true);
        }
    }

}
