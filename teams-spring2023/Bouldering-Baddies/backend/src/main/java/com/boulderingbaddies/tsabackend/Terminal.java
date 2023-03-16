package com.boulderingbaddies.tsabackend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Terminal {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    // 3-digit code (Ex: SNA) + Terminal Id (Ex: 1, 2, A, B, ...)
    // ==> Ex: SNA-C
    private String combinedCode;

    // 3 Digit Code
    private String airportCode;

    // Terminal Id (Ex: 1, 2, 3, A, B, C, ...)
    private String terminalId;

    protected Terminal() {}

    public Terminal(String airportCode, String terminalId) {
        this.airportCode = airportCode;
        this.terminalId = terminalId;
        this.combinedCode = airportCode + "-" + terminalId;
    }

    @Override
    public String toString() {
        return String.format(
                "Terminal[id=%d, airportCode='%s', terminalId='%s']",
                id, airportCode, terminalId);
    }

    public Long getId() {
        return id;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public String getTerminalId() {
        return terminalId;
    }

    // Combined code
    public String getTerminalCode() {
        return getAirportCode() + "-" + getTerminalId();
    }
}