package com.example.kadaisutajio.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "sutajio")
public class Sutajio {

    // =========================
    // スタジオ基本情報
    // =========================

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studioId;

    private String name;

    private String description;

    private String address;

    private String phone;

    private String email;

    private Double areaSqm;

    private Integer capacity;

    private String folderPath;

    private Boolean isPublished;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;


    // =========================
    // 他テーブルとの関連
    // =========================

    // スタジオに紐づく画像
    @OneToMany(mappedBy = "studio")
    private List<StudioImage> images;

    // スタジオに紐づく料金プラン
    @OneToMany(mappedBy = "studio")
    private List<PricingPlan> pricingPlans;

    // スタジオに紐づく予約
    @OneToMany(mappedBy = "studio")
    private List<Reservation> reservations;

    // スタジオに紐づく設備
    @OneToMany(mappedBy = "studio")
    private List<StudioEquipment> studioEquipments;


    // =========================
    // Getter / Setter
    // =========================

    public Long getStudioId() {
        return studioId;
    }

    public void setStudioId(Long studioId) {
        this.studioId = studioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getAreaSqm() {
        return areaSqm;
    }

    public void setAreaSqm(Double areaSqm) {
        this.areaSqm = areaSqm;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }

    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<SutajioImage> getImages() {
        return images;
    }

    public void setImages(List<SutajioImage> images) {
        this.images = images;
    }

    public List<PricingPlan> getPricingPlans() {
        return pricingPlans;
    }

    public void setPricingPlans(List<PricingPlan> pricingPlans) {
        this.pricingPlans = pricingPlans;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<StudioEquipment> getStudioEquipments() {
        return studioEquipments;
    }

    public void setStudioEquipments(List<StudioEquipment> studioEquipments) {
        this.studioEquipments = studioEquipments;
    }
}