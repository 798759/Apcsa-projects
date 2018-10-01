
/**
 * Write a description of class Activity2 here.
 * changewsx dsahji grsgjn ejm'g; n'rkegn 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity3
{
    public static void run()
    { 
        BallWorld ballworld = new BallWorld(250,250);
        TGPoint tgpoint = new TGPoint (0,0); 
        BallBot ballbot = new BallBot (ballworld,tgpoint,0,10);
        double x;

        while (true){
            if (ballbot.canMoveForward(ballworld)){
                ballbot.moveForward();
            }else{
                x = Math.random()*360;
                ballbot.setHeading(x);

            }
        }
    }

    public int findFreeBallBotIndex(BallBot[] ballbotArray){
        for(int v =0; v<ballbotArray.length; v++){
            if (ballbotArray[v]==null) return v;

        }
        return ballbotArray.length;
    }

    public double distanceBetweenPoints(TGPoint point1, TGPoint point2){
        return Math.sqrt((Math.pow(point1.x-point2.x,2))+(Math.pow(point1.y-point2.y,2)));
    }

    public boolean entranceClear(BallBot[] ballBotArray, TGPoint entrancePoint){
         BallWorld ballworld = new BallWorld(250,250);
        TGPoint tgpoint = new TGPoint (0,0); 
        BallBot ballbot = new BallBot (ballworld,tgpoint,0,10);
        for(int b =0; b<ballBotArray.length; b++){
            if (!(ballBotArray[b]==null)){
                if (ballbot.getPoint()> 2*ballbot.getRadius())
                return false;
            }else{
                return true;
        }
        }
    }
    

    public static void a2() {
        Activity3 thisClass = new  Activity3();
        int freeballBotArray[];
        int freeBallBotIndex;
        BallBot[] ballBotArray = new BallBot[10];
        TGPoint findFreeBallBotIndex = new TGPoint();
        BallWorld ballworld = new BallWorld(250,250);
        TGPoint tgpoint = new TGPoint (0,0); 

        double x=0;
        BallBot currBallBot;

        while (true){
            if (thisClass.findFreeBallBotIndex(ballBotArray) < ballBotArray.length){
                int freeballbotindex = thisClass.findFreeBallBotIndex(ballBotArray);
                ballBotArray[thisClass.findFreeBallBotIndex(ballBotArray)]= new BallBot(ballworld,tgpoint,0,10);
                System.out.println("what we care about: "+freeballbotindex);

            }
            for(int b =0; b<thisClass.findFreeBallBotIndex(ballBotArray); b++) {
                //System.out.println("hi");
                currBallBot = ballBotArray[b];
                System.out.println(ballworld);
                System.out.println("currBallBot: "+currBallBot);
                if (!(currBallBot==null)){
                    if  (currBallBot.canMoveForward(ballworld)){
                        currBallBot.moveForward();
                    }else{
                        x = Math.random()*360;
                        currBallBot.setHeading(x);

                    }
                }
            }
        }
    }
}
