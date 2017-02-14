package com.felight.SortingAlgos;

class calculator1{
	public static void print(int[] array){ //print an array
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

	public static void print(char[] array){ //print an array
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

	public static void change(boolean[] array){
		for(int i=0;i<array.length;i++)
			array[i]=true;
	}

	public static void naturalArray(int[] array){
		for(int i=0; i<array.length;i++){
			array[i]=i+1;
		}
	}

	public static void randomArray(int[] array){
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*1000);			
		}
	}

	public static void descNaturalArray(int[] array){
		int j = array.length;
		for(int i=0; i<array.length;i++){
			array[i]=j--;
		}
	}

	public static int sum(int[] array){ //return sum of array
		int sum=0;
		for(int i=0;i<array.length;i++){
			sum=sum+array[i];
		}
		return sum;
	}

	public static int max(int[] array){ //return the max number
		int max=array[0];
		for(int i=1;i<array.length;i++){
			if(max<array[i])
				max=array[i];

		}
		return max;
	}

	public static boolean repeat(int[] array){ //to check if the 
		int r=0;                               //number is repeated
		for(int i=0;i<((array.length)/2);i++){
			for(int j=i+1;j<array.length;j++)
			if(array[i]==array[j]){
				r++;
			}
			if(r>0)
				break;
		}
		if(r>0)
		return true;
	    else
	    	return false;

	}

	public static int position(int[] array,int x){ //position of number
         int j=-1;                                 //in array
		for(int i=0;i<array.length;i++){
			if(array[i]==x){
				j=i;
				break;
			}

		}
		return j;
	}

	public static void sort(int[] array){ //sort an array
		int k=0;
		for(int i=0;i<array.length;i++){
			for(int j=i;j<array.length;j++){
				if(array[i]<array[j]){
					k=array[i];
					array[i]=array[j];
					array[j]=k;

				}

			}
		}
		
	}

	public static void reverse(int[] array){ //reverse an array
		int[] rev=new int[array.length];
		int j=array.length-1;
		for(int i=0;i<array.length;i++){
			rev[j]=array[i];
			j--;
		}
		for(int i=0;i<array.length;i++){
			array[i]=rev[i];

		}
	}

	public static void changeccase(char[] array){ //to change from upper case to
		int k=0;							      //lower case & vice versa
		char[] carray= new char[array.length];
		for(int i=0;i<array.length;i++){
			k=array[i];
			if(k>=65&&k<=90)
			k=k+32;
			else
			k=k-32;

		carray[i]=(char) k;	
		}
		for(int i=0;i<array.length;i++){
			array[i]=carray[i];
		}
	}

	
}
