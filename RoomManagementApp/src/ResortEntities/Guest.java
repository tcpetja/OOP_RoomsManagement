
package ResortEntities;

import java.util.Date;


public class Guest {
    String fullNames;
    String surname;
    String email;
    String cellNumber;
    String carReg;
    Integer adults;
    Integer kids;
    Integer guestCount;
    String suiteType;
    Date checkInDate;
    Date checkOutDate;
    Integer RoomNo;

    public Guest() {
    }

    public Guest(String fullNames, String surname, String email, String cellNumber, String carReg, Integer adults, Integer kids, Integer guestCount, String suiteType, Date checkInDate, Date checkOutDate, Integer RoomNo) {
        this.fullNames = fullNames;
        this.surname = surname;
        this.email = email;
        this.cellNumber = cellNumber;
        this.carReg = carReg;
        this.adults = adults;
        this.kids = kids;
        this.guestCount = guestCount;
        this.suiteType = suiteType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.RoomNo = RoomNo;
    }

    public String getFullNames() {
        return fullNames;
    }

    public void setFullNames(String fullNames) {
        this.fullNames = fullNames;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getCarReg() {
        return carReg;
    }

    public void setCarReg(String carReg) {
        this.carReg = carReg;
    }

    public Integer getAdults() {
        return adults;
    }

    public void setAdults(Integer adults) {
        this.adults = adults;
    }

    public Integer getKids() {
        return kids;
    }

    public void setKids(Integer kids) {
        this.kids = kids;
    }

    public Integer getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(Integer guestCount) {
        this.guestCount = guestCount;
    }

    public String getSuiteType() {
        return suiteType;
    }

    public void setSuiteType(String suiteType) {
        this.suiteType = suiteType;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Integer getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(Integer RoomNo) {
        this.RoomNo = RoomNo;
    }
    
    
    
}
