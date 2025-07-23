package com.jpmc.midascore.entity;

import jakarta.persistence.*;

@Entity
public class TransactionRecord {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sender_id", nullable = false)
    private UserRecord sender;

    @ManyToOne
    @JoinColumn(name = "recipient_id", nullable = false)
    private UserRecord recipient;

    @Column(nullable = false)
    private float amount;

    @Column(nullable = true)
    private float incentive; 

    @Column(nullable = false)
    private String transDateTransTime;

    @Column(nullable = false)
    private long unixTime;

    @Column(nullable = false)
    private String ccNum;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String merchant;

    @Column(nullable = false)
    private boolean isFraud;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String zip;

    @Column(nullable = false)
    private double lat;

    @Column(nullable = false)
    private double lon;

    @Column(nullable = false)
    private double merchLat;

    @Column(nullable = false)
    private double merchLon;

    @Column(nullable = false)
    private String merchZipcode;

    @Column(nullable = false)
    private String transNum;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String dob;

    @Column(nullable = false)
    private String job;

    @Column(nullable = false)
    private int cityPop;

    protected TransactionRecord() {
    }

    // for now, we are only storing valid transactions so there is no need for a valid field
    public TransactionRecord(UserRecord sender, UserRecord recipient, float amount, float incentive, String transDateTransTime, long unixTime, String ccNum, String category, String merchant, boolean isFraud, String city, String state, String zip, double lat, double lon, double merchLat, double merchLon, String merchZipcode, String transNum, String gender, String dob, String job, int cityPop) {
        this.sender = sender;
        this.recipient = recipient;
        this.amount = amount;
        this.incentive = incentive;
        this.transDateTransTime = transDateTransTime;
        this.unixTime = unixTime;
        this.ccNum = ccNum;
        this.category = category;
        this.merchant = merchant;
        this.isFraud = isFraud;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.lat = lat;
        this.lon = lon;
        this.merchLat = merchLat;
        this.merchLon = merchLon;
        this.merchZipcode = merchZipcode;
        this.transNum = transNum;
        this.gender = gender;
        this.dob = dob;
        this.job = job;
        this.cityPop = cityPop;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public UserRecord getSender() {
        return sender;
    }

    public UserRecord getRecipient() {
        return recipient;
    }

    public float getAmount() {
        return amount;
    }

    public float getIncentive() {
        return incentive;
    }

    public String getTransDateTransTime() { return transDateTransTime; }
    public long getUnixTime() { return unixTime; }
    public String getCcNum() { return ccNum; }
    public String getCategory() { return category; }
    public String getMerchant() { return merchant; }
    public boolean isFraud() { return isFraud; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZip() { return zip; }
    public double getLat() { return lat; }
    public double getLon() { return lon; }
    public double getMerchLat() { return merchLat; }
    public double getMerchLon() { return merchLon; }
    public String getMerchZipcode() { return merchZipcode; }
    public String getTransNum() { return transNum; }
    public String getGender() { return gender; }
    public String getDob() { return dob; }
    public String getJob() { return job; }
    public int getCityPop() { return cityPop; }
}

