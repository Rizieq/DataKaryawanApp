package com.rizieq.datakaryawanapp.model;


import com.google.gson.annotations.SerializedName;


public class ResultItem{

	@SerializedName("waktu_masuk")
	private String waktuMasuk;

	@SerializedName("umur_karyawan")
	private String umurKaryawan;

	@SerializedName("jabatan")
	private String jabatan;

	@SerializedName("gajih")
	private String gajih;

	@SerializedName("nama_karyawan")
	private String namaKaryawan;

	@SerializedName("foto_karyawan")
	private String fotoKaryawan;

	@SerializedName("id")
	private String id;

	public void setWaktuMasuk(String waktuMasuk){
		this.waktuMasuk = waktuMasuk;
	}

	public String getWaktuMasuk(){
		return waktuMasuk;
	}

	public void setUmurKaryawan(String umurKaryawan){
		this.umurKaryawan = umurKaryawan;
	}

	public String getUmurKaryawan(){
		return umurKaryawan;
	}

	public void setJabatan(String jabatan){
		this.jabatan = jabatan;
	}

	public String getJabatan(){
		return jabatan;
	}

	public void setGajih(String gajih){
		this.gajih = gajih;
	}

	public String getGajih(){
		return gajih;
	}

	public void setNamaKaryawan(String namaKaryawan){
		this.namaKaryawan = namaKaryawan;
	}

	public String getNamaKaryawan(){
		return namaKaryawan;
	}

	public void setFotoKaryawan(String fotoKaryawan){
		this.fotoKaryawan = fotoKaryawan;
	}

	public String getFotoKaryawan(){
		return fotoKaryawan;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}
}