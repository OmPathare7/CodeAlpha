package hotelReservationSystem;

public class booking {
    private room room;
    private String guestName;
    private double paymentAmount;

    public booking(room room, String guestName) {
        this.room = room;
        this.guestName = guestName;
        this.paymentAmount = 0.0;
    }

    public room getRoom() {
        return room;
    }

    public String getGuestName() {
        return guestName;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
