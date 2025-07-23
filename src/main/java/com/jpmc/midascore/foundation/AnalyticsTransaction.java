package com.jpmc.midascore.foundation;

public class AnalyticsTransaction {
    private String transDateTransTime;
    private long unixTime;
    private String ccNum;
    private float amt;
    private String category;
    private String merchant;
    private boolean isFraud;
    private String city;
    private String state;
    private String zip;
    private double lat;
    private double lon;
    private double merchLat;
    private double merchLon;
    private String merchZipcode;
    private String transNum;
    private String gender;
    private String dob;
    private String job;
    private int cityPop;

    public AnalyticsTransaction() {}

    public AnalyticsTransaction(String transDateTransTime, long unixTime, String ccNum, float amt, String category, String merchant, boolean isFraud, String city, String state, String zip, double lat, double lon, double merchLat, double merchLon, String merchZipcode, String transNum, String gender, String dob, String job, int cityPop) {
        this.transDateTransTime = transDateTransTime;
        this.unixTime = unixTime;
        this.ccNum = ccNum;
        this.amt = amt;
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

    public String getTransDateTransTime() { return transDateTransTime; }
    public void setTransDateTransTime(String transDateTransTime) { this.transDateTransTime = transDateTransTime; }
    public long getUnixTime() { return unixTime; }
    public void setUnixTime(long unixTime) { this.unixTime = unixTime; }
    public String getCcNum() { return ccNum; }
    public void setCcNum(String ccNum) { this.ccNum = ccNum; }
    public float getAmt() { return amt; }
    public void setAmt(float amt) { this.amt = amt; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getMerchant() { return merchant; }
    public void setMerchant(String merchant) { this.merchant = merchant; }
    public boolean isFraud() { return isFraud; }
    public void setFraud(boolean fraud) { isFraud = fraud; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }
    public double getLat() { return lat; }
    public void setLat(double lat) { this.lat = lat; }
    public double getLon() { return lon; }
    public void setLon(double lon) { this.lon = lon; }
    public double getMerchLat() { return merchLat; }
    public void setMerchLat(double merchLat) { this.merchLat = merchLat; }
    public double getMerchLon() { return merchLon; }
    public void setMerchLon(double merchLon) { this.merchLon = merchLon; }
    public String getMerchZipcode() { return merchZipcode; }
    public void setMerchZipcode(String merchZipcode) { this.merchZipcode = merchZipcode; }
    public String getTransNum() { return transNum; }
    public void setTransNum(String transNum) { this.transNum = transNum; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }
    public String getJob() { return job; }
    public void setJob(String job) { this.job = job; }
    public int getCityPop() { return cityPop; }
    public void setCityPop(int cityPop) { this.cityPop = cityPop; }
} 