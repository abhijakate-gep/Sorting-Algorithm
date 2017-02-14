package com.felight.SortingAlgos;


import java.util.*;

class SortingAlgoBenchmark{
	
	public static void main(String[] args) {

			
		int i=0, j=0, k=0, x=0, y=0, size=0, choice=0;
		long startTime=0, stopTime=0, elapsedTime=0;

		while(y==0){
		System.out.println("Enter the size of the array");

		j=0;

		while(j==0){			
		try{			
			Scanner integer = new Scanner(System.in);
			size = integer.nextInt();
			if(size<0)
				throw new InputMismatchException("Enter a valid Input");
			j++;		
		}catch (InputMismatchException e){
			System.out.println("Invalid Input");
			System.out.println("Enter the size of the array");
			}catch (NoSuchElementException e){
			System.out.println("Invalid Input");
			System.out.println("Enter the size of the array");
			}
		}

		int[] array = new int[size];		

		System.out.println("--------------------------------------");
		System.out.println(" ");
		System.out.println("Enter the choice");		
		System.out.println("1) Best Case");
		System.out.println("2) Average Case");
		System.out.println("3) Worst Case");
		System.out.println(" ");
		System.out.println("--------------------------------------");

		k=0;

		while(k==0){
			j=1;
			while(j==1){
			try{			
			Scanner integer = new Scanner(System.in);
			i = integer.nextInt();
			j++;
		}catch (InputMismatchException e){
			System.out.println("Invalid Input");
			System.out.println("Enter the choice");
			}
		}
		switch (i){
			case 1: calculator1.naturalArray(array);
					System.out.println("Your array is  ");
							calculator1.print(array);
					k++;
				break;

			case 2: calculator1.randomArray(array);	
					System.out.println("Your array is  ");
					calculator1.print(array);
					k++;				
				break;

			case 3: calculator1.descNaturalArray(array);
					System.out.println("Your array is  ");
					calculator1.print(array);
					k++;
				break;

			default: System.out.println("ENTER A VALID INPUT");
			break;
		}

		}
		System.out.println();
		x=0;

		while(x==0){		
		System.out.println("Sorting Algorithm");
		System.out.println("1) Bubble Sort");
		System.out.println("2) Selection Sort");
		System.out.println("3) Insertion Sort");
		System.out.println("4) Quick Sort");
		System.out.println("5) Heap Sort");
		System.out.println("6) Merge Sort");
		System.out.println("7) Benchmark");
		System.out.println("8) Start Over");
		System.out.println("9) Exit");
		System.out.println(" ");
		System.out.println("Enter your choice");	

		j=2;
		
		while(j==2){
			try{			
			Scanner integer = new Scanner(System.in);
			choice = integer.nextInt();
			j++;
		}catch (InputMismatchException e){
			System.out.println("Invalid Input");
			System.out.println("Enter the choice");
			}	
		}   int[] clone1 = new int[array.length];

			switch (choice){
			case 1: System.out.println("Bubble Sort is selected");
				clone1 = array.clone();
				startTime = System.currentTimeMillis();
				Algos.bubbleSort(clone1);
				stopTime = System.currentTimeMillis();
				elapsedTime = stopTime - startTime;
				System.out.println("Sorted Array is");
				calculator1.print(clone1);
				System.out.println("Total time taken is   "+elapsedTime+ " ms");
				break;

			case 2: System.out.println("Selection Sort is selected");
				clone1 = array.clone();
				startTime = System.currentTimeMillis();
				Algos.selectionSort(clone1);
				stopTime = System.currentTimeMillis();
				elapsedTime = stopTime - startTime;
				System.out.println("Sorted Array is");
				calculator1.print(clone1);
				System.out.println("Total time taken is   "+elapsedTime+ " ms");
				break;

			case 3: System.out.println("Insertion Sort is selected");
				clone1 = array.clone();
				startTime = System.currentTimeMillis();
				Algos.insertionSort(clone1);
				stopTime = System.currentTimeMillis();
				elapsedTime = stopTime - startTime;
				System.out.println("Sorted Array is");
				calculator1.print(clone1);
				System.out.println("Total time taken is   "+elapsedTime+ " ms");
				break;

			case 4: System.out.println("Quick Sort is selected");
				clone1 = array.clone();
				startTime = System.currentTimeMillis();
				Algos.quickSort(clone1);
				stopTime = System.currentTimeMillis();
				elapsedTime = stopTime - startTime;
				System.out.println("Sorted Array is");
				calculator1.print(clone1);
				System.out.println("Total time taken is   "+elapsedTime+ " ms");
				break;

			case 5: System.out.println("Heap Sort is selected");
				clone1 = array.clone();
				startTime = System.currentTimeMillis();
				Algos.heapSort(clone1);
				stopTime = System.currentTimeMillis();
				elapsedTime = stopTime - startTime;
				System.out.println("Sorted Array is");
				calculator1.print(clone1);
				System.out.println("Total time taken is   "+elapsedTime +" ms");
				break;

			case 6: System.out.println("Merge Sort is selected");
				clone1 = array.clone();
				startTime = System.currentTimeMillis();
				Algos.heapSort(clone1);
				stopTime = System.currentTimeMillis();
				elapsedTime = stopTime - startTime;
				System.out.println("Sorted Array is");
				calculator1.print(clone1);
				System.out.println("Total time taken is   "+elapsedTime+ " ms");
				break;

			case 7: System.out.println("Benchmark is selected");
				System.out.println();
				System.out.println("FOR BUBBLE SORT");
				clone1 = array.clone();
				long startTime1 = System.currentTimeMillis();
				Algos.bubbleSort(clone1);
				long stopTime1 = System.currentTimeMillis();
				long elapsedTime1 = stopTime1 - startTime1;
				System.out.println("Total time taken is   "+elapsedTime1 +" ms");
				System.out.println(" ");

				System.out.println("FOR SELECTION SORT");
				clone1 = array.clone();
				startTime1 = System.currentTimeMillis();
				Algos.selectionSort(clone1);
				stopTime1 = System.currentTimeMillis();
				elapsedTime1 = stopTime1 - startTime1;
				System.out.println("Total time taken is   "+elapsedTime1+ " ms");
				System.out.println(" ");

				System.out.println("FOR INSERTION SORT");
				clone1 = array.clone();
				startTime1 = System.currentTimeMillis();
				Algos.insertionSort(clone1);
				stopTime1 = System.currentTimeMillis();
				elapsedTime1 = stopTime1 - startTime1;
				System.out.println("Total time taken is   "+elapsedTime1+ " ms");
				System.out.println(" ");

				System.out.println("FOR QUICK SORT");
				clone1 = array.clone();
				startTime1 = System.currentTimeMillis();
				Algos.quickSort(clone1);
				stopTime1 = System.currentTimeMillis();
				elapsedTime1 = stopTime1 - startTime1;
				System.out.println("Total time taken is   "+elapsedTime1+ " ms");
				System.out.println(" ");

				System.out.println("FOR HEAP SORT");
				clone1 = array.clone();
				startTime1 = System.currentTimeMillis();
				Algos.heapSort(clone1);
				stopTime1 = System.currentTimeMillis();
				elapsedTime1 = stopTime1 - startTime1;
				System.out.println("Total time taken is   "+elapsedTime1+ " ms");
				System.out.println(" ");
				break;

			case 8: x=1;
					break;

			case 9: x=1;
			        y=1;
			        break;

			default: System.out.println("Enter Valid input");
					 break;
				
				}
			}

		}
		
	}
}
