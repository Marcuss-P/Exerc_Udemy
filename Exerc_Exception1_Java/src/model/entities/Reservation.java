package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainExceptions;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut){
		if (!checkOut.after(checkIn)) {
			throw new DomainExceptions( "Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		//Transforming the date "diff" with the 
		//milliseconds checkOut - milliseconds checkIn
		long diff = checkOut.getTime() - checkIn.getTime();
		//returning converted milliseconds to days
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		
	}
	
	public void updateDate(Date checkIn, Date checkOut){
		
		Date now = new Date();
		//se alguma data for anterior a data de agr
		if(checkIn.before(now) || checkOut.before(now)) {
			//IllegalArgumentException metodo ja criado pelo java
			throw new DomainExceptions( "Reservation dates for update must be future dates");
		} // nn se usa o else if pois o return quebra o if caso atenda aos requisitos
		if (!checkOut.after(checkIn)) {
			throw new DomainExceptions( "Check-out date must be after check-in date");
		}
		
		//checkIn of the object receive the checkIn of the argument
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		//retorna nulo pois caso as String tenha dado falso o updateDate nn deve ser String
		
	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+", check-in: "
				+ sdf.format(checkIn)
				+", check-out: "
				+ sdf.format(checkOut)
				+", "
				+ duration()
				+ " nights.";
	}
	
}
