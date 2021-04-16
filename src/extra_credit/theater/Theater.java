package extra_credit.theater;

import java.util.List;
import java.util.stream.Collectors;

public class Theater {
	List<Seat> seats;
	int row;
	int column;
	
	
	
	void showAllEmptySeats() {
		seats.stream().filter(n -> !n.isReserved()).forEach(System.out::println);
	}
	void showAllReservedSeats() {
		seats.stream().filter(n -> n.isReserved()).forEach(System.out::println);
	}
	Seat reserveASeat(Person p) {
		return seats.stream().filter(n -> !n.isReserved()).map(s -> {
			s.setReserved(true); s.setPerson(p);
			return s;
		}).findFirst().get(); 
//		for(Seat s: seats) {
//			if(!s.reserved) {
//				s.setReserved(true);
//				s.setPerson(p);
//
//				return s;
//			}
//		}
//		return null;
	}
    void unreserveASeat(Seat s) {
    	s.setReserved(false);
    	s.setPrice(0);
    }
	void emptyAllSeats() {
		seats.stream().map(s -> {
			s.setReserved(false);
			s.setPerson(null);
			return s;
		});
//		for(Seat s: seats) {
//			s.setReserved(false);
//			s.setPerson(null);
//		}
	}
	void reserveAllSeats() {
		seats.stream().map(s -> {
			s.setReserved(true);
			return s;
		}).collect(Collectors.toList());
//		for(Seat s: seats) {
//			s.setReserved(true);
//		}
	}
	public Theater(List<Seat> seats, int row, int column) {
		super();
		this.seats = seats;
		this.row = row;
		this.column = column;
	}

}