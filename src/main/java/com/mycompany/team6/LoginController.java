package com.mycompany.team6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.json.JSONArray;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONTokener;

public class LoginController implements Serializable {

    private static FileWriter file;
    private User authorizedUser;
    private User currentUser;
    private String directory;

    public LoginController(User cUser) {
        this.currentUser = cUser;
    }

    public void setPath(String path) {
        this.directory = path;
        System.out.println("Path set to: " + this.directory);
    }

    public String getPath() {
        return directory;
    }

    public LoginController(String user, String pass) {
        User cUser = new User();
        cUser.setUser(user);
        cUser.setPass(pass);
        this.currentUser = cUser;
    }

    public void setUser(User user) {

        this.currentUser = user;
    }

    LoginController() {
        try {
            Path filePath = Path.of(System.getenv("LOCALAPPDATA") + "\\pmsloc.txt");
            String content = Files.readString(filePath);
            directory = content;
            if (content == "" || content == null) {
                directory = (System.getenv("LOCALAPPDATA") + "\\pms");
                PrintWriter out = new PrintWriter(System.getenv("LOCALAPPDATA") + "\\pmsloc.txt");
                Path path = Paths.get((System.getenv("LOCALAPPDATA") + "\\pmsloc.txt"));
                out.println((System.getenv("LOCALAPPDATA") + "\\pms"));
                Files.writeString(path, directory, StandardCharsets.UTF_8);
                System.out.println("Created pmsloc.txt");
            }
            new File((System.getenv("LOCALAPPDATA") + "\\pms")).mkdirs();
        } catch (Exception e) {

            try {
                PrintWriter out = new PrintWriter(System.getenv("LOCALAPPDATA") + "\\pmsloc.txt");
                out.println((System.getenv("LOCALAPPDATA") + "\\pms"));

            } catch (Exception ex) {
                System.out.print("Warning, exception reading directory: " + ex.toString());
            }
            System.out.print("Warning, exception reading directory: " + e.toString());
        }

    }

    public ArrayList getUsers() {
        JSONTokener jsonToken;
        ArrayList<User> list = new ArrayList<>();
        JSONObject jo = new JSONObject();
        JSONObject jo2 = new JSONObject();
        jo.put("username", "test");
        jo.put("password", "test");
        jo2.put("username", "dentist");
        jo2.put("password", "dentist");
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(jo);
        jsonArray.put(jo2);
        this.exportData(jsonArray);
        try {
            jsonToken = new JSONTokener(new FileReader(directory + "/users.json"));
        } //JSONArray jsonArray = new JSONArray(jsonToken);
        //JSONArray jsonArray = new JSONArray();
        catch (Exception e) {
            System.out.println("There was an issue with your request " + e.toString());
        }
        System.out.println(jsonArray.toString());
        System.out.println(jsonArray.get(0));
        for (int i = 0; i < jsonArray.length(); i++) {
            User u = new User();
            u.setUser(jsonArray.getJSONObject(i).getString("username"));
            u.setPass(jsonArray.getJSONObject(i).getString("password"));
            list.add(u);
        }

        return list;
    }

    public void exportData(JSONArray list) {
        try {

            // Constructs a FileWriter given a file name, using the platform's default charset
            System.out.println("Directory: " + directory);
            file = new FileWriter(directory + "\\users.json");
            JSONObject obj = new JSONObject();
            for (int i = 0; i < list.length(); i++) {
                obj = list.getJSONObject(i);
                file.write(obj.toString());
                System.out.println(obj.toString());
            }

        } catch (Exception e) {
            System.out.println("There was an issue with your request (file write) " + e.toString());

        } finally {

            try {
                // file.flush();
                file.close();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                System.out.println("There was an issue with your request " + e.toString());
            }
        }
    }

    public boolean queryUsers(User user1) {
        boolean authorized = false;
        ArrayList<User> users = getUsers();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUser().equals(user1.getUser())) {
                if (users.get(i).getPass().equals(user1.getPass())) {
                    authorized = true;
                }
            }
            this.authorizedUser = users.get(i);
        }
        return authorized;
    }

    public boolean checkCurrentUser() {
        return queryUsers(currentUser);
    }

}
