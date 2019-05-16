package com.polytech.polyNet.repository;

import com.polytech.polyNet.business.Story;
import com.polytech.polyNet.repository.StoryRepository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcStoryRepository implements StoryRepository {


    private DataSource dataSource;

    public JdbcStoryRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Story> findAll() {

        List<Story> results = new ArrayList();
        try {
            //GET CONNECTION
            Connection connection = dataSource.getConnection();
            String sql = "SELECT * FROM story";
            //EXECUTE QUERY
            ResultSet resultSet = connection.createStatement().executeQuery(sql);

            // FOR EACH ROW IN DATA BASE
            while (resultSet.next()) {
                // I GET THE CONTENT COLUMN
                String content = resultSet.getString("CONTENT");
                Story story = new Story(content);
                // I ADD THE STORY TO THE RESULT
                results.add(story);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return results;
    }

    @Override
    public void save(Story story) {
        try {
            //GET CONNECTION
            Connection connection = dataSource.getConnection();
            String sql = "INSERT INTO story(CONTENT) VALUES('" + story.getContent() + "')";
            //EXECUTE QUERY
            connection.createStatement().execute(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
