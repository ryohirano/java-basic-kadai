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
@Table(name = "reservations")
public class Reservation {

    // 予約情報の主キー
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    // 予約を行った会員
    @ManyToOne
    @JoinColumn(name = "memberId")
    private Member member;

    // 予約対象のスタジオ
    @ManyToOne
    @JoinColumn(name = "studioId")
    private Sutajio sutajio;

    // 選択された料金プラン
    @ManyToOne
    @JoinColumn(name = "planId")
    private PricingPlan plan;

    // 予約の開始日時・終了日時
    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    // 予約の状態
    private String status;

    // 予約の合計金額
    private Double totalPrice;

    // 予約に関する備考
    private String notes;

    // 予約の作成日時
    private LocalDateTime createdAt;

    // キャンセル日時
    private LocalDateTime cancelledAt;

    // キャンセル理由
    private String cancelReason;

    // 予約に紐づく機材情報
    @OneToMany(mappedBy = "reservation")
    private List<ReservationEquipment> reservationEquipments;

    // Getter / Setter
}