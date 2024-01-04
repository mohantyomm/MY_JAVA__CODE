package com.omm.java56;

interface camera {
	void takesnap();

	void record_video();
}

interface wifi {
	String[] getNetwork();

	void connectToNetwork(String network);
}

class cellphone {
	void callnumber(int phonenumber) {
		System.out.println("calling " + phonenumber);
	}

	void pickcall() {
		System.out.println("connecting...");
	}
}

class MySmartphone extends cellphone implements camera, wifi {
	public String[] getNetwork() {
		 System.out.println("getting list of networks ");
		 String[] networklist = {"5g","4g","3g","2g" };
		 return networklist;
	}

	public void connectToNetwork(String network) {
		System.out.println("connecting to .."+network);
	}
	public void takesnap() {
		System.out.println("taking snap");
	}

	public void record_video() {
		System.out.println("Recording video..");   
	}
}

public class CWH_56_default_methods {
	public static void main(String[] args) {
		MySmartphone obj = new MySmartphone();
		String[] st=obj.getNetwork();
		for(String item : st)
		{
			System.out.println(item);
		}
		for(String item1 : st)
		{
			obj.connectToNetwork(item1);
		}
		obj.takesnap();
		obj.record_video();
	}
}

