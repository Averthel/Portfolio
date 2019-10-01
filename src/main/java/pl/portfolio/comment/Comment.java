package pl.portfolio.comment;

import pl.portfolio.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_password")
    private Long id;
    @NotEmpty
    private String content;
    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;
    private LocalDateTime dateTime;

    private Comment(){}

    public Comment(String content, User user, LocalDateTime dateTime) {
        this.content = content;
        this.user = user;
        this.dateTime = dateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
