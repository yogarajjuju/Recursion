package Arrays;

public class Sorted {
    public static void main(String[] args) {
        int arr[] ={1,2,3,0,10};
        System.out.println(isSorted(arr,0));
    }
    static  boolean isSorted(int arr[], int index){
        if(index==arr.length-1){
            return true;
        }
        return(arr[index]<arr[index+1])&& isSorted(arr,index+1);

    }

    public static class Allpath {
        public static void main(String[] args) {

        }
        static void allpath(String p ,boolean[][]maze, int r,int c){
            if(r== maze.length-1&&c==maze[0].length-1){
                System.out.println(p);
                return;
            }
            if(r< maze.length-1){
                allpath(p+'D',maze, r+1,c);
            }
            if(c<maze[0].length-1){
                allpath(p+'R',maze,r,c+1);
            }
            if(r>0){
                allpath(p+'U',maze,r-1,c);
            }
            if(c>0){
                allpath(p+'L',maze,r,c-1);
            }
        }
    }

    public static class PathObst {
        public static void main(String[] args) {
           boolean maze[][]= {{true,true,true},
                   {true,false,true},
                   {true,true,true}

           };
           path("",maze,0,0);

        }
        static void path(String p , boolean [][]maze, int r , int c){
            if(r==maze.length-1 && c==maze[0].length-1) {
                System.out.println(p);
                return;
            }
                if(!maze[r][c]){
                    return;
                }


            if(r<maze.length-1){
                path(p+'D',maze,r+1,c);
            }
            if(c<maze[0].length-1){
                path(p+'R',maze,r,c+1);
            }
        }
    }
}
