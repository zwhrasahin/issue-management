package com.temelt.issuemanagement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class IssueHistory extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Issue issue;

    private Date date;

    @JoinColumn(name = "assigneee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;
}
