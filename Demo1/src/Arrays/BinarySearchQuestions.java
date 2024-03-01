package Arrays;

public class BinarySearchQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//to find cieling of the number
	static int ciel(int a[],int s,int e,int target){
        if(s>e){
            return a[s];
        }
        int mid=s+(e-s)/2;
        if(a[mid]==target){
            return a[mid];
        }
        if(a[mid]>target){
            return ciel(a,s,mid-1,target);
        }
        return ciel(a,mid+1,e,target);
    }
    	
	//Smallest letter that is greater than target:
	    static char ciel(char a[],int s,int e,char target){
	        if(s>e){
	            return a[s%a.length];
	        }
	        int mid=s+(e-s)/2;
	        if(a[mid]<target || a[mid]==target){
	            return ciel(a,mid+1,e,target);
	        }
	        return ciel(a,s,mid-1,target);
	    }
	    
	  //Find the first and last occurence of the target Number
	        static int occurence(int a[],int s,int e,int target,int ans,boolean firstIndex) {
	            if(s>e){
	                return ans;
	            }
	            int mid=s+(e-s)/2;
	            if(a[mid]==target){
	                ans=mid;
	                if(firstIndex){
	                    return occurence(a,s,mid-1,target,ans,firstIndex);
	                }
	                else{
	                    return occurence(a,mid+1,e,target,ans,firstIndex);
	                }
	            }
	            if(a[mid]>target){
	                return occurence(a,s,mid-1,target,ans,firstIndex);
	            }
	            return occurence(a,mid+1,e,target,ans,firstIndex);
	        }
	        
	      //Find the element in the infinte array:
	          static int infiniteArray(int a[],int target){
	              int s=0,e=1;
	              while(target>a[e]){
	                  int temp=e;
	                  e=e+(e-s+1)*2; 
	                  s=temp;
	              }
	              return search(a,s,e,target);
	          }
	          static int search(int a[],int s,int e,int target){
	            if(s>e){
	                return -1;
	            }
	            int mid=s+(e-s)/2;
	            if(a[mid]==target){
	                return mid;
	            }
	            if(a[mid]>target){
	                return search(a,s,mid-1,target);
	            }
	            return search(a,mid+1,e,target);
	         }
	         
	        //Find the Peak index in the mountain array:
	             static int MountainArray(int a[],int s,int e){
	              if(s==e){
	                  return s;
	              }
	              int mid=s+(e-s)/2;
	              if(a[mid]<a[mid+1]){
	                  return MountainArray(a,mid+1,e);
	              }
	              return MountainArray(a,s,mid);
	          }
	             
	           //Find the target element in the mountain array:
	                static int SearchInMountain(int a[],int target){
	                    int peek=MountainArra(a,0,a.length-1);
	                    int first=firstArray(a,0,a.length-1,target);
	                    if(first==-1){
	                        return secondArray(a,0,a.length-1,target);
	                    }
	                    return first;
	                }
	                static int firstArray(int a[],int s,int e,int target){
	                    if(s>e){
	                        return -1;
	                    }
	                    int mid=s+(e-s)/2;
	                    if(a[mid]==target){
	                        return mid;
	                    }
	                    if(a[mid]>target){
	                        return firstArray(a,s,mid-1,target);
	                    }
	                    return firstArray(a,mid+1,e,target);
	                }
	                static int secondArray(int a[],int s,int e,int target){
	                    if(s>e){
	                        return -1;
	                    }
	                    int mid=s+(e-s)/2;
	                    if(a[mid]==target){
	                        return mid;
	                    }
	                    if(a[mid]>target){
	                       return firstArray(a,mid+1,e,target);
	                    }
	                    return firstArray(a,s,mid-1,target);
	                }
	                static int MountainArra(int a[],int s,int e){
	                    if(s==e){
	                        return s;
	                    }
	                    int mid=s+(e-s)/2;
	                    if(a[mid]<a[mid+1]){
	                        return MountainArray(a,mid+1,e);
	                    }
	                    return MountainArray(a,s,mid);
	                }
	                
	          

}
