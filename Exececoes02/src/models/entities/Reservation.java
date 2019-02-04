package models.entities;

import model.exceptions.DomainExcepetion;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date chackIn;
    private Date checkOut;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainExcepetion {
        if (!checkOut.after(checkIn)) {

            throw new DomainExcepetion("Error in reservation: check-out date must be after check-in date.");
        }
        this.roomNumber = roomNumber;
        this.chackIn = chackIn;
        this.checkOut = checkOut;

    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getChackIn() {
        return chackIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - chackIn.getTime();
        //diferença entre duas datas em milisegundos
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDate(Date checkin, Date checkou) throws DomainExcepetion {
        Date now = new Date();
        if (checkin.before(now) || checkou.before(now)) {
            throw new DomainExcepetion("Reservation dates for update must be future dates");
        }
        if (!checkou.after(checkin)) {

            throw new DomainExcepetion("Error in reservation: check-out date must be after check-in date.");
        }
        this.chackIn = checkin;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room " + getRoomNumber() + ", checkin: " + sdf.format(chackIn) +
                ", checkout " + sdf.format(checkOut) + ", " + duration() + " nights";
    }

}
