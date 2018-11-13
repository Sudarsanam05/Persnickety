package com.oops;

public class Arg {
	
	public int ball=100;
	
	void price()
	{
		int selling=25,buying=15;
		int price=selling-buying;
		System.out.println(price);
	}
	
	int profit()
	{
		int rate=36, goods=6;
		int profit=rate/goods;
		return profit;
	}
	void cricket(int run1, int run2, int maiden)
	{
		int score=run1+run2-maiden;
		System.out.println(score);
	}
	int book(int cost, int pages, int loss)
	{
		int profit=cost+pages-loss;
		return profit;
	}
	

}
