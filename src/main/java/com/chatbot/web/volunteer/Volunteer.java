package com.chatbot.web.volunteer;

import com.chatbot.web.article.Article;
import com.chatbot.web.member.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity @Getter @Setter @NoArgsConstructor
@ToString(exclude = {"member","article"})
@Table(name = "volunteer")
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="volunteer_id")
    private Long id;
    //원래 member엿던사람이 volunteer로 변환
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member; //지원은 한번밖에 못하니까 같은회사에 (그래서 멤버가 지원하면 vounteer로 지원공고 끝나면 member로)
    @ManyToOne
    @JoinColumn(name = "work_id") private Article article;
    @CreationTimestamp @Column(name = "volunteer_date") private LocalDateTime volunteerDate;

}
