package com.day5project1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

import com.day5project1.model.Bug;
import com.day5project1.util.DBUtil;

public class BugDAO {

    public void insertBug(Bug bug) {

        Connection con = DBUtil.getConnection();

        try {

            PreparedStatement ps = con.prepareStatement("insert into bug values(?,?,?,?)");

            ps.setInt(1, bug.getId());
            ps.setString(2, bug.getTitle());
            ps.setString(3, bug.getDescription());
            ps.setString(4, bug.getStatus());

            ps.executeUpdate();

            System.out.println("bug inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<Bug> getAllBugs() {

        List<Bug> bugs = new ArrayList<>();

        Connection con = DBUtil.getConnection();

        try {

            PreparedStatement ps = con.prepareStatement("select * from bug");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String title = rs.getString("title");
                String description = rs.getString("description");
                String status = rs.getString("status");

                Bug bug = new Bug(id, title, description, status);

                bugs.add(bug);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return bugs;
    }
}