package io.danghuy.employeemanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
/*
    Báo cho JPA/Hibernate biết rằng class Employee là một thực thể (entity) — tương ứng
    với một bảng trong database (thường là employee).
    Khi chương trình chạy, Hibernate sẽ dựa vào annotation này để:
        - Tự động tạo bảng (nếu ddl-auto là create hoặc update)
        - Tự động ánh xạ các cột tương ứng với các thuộc tính (fields)
 */
public class Employee implements Serializable {
    // Serializable giúp đối tượng chuyển doi sang dang byte stream (framework nhu Spring, JPA yeu cau dieu nay)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Sinh gia tri tu dong cho khoa chinh (IDENTITY == AUTO_INCREMENT)
    @Column(nullable = false, updatable = false)
    // Rang buoc
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;


    public Employee() {
    }

    public Employee(Long id, String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}
