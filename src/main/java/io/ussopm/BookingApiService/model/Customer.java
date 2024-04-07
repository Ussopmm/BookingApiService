package io.ussopm.BookingApiService.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    @NotNull(message = "Name have to be not null")
    @Size(min = 3, max = 40, message = "Name size min = 3, max 40")
    private String name;

    @Column(name = "email")
    @NotNull(message = "Email have to be not null")
    @Email
    private String email;

    @Column(name = "phone_number")
    @NotNull(message = "Phone number have to be not null")
    private String phoneNumber;

    @OneToMany(mappedBy = "customer")
    private List<Booking> bookings;
}
