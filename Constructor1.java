class Area
{
	int len;
	int br;
	Area()
	{
		len = 0;
		br = 0;
	}
	Area(int x, int y)
	{
		len = x;
		br = y;
	}
	void cal_area()
	{
		int a = len * br;
		System.out.println("Area = "+a);
	}
}
class Constructor1
{
	public static void main(String args[])
	{
		Area a1 = new Area();
		Area a2 = new Area(100,50);
		a1.cal_area();
		a2.cal_area();
	}
}