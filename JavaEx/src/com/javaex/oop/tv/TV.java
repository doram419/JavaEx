package com.javaex.oop.tv;

// 채널 범위 : 1 ~ 255
// 볼륨 범위 : 0 ~ 100
public class TV {
	private static final int MIN_CHANNEL = 1;
	private static final int MAX_CHANNEL = 255;
	private static final int MIN_VOLUME = 0;
	private static final int MAX_VOLUME = 100;
	
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
	}
	
	// 채널 변경 메서드
	public void channel(int channel)
	{
		// 채널의 범위 체크
		if(channel >= MIN_CHANNEL && channel <= MAX_CHANNEL)
		{
			this.channel = channel;
			// 범윌르 벗어나면 채널 변경을 하지 않는다.
		}
		else
		{
			System.out.println("1번에서 255번 사이를 입력해주세요");
		}
	}
	
	// 채널 변경 메서드(오버로딩)
	public void channel(boolean up) 
	{
		// 채널 올림
		if(up)
		{
			this.channel++;
		}
		// 채널 내림
		else
		{
			this.channel--;
		}
		
		if(this.channel > MAX_CHANNEL)
			this.channel -= 255;
		
		if(this.channel < MIN_CHANNEL)
			this.channel = 255;
		
		printChannel();
	}
	
	private void printChannel()
	{
		System.out.printf("현재 채널 : 채널 %d번%n", this.channel);
	}
	
	// 볼륨 조절 메서드
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
	
	// 볼륨 조절 메서드(오버로딩)
	public void volume(boolean up) 
	{
		if(up)
		{	// 볼륨 높이기
			this.volume++;
		}
		else
		{	// 볼륨 낮추기
			this.volume--;
		}
		
		if(this.volume > MAX_VOLUME)
			this.channel = 100;
		
		if(this.volume < MIN_VOLUME)
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
