package com.felight.SortingAlgos;


class Algos{
    static void swapNumbers(int i, int j, int[] array) {  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void bubbleSort(int[] array) {        
         for (int m = array.length; m > 1; m--) {
            for (int i = 0; i < m-1; i++) {
                
                if (array[i] > array[i+1]) {
                    swapNumbers(i, i+1, array);
                }
            }            
        }
       // return array;
    }

    public static void selectionSort(int[] array){
        int index=0;         
        for (int i = 0; i < array.length - 1; i++){
            index=i;
            for (int j=i+1; j<array.length; j++){
                if (array[index] > array[j])
                    index = j;      
            }
            swapNumbers(i, index, array);
        }     
    }


    public static void insertionSort(int[] array){  
        int temp,j;       
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            j=i-1;
            while(j>=0 && array[j]>temp){     
            array[j+1]=array[j];
            j--;
            }
            array[j+1]=temp;
        }
    }


    public static void qSort(int start, int end, int[] array){ //recursive quicksort. Sorting part
        if(start<end){
            int i = start-1, j=start;
            int pivot = array[end], temp;
            while(j<end){
                if(array[j]<pivot){
                    i++;
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                j++;
            }i++;
            array[end]=array[i];
            array[i]=pivot;
            qSort(start, i-1, array);
            qSort(i+1,end,array);

        }
        
    }

    public static void quickSort(int[] array){  // called by other class
    qSort(0, array.length-1, array);
    }

    public static void heapSort(int[] array){
        int k = array.length;
        int i,j;
        while(k>1){
            i=k-1;            
            while(i>1){

                if(i%2!=0)
                j=i/2;

                j=i/2-1;


                if(((i==(k-1))&&(i!=(array.length-1))&&(i%2!=0))||(i==(array.length-1)&&(k%2==0))){
                    if(array[i]>array[j])
                    swapNumbers(i, j, array);
                    i=i-1;
                }
                
                else {
                if(array[i]>array[j])
                    swapNumbers(i, j, array);
            
                if(array[i-1]>array[j])
                    swapNumbers(i-1, j, array);

                i=i-2;
            }
                                
            }
            k--;
            swapNumbers(k, 0, array);

        }
    }
    /*public static void heap(int i, int[] array){
        if(i>0){
            if(i%2!=0)
                j=i/2;
            j=i/2-1;
                if(a[i]>a[j])
                 swapNumbers(i, j, array);   
            
            if
        }
    }*/
          
}
