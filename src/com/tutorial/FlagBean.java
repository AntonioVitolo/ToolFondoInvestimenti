package com.tutorial;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.flag.CampiFlag;





public class FlagBean   {
	
	/**
	 * 

	/**
	 * 
	 */
	
	private  List<String> campiFlagControlli;
	 private  List<String> campiFlagPadreInizio;
	 private List<String> campiFlagPadreFine;
	 private  String nome;
	

	public FlagBean() {

		// TODO Auto-generated constructor stub
	}

public void init(){
	leggiFlagControlli();
	
}
	
	
	public  void leggiFlagControlli(){
		
		nome= "Antonio";
//		creazione Liste
		campiFlagControlli = new ArrayList<>();
		campiFlagPadreInizio = new ArrayList<>(); 
		campiFlagPadreFine = new ArrayList<>();
		//creazione query
		
		String selectSql;
		
		selectSql = "SELECT ";
		
		for(CampiFlag flag : CampiFlag.getListaCampiFlagPadreInizio()){
			
			System.out.println(flag.getValue());
}
		
for(CampiFlag flag : CampiFlag.getListaCampiControlli()){
			
			System.out.println(flag.getValue());
}

for(CampiFlag flag : CampiFlag.getListaCampiFlagPadreFine()){
	
	System.out.println(flag.getValue());
}
		
		
		
		 
//		  String from = "Flag";
//		  Statement statement = null;   
//	         ResultSet resultSet = null;  
//try{
//          statement = ConnectDB.getConnection().createStatement();  
//          resultSet = statement.executeQuery(selectSql);  
//
//          // Print results from select statement  
//          while (resultSet.next())   
//          {  
//         	 for(int i=1;i<resultSet.getMetaData().getColumnCount();i++){
//         	 
//              System.out.println(resultSet.getMetaData().getColumnLabel(i)+": "+resultSet.getString(i));
//              System.out.println("\n");
//         	 }
//         	 
//         	
//         	break;
//          }  
//		
//		
//		
//	}
//	catch (SQLException e) {
//		System.out.println("Eccezzione SQL");
//		e.printStackTrace();
//	}
	
	
}

	public List<String> getCampiFlagControlli() {
		return campiFlagControlli;
	}

	public void setCampiFlagControlli(List<String> campiFlagControlli) {
		this.campiFlagControlli = campiFlagControlli;
	}

	public List<String> getCampiFlagPadreInizio() {
		return campiFlagPadreInizio;
	}

	public void setCampiFlagPadreInizio(List<String> campiFlagPadreInizio) {
		this.campiFlagPadreInizio = campiFlagPadreInizio;
	}

	public List<String> getCampiFlagPadreFine() {
		return campiFlagPadreFine;
	}

	public void setCampiFlagPadreFine(List<String> campiFlagPadreFine) {
		this.campiFlagPadreFine = campiFlagPadreFine;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}
