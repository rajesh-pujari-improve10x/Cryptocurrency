package com.example.cryptocurrency.models.currencydetails;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Cryptocurrency {

    private String id;
    private String name;
    private String symbol;
    private Integer rank;
    @SerializedName("is_new")
    private boolean isNew;
    @SerializedName("is_active")
    private boolean isActive;
    private String type;
    private String logo;
    private ArrayList<Tag> tags;
    @SerializedName("team")
    private ArrayList<Team> teams;
    private String description;
    private String message;
    @SerializedName("open_source")
    private boolean openSource;
    @SerializedName("started_at")
    private String startedAt;
    @SerializedName("development_status")
    private String developmentStatus;
    @SerializedName("hardware_wallet")
    private boolean hardwareWallet;
    @SerializedName("proof_type")
    private String proofType;
    @SerializedName("org_structure")
    private String orgStructure;
    @SerializedName("hash_algorithm")
    private String hashAlgorithm;
    private Link links;
    @SerializedName("links_extended")
    private ArrayList<LinkExtended> linksExtended;
    private WhitePaper whitepaper;
    @SerializedName("first_data_at")
    private String firstDataAt;
    @SerializedName("last_data_at")
    private String lastDataAt;

}
