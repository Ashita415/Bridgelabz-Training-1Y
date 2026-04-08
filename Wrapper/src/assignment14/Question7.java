package assignment14;
import java.util.ArrayList;
public class Question7 {
    public static void wrapperCollection(){
        double[] prices={10.5,20.0,35.75,5.5};
        ArrayList<Double> list=new ArrayList<>();
        for(double p: prices){
            list.add(p);
        }
        double max=list.get(0);
        for(double p:list){
            if(p>max){
                max=p;
            }
        }
        double sum=0;
        for(double p: list){
            sum+=p;
        }
        double avg=sum/list.size();
        System.out.println("Highest Price: "+max);
        System.out.println("Average Price: "+avg);
    }

    public static void main(String[] args){
        wrapperCollection();
    }
}
