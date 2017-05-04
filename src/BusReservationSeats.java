/**
 * 
 */

/**
 * @author Satheesh
 *  
 * BusReservationSeats.java
 *
 */
/** class used for Reservation details and print number of seats booked at the end as report.*/
public class BusReservationSeats {


    static int availableSeats = 60;
/** Booking at a time one passenger only*/
    synchronized void reserveSeat(int requestedSeats)
    {
        System.out.println(Thread.currentThread().getName() + " Seat entered to bnook ticket....");
        System.out.println("Availableseats ::::::::::: " + availableSeats + " Requestedsetas ::::::::::: " + requestedSeats);
        if (availableSeats >= requestedSeats)
        {
            System.out.println("Seat Available. Reserving  now ,Please wait.....)");
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted");
            }
            System.out.println(requestedSeats + " seats reserved succesfully,please check the status.");
            availableSeats = availableSeats - requestedSeats;
        }
        else
        {
            System.out.println("Requested seats not available at this moment please try after some time...,");
        }
        System.out.println(Thread.currentThread().getName() + " Booking another ticket...");
        System.out.println("###############################");
    }


}
