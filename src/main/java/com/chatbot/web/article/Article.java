package com.chatbot.web.article;

import com.chatbot.web.volunteer.Volunteer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter //DTO
@Setter //DTO
@ToString //DTO
@NoArgsConstructor
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_id")
    private Long workId;
    @Column(name = "title", nullable = false)
    private String title;
    @CreationTimestamp //localdata일때 추가해줘야함 그래야 한국시간으로 찍힘
    @Column(name = "write_date") //자동으로 찍게만드니까 null이될수없다.
    private LocalDateTime writeDate;
    @Column(name = "recruit", nullable = false)
    private String recruit;
    @Column(name = "work_day", nullable = false)
    private String workDay;
    @Column(name = "work_time", nullable = false)
    private String workTime;
    @Column(name = "work_age", nullable = false)
    private String workAge;
    @Column(name = "city_area", nullable = false)
    private String cityArea;
    @Column(name = "day_salary", nullable = false)
    private int daySalary;
    @Column(name = "total_salary", nullable = false)
    private int totalSalary;
    @Column(name = "contents", nullable = false)
    private String contents;
    @Column(name = "write_data_day", nullable = false)
    private int writeDataDay;
    @Column(name = "kakao", nullable = false)
    private String kakao;
    @Column(name = "progress_state", nullable = false)
    private String progressState;
    @OneToMany(mappedBy ="article", cascade = CascadeType.ALL)
    private List<Volunteer> volunteers;
}
