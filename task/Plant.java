package com.xworkz.task;

public class Plant {
	

		private String name;
		private double price;
		private int quantity;
		private String type;
		private int length;
		private int weight;
		private String shopName;
		private String shopLocation;
		private String dateOfPurchase;
		private boolean quality;

		public Plant(String name, double price, int quantity, String type, int length) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
			this.type = type;
			this.length = length;
		}

		public void kattu(int weight, String shopName, String shopLocation, String dateOfPurchase, boolean quality) {
			System.out.println("Name :" + this.name);
			System.out.println("Price :" + this.price);
			System.out.println("Quantity :" + this.quantity);
			System.out.println("Type :" + this.type);
			System.out.println("Length :" + this.length);
			System.out.println("Weight :"+weight);
			System.out.println("Shop Name :"+shopName);
			System.out.println("Shop Location :"+shopLocation);
			System.out.println("Date of Purchase :"+dateOfPurchase);
			System.out.println("Quality :"+quality);
		}

	}

