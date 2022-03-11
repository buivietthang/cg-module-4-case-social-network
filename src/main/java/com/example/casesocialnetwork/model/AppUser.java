package com.example.casesocialnetwork.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appUser_id;

    @NotBlank (message = "Không được để trống")
    private String name;

    @NotBlank (message = "Không được để trống")
    private String password;

    private Date dateOfBirth;

    @Email
    @NotBlank (message = "Không được để trống, định dạng theo email")
    private String email;

    private String avatar;
    private String cover;

    @Transient
    private MultipartFile avatarFile;

    @Transient
    private MultipartFile coverFile;

    private String introduction;
    private String job;
    private String gender;

    @Pattern(regexp = "0+[0-9]{9}")
    @NotBlank(message = "Không được để trống")
    private String phoneNumber;

    private String isActive;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;
}
