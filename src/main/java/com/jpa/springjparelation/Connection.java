package com.jpa.springjparelation;

public class Connection {

    // Patron Singleton
    // Connection.getInstance().getUsername();

    private static Connection instance;
    private String username;
    private String password;
    private String host;
    private String port;

    private Connection(){}


    public static Connection getInstance(){
        if(instance == null)
            instance = new Connection();

        return instance;

    }



    // Getters y Setters


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }


}
