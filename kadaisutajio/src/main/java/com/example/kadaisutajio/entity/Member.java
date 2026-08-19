package com.example.kadaisutajio.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.*;

// このクラスをJPAのエンティティとして扱う
@Entity

// データベースのmembersテーブルとこのクラスを対応させる
@Table(name = "members")
public class Member {

    // 主キーを表す
    @Id

    // IDをデータベース側で自動採番する
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    // 会員名
    private String name;

    // メールアドレス
    private String email;

    // パスワードのハッシュ値
    private String passwordHash;

    // 電話番号
    private String phone;

    // 住所
    private String address;

    // 会員情報を登録した日時
    private LocalDateTime createdAt;

    // 会員情報を更新した日時
    private LocalDateTime updatedAt;

    // 会員が有効かどうかを表す
    private Boolean isActive;

    // MemberとReservationの1対多の関係
    // 1人のMemberが複数のReservationを持つ
    // Reservation側の「member」というフィールドを使って関連付ける
    @OneToMany(mappedBy = "member")
    private List<Reservation> reservations;

    // MemberとSessionの1対多の関係
    // 1人のMemberが複数のSessionを持つ
    // Session側の「member」というフィールドを使って関連付ける
    @OneToMany(mappedBy = "member")
    private List<Session> sessions;


    // =========================
    // memberIdのGetter / Setter
    // =========================

    // memberIdを取得する
    public Long getMemberId() {
        return memberId;
    }

    // memberIdを設定する
    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }


    // =========================
    // nameのGetter / Setter
    // =========================

    // nameを取得する
    public String getName() {
        return name;
    }

    // nameを設定する
    public void setName(String name) {
        this.name = name;
    }


    // =========================
    // emailのGetter / Setter
    // =========================

    // emailを取得する
    public String getEmail() {
        return email;
    }

    // emailを設定する
    public void setEmail(String email) {
        this.email = email;
    }


    // =========================
    // passwordHashのGetter / Setter
    // =========================

    // passwordHashを取得する
    public String getPasswordHash() {
        return passwordHash;
    }

    // passwordHashを設定する
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }


    // =========================
    // phoneのGetter / Setter
    // =========================

    // phoneを取得する
    public String getPhone() {
        return phone;
    }

    // phoneを設定する
    public void setPhone(String phone) {
        this.phone = phone;
    }


    // =========================
    // addressのGetter / Setter
    // =========================

    // addressを取得する
    public String getAddress() {
        return address;
    }

    // addressを設定する
    public void setAddress(String address) {
        this.address = address;
    }


    // =========================
    // createdAtのGetter / Setter
    // =========================

    // 作成日時を取得する
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // 作成日時を設定する
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    // =========================
    // updatedAtのGetter / Setter
    // =========================

    // 更新日時を取得する
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    // 更新日時を設定する
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }


    // =========================
    // isActiveのGetter / Setter
    // =========================

    // 会員が有効かどうかを取得する
    public Boolean getIsActive() {
        return isActive;
    }

    // 会員が有効かどうかを設定する
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }


    // =========================
    // reservationsのGetter / Setter
    // =========================

    // 会員が持っている予約一覧を取得する
    public List<Reservation> getReservations() {
        return reservations;
    }

    // 会員の予約一覧を設定する
    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }


    // =========================
    // sessionsのGetter / Setter
    // =========================

    // 会員が持っているセッション一覧を取得する
    public List<Session> getSessions() {
        return sessions;
    }

    // 会員のセッション一覧を設定する
    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}