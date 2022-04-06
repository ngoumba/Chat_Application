package ucad.esp.dgi.chatapplication.Models.Ressources;

import java.util.ArrayList;

public class Status {
    String statusId,
            userId;

    ArrayList<String> statuslList;

    public Status() {

        this.statusId = statusId;
        this.userId = userId;
        this.statuslList = statuslList;

    }

    public String getstatusId() {
        return statusId;
    }

    public String getuserId() {
        return userId;
    }


    public ArrayList<String> getstatuslList() {
        return statuslList;
    }
}
