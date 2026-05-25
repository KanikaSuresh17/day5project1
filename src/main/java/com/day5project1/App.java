package com.day5project1;

import com.day5project1.dao.BugDAO;
import com.day5project1.model.Bug;
import java.util.List;
import com.day5project1.util.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        BugDAO bugDAO = new BugDAO();
        Bug bug1 = new Bug(1, "login issue", "unable to login with valid credentials", "open");
        bugDAO.insertBug(bug1);
        Bug bug2 = new Bug(2, "page load error", "home page takes too long to load", "open");
        bugDAO.insertBug(bug2);
        List<Bug> bugs = bugDAO.getAllBugs();
        for (Bug bug : bugs) {
            System.out.println(bug.getId());
            System.out.println(bug.getTitle());
            System.out.println(bug.getDescription());
            System.out.println(bug.getStatus());
            System.out.println("----------------------------");
        }
    }
}
