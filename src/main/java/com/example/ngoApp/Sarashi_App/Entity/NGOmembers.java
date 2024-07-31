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
                @UniqueConstraint(columnNames = {"memberEmail","memberPhone"})
        }
)
public class NGOmembers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long memberId;

    private String memberName;

    @Column(
            name = "memberEmail",
            nullable = false
    )
    private String memberEmail;

    @Column(
            name = "memberPhone",
            nullable = false
    )
    private String memberPhone;


    @OneToMany(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "member_id",
            referencedColumnName = "memberId"
    )
    private List<NGOdrives> drivesParticipated;

}
