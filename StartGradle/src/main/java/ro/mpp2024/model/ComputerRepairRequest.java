package ro.mpp2024.model;

import java.io.Serializable;

public class ComputerRepairRequest implements Identifiable<Integer>, Serializable {
    private int ID;
    private String ownerName;
    private String ownerAddress;
    private String phoneNumber;
    private String model;
    private String date;
    private String problemDescription;

    public ComputerRepairRequest() {
        this.ID = 0;
        this.ownerName = "";
        this.ownerAddress = "";
        this.phoneNumber = "";
        this.model = "";
        this.date = "";
        this.problemDescription = "";
    }

    public ComputerRepairRequest(int ID, String ownerName, String ownerAddress, String phoneNumber, String model, String date, String problemDescription) {
        this.ID = ID;
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
        this.phoneNumber = phoneNumber;
        this.model = model;
        this.date = date;
        this.problemDescription = problemDescription;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public Integer getID() {
        return ID;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                        ", ownerName='" + ownerName + '\'' +
                        ", model='" + model + '\'' +
                        ", date='" + date + '\'' +
                        ", problemDescription='" + problemDescription + '\'';

    }
}