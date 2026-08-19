package com.example.kadaisutajio.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pricing_plans")
public class PricingPlan {

    // =========================
    // 料金プラン基本情報
    // =========================

    // 料金プランID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId;

    // プラン名
    private String planName;

    // プランの説明
    private String description;

    // 料金
    private Double price;

    // 利用時間（分）
    private Integer durationMinutes;

    // プランの種類
    private String planType;

    // プランが有効かどうか
    private Boolean isActive;

    // 作成日時
    private LocalDateTime createdAt;


    // =========================
    // スタジオとの関連
    // =========================

    // この料金プランが所属するスタジオ
    @ManyToOne
    @JoinColumn(name = "studioId")
    private Sutajio studio;


    // =========================
    // 予約との関連
    // =========================

    // この料金プランを利用した予約
    @OneToMany(mappedBy = "plan")
    private List<Reservation> reservations;


    // =========================
    // Getter / Setter
    // =========================

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public Sutajio getStudio() {
        return studio;
    }

    public void setStudio(Sutajio studio) {
        this.studio = studio;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}