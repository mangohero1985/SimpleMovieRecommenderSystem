package com.rcd.model.recommender;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.mysql.jdbc.BufferRow;

public class deletTime {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String InPath = "/Users/mangohero1985/Documents/svnCheckout/MahoutTaste/ml-1m/ratings.txt";
		String OutPath = "/Users/mangohero1985/Documents/svnCheckout/MahoutTaste/ml-1m/ratingsNoTime.txt";
		FileReader fr = new FileReader(InPath);
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter(OutPath);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String kong = "";
		
		while ((kong= br.readLine())!=null){
			
			String[] data = kong.split(",");
			bw.write(data[0]+","+data[1]+","+data[2]);
			bw.newLine();
			bw.flush();
		}
		fr.close();
		br.close();
		bw.close();
		fw.close();

	}

}
