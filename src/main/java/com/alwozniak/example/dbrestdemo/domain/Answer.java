package com.alwozniak.example.dbrestdemo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "answers")
public class Answer extends AuditModel {

    @Id
    @GeneratedValue(generator = "answers_generator")
    @SequenceGenerator(name = "answers_generator", sequenceName = "answers_sequence")
    private Long id;

    @Column(columnDefinition = "text")
    private String text;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Question question;

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Question getQuestion() {
        return question;
    }
}
