import java.io.*;
import java.util.*;
public class CsvManipulation {
	
	static Map<String, Integer> map=new HashMap<String,Integer>();

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Debamitra\\Downloads\\file.csv");
		Scanner scanner =new Scanner(file);
		while(scanner.hasNext())
		{   
			String line=scanner.next();
			if(!line.contains("AVG"))
			{String[] columns=line.split(",");
			
			String date=columns[0].replace("Date"," ");
			String id=columns[1].replace("ID"," ");
			String x=columns[2].replace("AVG", " ");
			int avg=Integer.parseInt(x);
			
			String key=date+"_"+id;
			if(!map.containsKey(key))
				map.put(key, avg);
			else
				map.put(key,avg+map.get(key));
			
			
			}
			
			
				
			
		}
		
		System.out.println(map);

	}

}
