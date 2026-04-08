package assignment14;

public class Question8 {
    public static void gameScoreboard(){
        Integer[] scores={10,null,25,30,null,15};
        int p=0;
        int total=0;

        for(Integer score: scores){
            if(score==null){
                p++;
            }
            else{
                total+=score;
            }
        }
        System.out.println("Players who have not played: "+p);
        System.out.println("Total score of valid players: "+total);
    }

    public static void main(String[] args){
        gameScoreboard();
    }
}
