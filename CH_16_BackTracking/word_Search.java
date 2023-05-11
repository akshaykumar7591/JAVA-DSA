package CH_16_BackTracking;

import java.util.Scanner;

public class word_Search {
    private static boolean findword(char[][] maze, int cr, int cc, String ans,int idx) {
       if(idx==ans.length()){
           return true;
       }


        if(cc<0 || cc>=maze[0].length || cr<0 || cr>=maze.length || maze[cr][cc]!=ans.charAt(idx)){
            return false;
        }
        int r[]={0,-1,0,1};
        int c[]={1,0,-1,0};

        maze[cr][cc]='*'; // we use * because it never come in word

        for(int i=0;i<r.length;i++){
            boolean ans1=findword(maze,cr+r[i],cc+c[i],ans,idx+1);
            if(ans1==true){
                return true;
            }
        }
        maze[cr][cc]=ans.charAt(idx);
        return false;


    }

    private static void display(int[][] ans) {
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        char [][] maze={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
            String word="ABCCED";
        for(int i=0;i<maze.length;i++){
            for (int j=0;j<maze[0].length;j++){
                if(maze[i][j]==word.charAt(0)){
                    boolean ans=findword(maze,i,j,word,0);
                    if(ans==true){
                        System.out.println("found");
                        return;
                    }
                }
            }
        }
        System.out.println("not found");

    }

}
