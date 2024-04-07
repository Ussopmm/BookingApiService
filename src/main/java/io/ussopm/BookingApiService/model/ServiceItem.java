package io.ussopm.BookingApiService.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "service")
public class ServiceItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotNull(message = "Name have to be not null")
    @Size(min = 3, max = 100, message = "Name size min = 3, max 40")
    private String name;

    private int duration;
    private int price;
    private String description;

    @ManyToMany(mappedBy = "services")
    private List<Barber> barbers;

    @OneToMany(mappedBy = "service")
    private List<Booking> bookings;
}
