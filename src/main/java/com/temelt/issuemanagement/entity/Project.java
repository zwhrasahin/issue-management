package com.temelt.issuemanagement.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "project")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Project extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description", unique = true)
    private String projectCode;

    @Column(name = "description", length = 1000)
    private String projectName;

    @JoinColumn(name = "manager_used_id");
    private User manager;
}
