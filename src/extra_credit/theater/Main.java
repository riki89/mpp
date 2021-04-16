package extra_credit.theater;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		Person p = new Person("Yahia");
		List<Seat> seats = List.of(new Seat(p, 0, 0), new Seat(p, 0, 1), new Seat(p, 0, 2), new Seat(p, 0, 3));

		Theater theater = new Theater(seats, 20, 28);
		System.out.println("Show ALL empty seats.");
		theater.showAllEmptySeats();

		System.out.println("Show All seats that are already reserved.");
		theater.showAllReservedSeats();

		System.out.println("Reserve a seat for a person.");
		theater.reserveASeat(p);

		System.out.println("Show All seats that are already reserved.");
		theater.showAllReservedSeats();

		System.out.println("Unreserve a seat (the seat becomes free).");
		theater.unreserveASeat(new Seat(p, 0, 0));

		System.out.println("Show All seats that are already reserved.");
		theater.showAllReservedSeats();

		System.out.println("Empty all seats in the theater.");
		theater.emptyAllSeats();

		System.out.println("Show All seats that are already reserved.");
		theater.showAllReservedSeats();

		System.out.println("Reserve all seats in the theater.");
		theater.reserveAllSeats();

		System.out.println("Show All seats that are already reserved.");
		theater.showAllReservedSeats();

	}
}
