package com.project.BP.services.token;

import com.project.BP.entities.AppUser;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


public class ConfirmationToken {

    @Id
    private String id;
    @NotNull
    private String token;
    private LocalDateTime localDateTime;
    private LocalDateTime expiresAt;
    private LocalDateTime confirmedAt;

    private AppUser appUser;

    public ConfirmationToken() {
    }

    public ConfirmationToken(String token, LocalDateTime localDateTime, LocalDateTime expiredAt,  AppUser appUser) {
        this.token = token;
        this.localDateTime = localDateTime;
        this.expiresAt = expiredAt;
        this.appUser = appUser;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public LocalDateTime getConfirmedAt() {
        return confirmedAt;
    }

    public void setConfirmedAt(LocalDateTime confirmedAt) {
        this.confirmedAt = confirmedAt;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
}
