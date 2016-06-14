package io.github.asvid.notificationsengine;

import java.util.ArrayList;

/**
 * Created by adam on 14.06.16.
 */
public class CustomNotification {

    private String title;
    private String txt;
    private ArrayList<NotificationAction> actions;
    private int icon;

    public CustomNotification(String title, String txt) {
        this.title = title;
        this.txt = txt;
    }

    public CustomNotification(String title, String txt, int icon) {
        this.title = title;
        this.txt = txt;
        this.icon = icon;
    }

    public CustomNotification(String title, String txt, ArrayList<NotificationAction> actions, int icon) {
        this.title = title;
        this.txt = txt;
        this.actions = actions;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public String getTxt() {
        return txt;
    }

    public ArrayList<NotificationAction> getActions() {
        return actions;
    }

    public int getIcon() {
        return icon;
    }
}