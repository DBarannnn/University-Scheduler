package com.project.schedulerapp.Domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.project.schedulerapp.Values.FullName;
import com.project.schedulerapp.Values.Position;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Student implements UserDetails {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = true)
    private FullName fullName;

    @Column(nullable = true)
    @Enumerated(EnumType.STRING)
    private Position position;

    @Column(nullable = true)
    private Date birthday;


    private String creditNumber;

    @Column
    private Boolean hasScholarship;

    @Column
    private String email;

    @Column
    private String password;


    @ManyToMany
    @JoinTable(
            name = "group_student",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    private List<Group> groups;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
