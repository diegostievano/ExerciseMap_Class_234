package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter full file path: ");
		
		String path = input.nextLine();		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> candidates = new HashMap<>();
			
			String line = br.readLine();
			
			while (line != null){
				String[] fields = line.split(",");
				
				String name = fields[0];
				int amount = Integer.parseInt(fields[1]);			

				if (candidates.containsKey(name)) {
					int newAmount = candidates.get(name) + amount;
					candidates.put(name, newAmount);
				}
				else {									
					candidates.put(name, amount);
				}		
				
				line = br.readLine();
			}
			
			for(String key : candidates.keySet()) {
				System.out.println(key + ": " + candidates.get(key));
			}
			
			
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		input.close();

	}

}
