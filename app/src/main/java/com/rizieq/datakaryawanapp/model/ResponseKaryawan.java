package com.rizieq.datakaryawanapp.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class ResponseKaryawan{

	@SerializedName("result")
	private List<ResultItem> result;

	@SerializedName("kode")
	private int kode;

	@SerializedName("pesan")
	private String pesan;

	public String getPesan() {
		return pesan;
	}

	public void setPesan(String pesan) {
		this.pesan = pesan;
	}

	public void setResult(List<ResultItem> result){
		this.result = result;
	}

	public List<ResultItem> getResult(){
		return result;
	}

	public void setKode(int kode){
		this.kode = kode;
	}

	public int getKode(){
		return kode;
	}
}