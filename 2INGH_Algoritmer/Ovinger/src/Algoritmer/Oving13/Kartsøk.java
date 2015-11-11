package Algoritmer.Oving13;

/**
 * Created by Roger on 09/11/2015.
 */
import java.util.PriorityQueue;

public class Kartsøk {

    int noderSjekket;

    public void aStjerne(Node start, Node mål){
        start.minDist = 0;
        PriorityQueue<Node> nodeKø = new PriorityQueue<>();
        nodeKø.add(start);
        int counter = 0;

        while(!nodeKø.isEmpty()){
            Node n = nodeKø.poll();
            counter++;
            if(n.getID() == mål.getID()){
                break;
            }

            double nesteNodeDist = n.getDist();
            double startNodeDist = start.getDist();
            double finnTid = finnKjøretid(start, mål);
        }
    }

    public double finnKjøretid(Node fra, Node til){
        double bredde1 = (fra.latitude*Math.PI)/180.0;
        double bredde2 = (til.latitude*Math.PI)/180.0;
        double lengde1 = (fra.longtitude*Math.PI)/180.0;
        double lengde2 = (til.longtitude*Math.PI)/180.0;

        double r = 6371000;

        double distanse = r*Math.acos(Math.sin(bredde1)*Math.sin(bredde2)+
                Math.cos(bredde1)*Math.cos(bredde2)*Math.cos(Math.abs(lengde2-lengde1)));

        double tid = distanse/(110/3.6);

        return tid;
    }
}
