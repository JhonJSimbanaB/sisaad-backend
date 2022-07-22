package edu.yavirac.crmbackend.feature.activity;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("activities")
public class Activity {
    
    @Id
    @Column("activity_id")
    private long activityId;
    private String name;
    private String category;
    private Timestamp created;
    private Timestamp updated;
    private boolean enable;

}