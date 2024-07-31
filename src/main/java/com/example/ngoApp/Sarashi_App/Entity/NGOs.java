package com.example.ngoApp.Sarashi_App.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(
    uniqueConstraints = {
            @UniqueConstraint(
                    columnNames = {"ngoEmail","ngoPhoneNumber"}
            )
    }
)
public class NGOs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ngoId;

    private String ngoName;
    private long ngoMembers;
    private String ngoAddress;
    private long ngoPincode;

    @Column(
            name = "ngoPhoneNumber",
            nullable = false
    )
    private long ngoPhoneNumber;
    @Column(
            name = "ngoEmail",
            nullable = false
    )
    private long ngoEmail;

    @ManyToMany(
            cascade = CascadeType.ALL
    )
    @JoinTable(
            name = "ngo_course_map",
            joinColumns = @JoinColumn(
                    name = "ngo_id",
                    referencedColumnName = "ngoId"
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "member_id",
                    referencedColumnName = "memberId"
            )
    )
    private List<NGOmembers> ngOmembers;

    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "ngo_id",
            referencedColumnName = "ngoId"
    )
    private List<NGOdrives> ngOdrives;

}
