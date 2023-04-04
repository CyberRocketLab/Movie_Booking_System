package com.curanov.movie.movie_booking_system.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movieId;

    @ManyToOne
    @JoinColumn(name = "saal_id", nullable = false)
    private Saal saalId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User userId;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking bookingId;

    @Column(name = "seat")
    private int seat;


    public Ticket() {
    }

    public Ticket(Movie movieId, Saal saalId, User userId, Booking bookingId, int seat) {
        this.movieId = movieId;
        this.saalId = saalId;
        this.userId = userId;
        this.bookingId = bookingId;
        this.seat = seat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Movie getMovieId() {
        return movieId;
    }

    public void setMovieId(Movie movieId) {
        this.movieId = movieId;
    }

    public Saal getSaalId() {
        return saalId;
    }

    public void setSaalId(Saal saalId) {
        this.saalId = saalId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Booking getBookingId() {
        return bookingId;
    }

    public void setBookingId(Booking bookingId) {
        this.bookingId = bookingId;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
