import java.time.LocalDateTime;

public class Ref {

    package com.rocs.clinic.app.model.item;

import java.time.LocalDateTime;

    public class Referral {

        private int referralId;
        private int studentId;
        private int medicalRecordId;
        private int staffId;
        private String referredTo;
        private LocalDateTime referralDate;
        private String reason;
        private String status;

        public Referral(int referralId, int studentId, int medicalRecordId, int staffId, String referredTo, LocalDateTime referralDate, String reason, String status) {
            this.referralId = referralId;
            this.studentId = studentId;
            this.medicalRecordId = medicalRecordId;
            this.staffId = staffId;
            this.referredTo = referredTo;
            this.referralDate = referralDate;
            this.reason = reason;
            this.status = status;
        }

        public int getReferralId() {
            return referralId;
        }

        public void setReferralId(int referralId) {
            this.referralId = referralId;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public int getMedicalRecordId() {
            return medicalRecordId;
        }

        public void setMedicalRecordId(int medicalRecordId) {
            this.medicalRecordId = medicalRecordId;
        }

        public int getStaffId() {
            return staffId;
        }

        public void setStaffId(int staffId) {
            this.staffId = staffId;
        }

        public String getReferredTo() {
            return referredTo;
        }

        public void setReferredTo(String referredTo) {
            this.referredTo = referredTo;
        }

        public LocalDateTime getReferralDate() {
            return referralDate;
        }

        public void setReferralDate(LocalDateTime referralDate) {
            this.referralDate = referralDate;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

}
