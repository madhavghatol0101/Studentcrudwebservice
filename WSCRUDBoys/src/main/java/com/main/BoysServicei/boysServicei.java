package com.main.BoysServicei;

import java.util.List;

import com.main.model.Boys;

public interface boysServicei {

	public Boys saveData(Boys b);

	public Boys updateData(Boys b);

	public Iterable<Boys> getAllBoys();

	public void deleteData(int bid);

}
