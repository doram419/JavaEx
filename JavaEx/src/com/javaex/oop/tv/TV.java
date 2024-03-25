package com.javaex.oop.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV() {
		this.channel = 1;
		this.volume = 0;
		this.power = false;
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean isPower() {
		return power;
	}
	
	public void power(boolean on)
	{
		this.power = on;
		
		if (on) {
			System.out.println("티비를 켰습니다.");
		}
		else
		{
			System.out.println("티비를 껐습니다.");
		}
	}
	
	public void channel(int channel)
	{
		if(channel >= 1 && channel <= 255)
		{
			this.channel = channel;
			printChannel();
		}
		else
		{
			System.out.println("1번에서 255번 사이를 입력해주세요");
		}
	}
	
	public void channel(boolean up) 
	{
		if(up)
		{
			this.channel++;
			System.out.println("채널 위로");
		}
		else
		{
			this.channel--;
			System.out.println("채널 아래로");
		}
		
		if(this.channel > 255)
			this.channel -= 255;
		
		if(this.channel < 0)
			this.channel = 255;
		
		printChannel();
	}
	
	private void printChannel()
	{
		System.out.printf("현재 채널 : 채널 %d번%n", this.channel);
	}
	
	public void volume(int volume)
	{
		if(volume >= 0 && volume <= 100)
		{
			this.volume = volume;
			printVolume();
		}
		else
		{
			System.out.println("0에서 100 사이를 입력해주세요");
		}
	}
	
	public void volume(boolean up) 
	{
		if(up)
		{
			this.volume++;
			System.out.println("볼륨 위로");
		}
		else
		{
			this.volume--;
			System.out.println("볼륨 아래로");
		}
		
		if(this.volume > 100)
			this.channel = 100;
		
		if(this.volume < 0)
			this.volume = 0;
		
		printVolume();
	}
	
	private void printVolume()
	{
		System.out.printf("현재 음량 : %d%n", this.volume);
	}
	
	private void printPower()
	{
		if (this.power) {
			System.out.println("티비 상태 : 켜짐");
		}
		else
		{
			System.out.println("티비 상태 : 꺼짐");
		}
	}
	
	public void status()
	{
		System.out.println("==============================");
		printPower();
		printChannel();
		printVolume();
		System.out.println("==============================");
	}
}
