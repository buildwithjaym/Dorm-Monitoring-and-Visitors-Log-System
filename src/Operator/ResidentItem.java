package Operator;

public class ResidentItem {
    private final int residentId;
    private final String fullName;
    private final String roomNo;

    public ResidentItem(int residentId, String fullName, String roomNo) {
        this.residentId = residentId;
        this.fullName = fullName;
        this.roomNo = roomNo;
    }

    public int getResidentId() {
        return residentId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getRoomNo() {
        return roomNo;
    }

    @Override
    public String toString() {
        return fullName + " | Room " + roomNo;
    }
}