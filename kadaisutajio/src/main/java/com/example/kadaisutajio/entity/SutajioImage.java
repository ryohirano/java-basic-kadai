package com.example.kadaisutajio.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sutajio_images")
public class SutajioImage {

    // =========================
    // 画像基本情報
    // =========================

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageId;

    private String filePath;

    private String caption;

    private Integer sortOrder;

    private Boolean isMain;

    private LocalDateTime uploadedAt;


    // =========================
    // スタジオとの関連
    // =========================

    // 画像がどのスタジオに紐づいているか
    @ManyToOne
    @JoinColumn(name = "studioId")
    private Sutajio studio;


    // =========================
    // Getter / Setter
    // =========================

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }

    public Sutajio getStudio() {
        return studio;
    }

    public void setStudio(Sutajio studio) {
        this.studio = studio;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsMain() {
        return isMain;
    }

    public void setIsMain(Boolean isMain) {
        this.isMain = isMain;
    }

    public LocalDateTime getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(LocalDateTime uploadedAt) {
        this.uploadedAt = uploadedAt;
    }


}
