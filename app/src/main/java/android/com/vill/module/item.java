package android.com.vill.module;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by comfort on 11/9/2017.
 */

public class item {
    private List<Integer> ETH = new ArrayList<>();
    private List<Integer>BTC = new ArrayList<>();
    @SerializedName("NGN")
    private Integer NGN;
    @SerializedName("USD")
    private Integer USD;
    @SerializedName("EUR")
    private Integer EUR;
    @SerializedName("JPY")
    private Integer JPY;
    @SerializedName("GBP")
    private Integer GBP;
    @SerializedName("AUD")
    private Integer AUD;
    @SerializedName("CAD")
    private Integer CAD;
    @SerializedName("CHF")
    private Integer CHF;
    @SerializedName("CNY")
    private Integer CNY;
    @SerializedName("KES")
    private Integer KES;
    @SerializedName("GHS")
    private Integer GHS;
    @SerializedName("UGX")
    private Integer UGX;
    @SerializedName("ZAR")
    private Integer ZAR;
    @SerializedName("XAF")
    private Integer XAF;
    @SerializedName("NZD")
    private Integer NZD;
    @SerializedName("MYR")
    private Integer MYR;
    @SerializedName("BND")
    private Integer BND;
    @SerializedName("GEL")
    private Integer GEL;
    @SerializedName("RUB")
    private Integer RUB;
    @SerializedName("INR")
    private Integer INR;




    public item(int NGN, int USD, int EUR, int JPY, int GBP, int AUD, int CAD, int CHF, int CNY, int KES,
                int GHS, int UGX, int ZAR, int XAF,int NZD, int MYR, int BND, int GEL, int RUB, int INR){
        this.NGN = NGN;
        this.USD = USD;
        this.EUR = EUR;
        this.JPY = JPY;
        this.GBP = GBP;
        this.AUD = AUD;
        this.CAD = CAD;
        this.CHF = CHF;
        this.CNY = CNY;
        this.KES = KES;
        this.GHS = GHS;
        this.UGX = UGX;
        this.ZAR = ZAR;
        this.XAF = XAF;
        this.NZD = NZD;
        this.MYR = MYR;
        this.BND = BND;
        this.GEL = GEL;
        this.RUB = RUB;
        this.INR = INR;

    }

    public int getINR() {
        return INR;
    }

    public void setINR(int INR) {
        this.INR = INR;

    }


    public int getZAR() {
        return ZAR;
    }

    public void setZAR(int ZAR) {
        this.ZAR = ZAR;

    }





    public int getNGN() {
        return NGN;
    }

    public void setNGN(int NGN) {
        this.NGN = NGN;

    }
    public int getUSD() {
        return USD;
    }

    public void setUSD(int USD) {
        this.USD = USD;

    }

    public int getEUR() {
        return EUR;
    }

    public void setEUR(int EUR) {
        this.EUR = EUR;

    }


    public int getJPY() {
        return JPY;
    }

    public void setJPY(int JPY) {
        this.JPY = JPY;

    }


    public int getGBP() {
        return GBP;
    }

    public void setGBP(int GBP) {
        this.NGN = GBP;

    }


    public int getAUD() {
        return AUD;
    }

    public void setAUD(int AUD) {
        this.AUD = AUD;

    }


    public int getCAD() {
        return CAD;
    }

    public void setCAD(int CAD) {
        this.CAD = CAD;

    }


    public int getCHF() {
        return CHF;
    }

    public void setCHF(int CHF) {
        this.CHF = CHF;

    }


    public int getCNY() {
        return CNY;
    }

    public void setCNY(int CNY) {
        this.CNY = CNY;

    }


    public int getKES() {
        return KES;
    }

    public void setKES(int KES) {
        this.KES = KES;

    }


    public int getGHS() {
        return GHS;
    }

    public void setGHS(int GHS) {
        this.GHS = GHS;

    }


    public int getUGX() {
        return UGX;
    }

    public void setUGX(int UGX) {
        this.UGX = UGX;

    }

    public int getXAF() {
        return XAF;
    }

    public void setXAF(int XAF) {
        this.XAF = XAF;

    }

    public int getNZD() {
        return NZD;
    }

    public void setNZD(int NZD) {
        this.NZD = NZD;

    }


    public int getMYR() {
        return MYR;
    }

    public void setMYR(int MYR) {
        this.MYR = MYR;

    }


    public int getBND() {
        return BND;
    }

    public void setBND(int BND) {
        this.BND = BND;

    }

    public int getGEL() {
        return GEL;
    }

    public void setGEL(int GEL) {
        this.GEL = GEL;

    }



    public int getRUB() {
        return RUB;
    }

    public void setRUB(int RUB) {
        this.RUB = RUB;

    }



    public List<Integer>BTC(){
        return BTC;
    }
    public void setBTC(List<Integer>BTC){
        this.BTC = BTC;
    }

    public List<Integer>ETH(){
        return ETH;
    }
    public void setETH(List<Integer>ETH){
        this.ETH = ETH;
    }





















}