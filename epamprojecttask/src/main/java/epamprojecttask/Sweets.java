package epamprojecttask;

public class Sweets {
	public int weight(int w[],int low, int high)
	{
		int wgt=0;
		for (int i=0;i<w.length;i++)
		{
			if(w[i]>=low&&w[i]<=high)
			{
				
				wgt=wgt+w[i];
			}
		}
		return wgt;
	}
	public int count(int w[],int low, int high)
	{
		int cnt=0;
		for (int i=0;i<w.length;i++)
		{
			if(w[i]>=low&&w[i]<=high)
			{
				cnt++;
			}
		}
		return cnt;
	}


}
