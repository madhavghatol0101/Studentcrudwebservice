package com.main.devServicei;

import java.util.List;

import com.main.Model.Farmer;

public interface FarServicei {

	public Farmer saveData(Farmer d);

	public List<Farmer> getData();

	public Farmer saveOneData(String uname, String pass);

	public void deleteOneData(int fid);

	public Farmer updateData(Farmer f);

}
